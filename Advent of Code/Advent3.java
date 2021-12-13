import java.io.*;
import java.util.*;

public class Advent3 {
  private static Scanner in;

  public static void main (String [] args) throws IOException {

    in = new Scanner(new File("Advent3.in"));

    int pos = 0, depthP1 = 0, depthP2 = 0, aim = 0;

    while (in.hasNext()) {
      String dir = in.next();
      int dist = in.nextInt();

      if (dir.equals("up")) {
	depthP1 -= dist;
	aim -= dist;
      } else if (dir.equals("down")) {
	depthP1 += dist;
	aim += dist;
      } else {
	pos += dist;
	depthP2 += (aim*dist);
      }
    }

    int solP1 = pos*depthP1;
    int solP2 = pos*depthP2;

    System.out.println(solP1);
    System.out.println(solP2);

  }

}