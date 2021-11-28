// Compile using 'javac -cp ./Classes/jsoup-1.13.1.jar -d . ./WebScraper.java'

import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScraper extends JPanel {
	
	private boolean DEBUG = false;
	
	public WebScraper(String[] columnNames, String[][] data) {
		super(new GridLayout(1,0));

		final JTable table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);

		if (DEBUG) {
      			table.addMouseListener(new MouseAdapter() {
      				public void mouseClicked(MouseEvent e) {
      					printDebugData(table);
	       			}
     			});
       		}
		
		//Create the scroll pane and add the table to it.
       		JScrollPane scrollPane = new JScrollPane(table);

       		//Add the scroll pane to this panel.
       		add(scrollPane);
	}

	private void printDebugData(JTable table) {
        	int numRows = table.getRowCount();
        	int numCols = table.getColumnCount();
        	javax.swing.table.TableModel model = table.getModel();
 
        	System.out.println("Value of data: ");
        	for (int i=0; i < numRows; i++) {
            		System.out.print("    row " + i + ":");
            		for (int j=0; j < numCols; j++) {
                		System.out.print("  " + model.getValueAt(i, j));
            		}
            		System.out.println();
        	}
        	System.out.println("--------------------------");
    	}

	/**
     	* Create the GUI and show it.  For thread safety,
     	* this method should be invoked from the
     	* event-dispatching thread.
     	*/
    	private static void createAndShowGUI(String[] columnNames, String[][] data) {
        	//Create and set up the window.
        	JFrame frame = new JFrame("HomebrewRaces");
        	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	
 	        //Create and set up the content pane.
 	        WebScraper newContentPane = new WebScraper(columnNames, data);
 	        newContentPane.setOpaque(true); //content panes must be opaque
 	        frame.setContentPane(newContentPane);
 	
 	        //Display the window.
 	        frame.pack();
 	        frame.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.dandwiki.com/wiki/5e_Races_by_Type").get();
			HashMap<String, String> traitsMap = new HashMap<String, String>();
			HashMap<String, String> asiMap = new HashMap<String, String>();
			ArrayList<String> names = new ArrayList<String>();
			
			for (int i = 3; i < 30; i += 2) {
				System.out.println("Table: " + (i / 2));
				Element table = doc.body().child(0).child(0).child(0).child(2).child(3).child(0).child(i).child(1);
				int numChildren = table.childNodeSize();				

				for (int j = 1; j < (numChildren / 2) + 1; j++) {
					try {
						System.out.println("Item: " + j);
						Element item = table.child(j).child(0).child(0);
						String href = item.attr("abs:href");
						String name = item.text();
						String nameAKA = name;
						if (!traitsMap.containsKey(name)) {
							if (name.contains(",")) {
								nameAKA = name.substring(0, name.indexOf(","));
							}
							Document inPage = Jsoup.connect(href).get();
							int k = 3;
							System.out.println(name);
							while (true) {
								if (k >= (inPage.body().child(0).child(0).child(0).child(2).child(3).child(0).childNodeSize() / 2)) {
									break;
								}
								Element header = inPage.body().child(0).child(0).child(0).child(2).child(3).child(0).child(k);
								if (header.childNodeSize() > 1) {
									String headerText = header.child(0).text();
									String match = nameAKA + " Traits";
									if (headerText.equals(match)) {
										int traitsStart = k + 1;
										Element traits = inPage.body().child(0).child(0).child(0).child(2).child(3).child(0);
										if (traits.child(traitsStart).text().contains("Design Note:")) {
											traitsStart = k + 2;
										}
										names.add(name);
										String traitsText = traits.child(traitsStart).text();
										for (int f = traitsStart + 1; f < traits.childNodeSize() / 2; f++) {
											if (traits.child(f).childNodeSize() > 1 && traits.child(f).child(0).className().equals("mw-headline")) {
												break;
											}
											traitsText = traitsText + traits.child(f).text();
										}
										int asiIdx = traitsText.indexOf("Ability Score Increase");
										int ageIdx = traitsText.indexOf("Age.");
										if (ageIdx == -1) {
											ageIdx = traitsText.indexOf("Blood Connoisseur.");
										}
										String asi = traitsText.substring(asiIdx, ageIdx);
										String otherTraits = traitsText.substring(ageIdx);
										traitsMap.put(name, otherTraits);
										asiMap.put(name, asi);
										break;
									}
								} else {
									String headerText = header.text();
									String match = nameAKA + " Traits";
									if (headerText.equals(match)) {
										int traitsStart = k + 1;
										Element traits = inPage.body().child(0).child(0).child(0).child(2).child(3).child(0);
										if (traits.child(traitsStart).text().contains("Design Note:")) {
											traitsStart = k + 2;
										}
										names.add(name);
										String traitsText = traits.child(traitsStart).text();
										for (int f = traitsStart + 1; f < traits.childNodeSize() / 2; f++) {
											if (traits.child(f).childNodeSize() > 1 && traits.child(f).child(0).className().equals("mw-headline")) {
												break;
											}
											traitsText = traitsText + traits.child(f).text();
										}
										int asiIdx = traitsText.indexOf("Ability Score Increase");
										int ageIdx = traitsText.indexOf("Age.");
										if (ageIdx == -1) {
											ageIdx = traitsText.indexOf("Blood Connoisseur.");
										}
										String asi = traitsText.substring(asiIdx, ageIdx);
										String otherTraits = traitsText.substring(ageIdx);
										traitsMap.put(name, otherTraits);
										asiMap.put(name, asi);
										break;
									}
								}	
								k++;
							}
						}	
						System.out.print("\n");
					} catch (IOException x) {
						x.printStackTrace();
					}
				}
			}
			
			String[] columnNames = new String[3];
			columnNames[0] = "Names";
			columnNames[1] = "ASI's";
			columnNames[2] = "Traits";

			String[][] data = new String[names.size()][3];
			for (int i = 0; i < names.size(); i++) {
				String name = names.get(i);
				String raceTrait = traitsMap.get(name);
				String asi = asiMap.get(name);
				data[i][0] = name;
				data[i][1] = asi;
				data[i][2] = raceTrait;
			}

			//Store data in a csv file
			FileWriter csvWriter = new FileWriter("D&D5eRaces.csv");
			csvWriter.append("Names");
			csvWriter.append(",");
			csvWriter.append("ASI's");
			csvWriter.append(",");
			csvWriter.append("Traits");
			csvWriter.append("\n");
			
			for (String[] row : data) {
				csvWriter.append(String.join(",", row));
				csvWriter.append("\n");
			}
			
			csvWriter.flush();
			csvWriter.close();

			//GUI Creation

			//Schedule a job for the event-dispatching thread:
        		//creating and showing this application's GUI.
        		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            			public void run() {
                			createAndShowGUI(columnNames, data);
            			}
        		});

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}