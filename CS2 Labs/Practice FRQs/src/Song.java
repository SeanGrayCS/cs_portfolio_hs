import java.util.*;

public class Song {
	
	private int length;
	private boolean recentlyPlayed;
	
	public Song (int l) {
		length = l;
		recentlyPlayed = false;
	}
	
	public int getLength () {
		return length;
	}
	
	public boolean recentlyPlayed () {
		return recentlyPlayed;
	}
	
	public void setPlayedToday () {
		recentlyPlayed = true;
	}
	
	public static void main(String[] args) {
		
	}

}
