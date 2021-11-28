import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.ArrayList;

public class VBoxToCSV {

    public static void main(String[] args) throws IOException {

	String vboxIn = "DWA000331321110715420001.vbo";
	String csvOut = "DWA000331321110715420001.csv";

	BufferedReader br = new BufferedReader(new FileReader(vboxIn));
	BufferedWriter bw = new BufferedWriter(new FileWriter(csvOut));

	ArrayList<String> headers = new ArrayList<>();
	ArrayList<String[]> datas = new ArrayList<>();

	boolean header = false;
	boolean data = false;
	while (br.ready()) {
	    String line = br.readLine();
	    if (line.equals("")) {
		header = false;
		continue;
	    }

	    if (header) {
		headers.add(line);
		continue;
	    }

	    if (!data && line.contains("[header")) {
		header = true;
		continue;
	    }

	    if (!data && line.contains("[data")) {
		data = true;
		continue;
	    }

	    if (!data) {
		continue;
	    }

	    datas.add(line.split(" "));
	}

	String head = "";
	for (int i = 0; i < headers.size(); i++) {
	    head += headers.get(i) + ";";
	}
	bw.write(head.substring(0, head.length()-1));
	bw.newLine();

	for (int i = 0; i < datas.size(); i++) {
	    String line = "";
	    for (String val : datas.get(i)) {
		line += val + ";";
	    }
	    bw.write(line.substring(0, line.length()-1));
	    bw.newLine();
	}

	bw.close();

    }

}