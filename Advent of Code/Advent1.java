import java.io.*;
import java.util.*;

public class Advent1 {
  private static Scanner in;

  public static void main (String [] args) throws IOException {

    in = new Scanner(new File("Advent1.in"));

    int solP1 = 0, solP2 = 0;

    int prev = Integer.MAX_VALUE, prev2 = Integer.MAX_VALUE, prev3 = Integer.MAX_VALUE;
    while (in.hasNextInt()) {
      int cur = in.nextInt();

      if (cur > prev) {
	solP1++;
      }
      if (cur > prev3) {
	solP2++;
      }

      prev3 = prev2;
      prev2 = prev;
      prev = cur;
    }

    System.out.println(solP1);
    System.out.println(solP2);

  }

}