import java.util.*;

public class Playlist {

	private ArrayList<Song> songList;
	
	public Playlist () {
		songList = new ArrayList<Song>();
	}
	
	public void addSong(Song song) {
		songList.add(song);
	}
	
	public Song getNextSong()
	{
		int bestLength = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 0; i < songList.size(); i++) {
			if (!songList.get(i).recentlyPlayed() && (songList.get(i).getLength() > bestLength)) {
				bestLength = songList.get(i).getLength();
				idx = i;
			}
		}
		songList.get(idx).setPlayedToday();
		return songList.get(idx);
	}
	
	public void removeLong()
	{
		int length = getNextSong().getLength();
		for (int i = songList.size() - 1; i >= 0; i--) {
			if (songList.get(i).getLength() >= (length - 30) && songList.get(i).getLength() <= (length + 30)) {
				songList.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Song song = new Song(200);
		Playlist list = new Playlist();
		list.addSong(song);
		song = new Song(170);
		list.addSong(song);
		song = new Song(169);
		list.addSong(song);
		song = new Song(230);
		song.setPlayedToday();
		list.addSong(song);
		song = new Song(231);
		song.setPlayedToday();
		list.addSong(song);
		song = new Song(210);
		song.setPlayedToday();
		list.addSong(song);
		song = new Song(190);
		list.addSong(song);
		song = new Song(400);
		list.addSong(song);
		System.out.println(list.getNextSong().getLength());
		list.removeLong();
	}

}
