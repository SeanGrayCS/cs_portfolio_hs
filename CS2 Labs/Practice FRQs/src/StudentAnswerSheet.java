import java.util.ArrayList;

public class StudentAnswerSheet {
	private ArrayList<String> answers;
	
	public StudentAnswerSheet(ArrayList<String> a)
	{
		answers = a;
	}
	public double getScore (ArrayList<String> key)
	{
		double score = 0;
		for (int i = 0; i < key.size(); i++)
		{
			if (key.get(i).equals("?"))
			{
				continue;
			}
			if (answers.get(i).equals(key.get(i)))
			{
				score += 1.0;
			} else
			{
				score -= 0.25;
			}
		}
		return score;
	}
	
	public String getName()
	{
		return "";
	}
	
	public static void main (String[] args) {
		ArrayList<String> answers = new ArrayList<String>();
		answers.add("A");
		answers.add("C");
		answers.add("D");
		answers.add("E");
		answers.add("B");
		answers.add("E");
		StudentAnswerSheet stu = new StudentAnswerSheet(answers);
		ArrayList<String> key = new ArrayList<String>();
		key.add("A");
		key.add("B");
		key.add("D");
		key.add("E");
		key.add("A");
		key.add("?");
		System.out.println(stu.getScore(key));
	}
}
