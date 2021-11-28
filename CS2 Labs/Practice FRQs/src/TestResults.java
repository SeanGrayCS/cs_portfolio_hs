import java.util.ArrayList;
import java.util.TreeMap;

public class TestResults {

	private ArrayList<StudentAnswerSheet> sheets;
	
	public String HighestScoringStudent (ArrayList<String> key)
	{
		TreeMap<Double, String> scores = new TreeMap<Double, String>();
		for (int i = 0; i < sheets.size(); i++)
		{
			double score = sheets.get(i).getScore(key);
			String name = sheets.get(i).getName();
			scores.put(score, name);
		}
		return scores.get(scores.firstKey());
	}
}
