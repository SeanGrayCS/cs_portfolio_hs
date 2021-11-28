import java.io.*;
import java.util.*;
public class EpisodeRenamer {

	public static void main (String[] args) throws FileNotFoundException {

		Scanner kb = new Scanner(System.in);
		System.out.println("Put the start of the format from the start to before the episode #: ");
		String fileFormatStart = kb.nextLine();
		System.out.println("Put the end of the format from the episode # to the end: ");
		String fileFormatEnd = kb.nextLine();
		System.out.println("Put the number of episodes: ");
		int numEpisodes = kb.nextInt();
		for (int i = 0; i < numEpisodes; i++) {
			String fileName = fileFormatStart + (i + 1) + fileFormatEnd;
			File file = new File(fileName);
			if (file.exists()) {
				System.out.println("Episode " + (i + 1) + " exists!");
			}
			File newFile = new File("Episode " + (i + 1) + ".mp4");
			file.renameTo(newFile);
			fileName = fileFormatStart + "0" + (i + 1) + fileFormatEnd;
			file = new File(fileName);
			if (file.exists()) {
				System.out.println("Episode " + (i + 1) + " exists!");
			}
			file.renameTo(newFile);
		}

	}

}