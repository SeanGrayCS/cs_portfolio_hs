import java.util.ArrayList;

public class Stats {
	
	private ArrayList<ScoreInfo> scoreList;
	
	public boolean record (int score) {
		
		boolean newScore = true;
		
		for (int i = 0; i < scoreList.size(); i++) {
			if (scoreList.get(i).getScore() == score) {
				newScore = false;
				scoreList.get(i).increment();
			}
		}
		
		if(newScore) {
			ScoreInfo scoreInfo = new ScoreInfo(score);
			scoreList.add(0, scoreInfo);
		}
		
		return newScore;
		
	}
	
	public void recordScores (int[] stuScores) {
		
		for (int score : stuScores) {
			
			record(score);
			
		}
		
	}
	
}
