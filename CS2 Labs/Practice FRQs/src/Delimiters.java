import java.util.ArrayList;
public class Delimiters {

	private String openDel;
	private String closeDel;
	
	public Delimiters (String open, String close)
	{
		openDel = open;
		closeDel = close;
	}
	
	public ArrayList<String> getDelimitersList (String[] tokens)
	{
		ArrayList<String> delimitersList = new ArrayList<String>();
		for (String token : tokens)
		{
			if (token.equals("(") || token.equals(")") || (token.contains("<") && token.contains(">")))
			{
				delimitersList.add(token);
			}
		}
		return delimitersList;
	}
	
	public boolean isBalanced (ArrayList<String> delimiters)
	{
		boolean failed = false;
		for (int i = 0; i < delimiters.size(); i++)
		{
			String del = delimiters.get(i);
			if (del.contains("<"))
			{
				del = del.substring(1, del.length() - 1);
				delimiters.set(i, del);
			}
		}
		int openCount = 0;
		int closeCount = 0;
		for (int i = 0; i < delimiters.size(); i++)
		{
			if (failed)
			{
				break;
			}
			String del = delimiters.get(i);
			if (del.equals("(") || del.charAt(0) != '/')
			{
				openCount++;
			}
			else
			{
				closeCount++;
			}
			if (closeCount > openCount)
			{
				failed = true;
			}
		}
		if (openCount != closeCount)
		{
			failed = true;
		}
		return !failed;
	}
	
}
