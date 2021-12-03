import java.util.*;
import java.io.*;

public class Vlad {
    public static void main(String[] args) throws Exception {
        String file = "vlad";

        Scanner scanner = new Scanner(new File("./jud/" + file + ".dat"));

        PriorityQueue<Name> pq = new PriorityQueue<>();

        while (scanner.hasNextLine()) {
            String[] nameArr = scanner.nextLine().split(" ");

            String last = nameArr[1].substring(0, nameArr[1].length()-1);
            String first = nameArr[2];
            String middle = (nameArr.length > 3) ? "" + nameArr[3].charAt(0) : "";

            Name name = new Name(first, last, middle);

            pq.offer(name);
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

class Name implements Comparable<Name> {
    public String first;
    public String last;
    public String middle;
    public String midPlace;

    public Name(String first, String last, String middle){
        this.first = first;
        this.last = last;
        this.middle = middle;
        if (middle.length() == 0) {
            midPlace = "A";
        } else {
            midPlace = middle.toLowerCase();
        }
    }

    public int compareTo(Name o) {
        int cmp = last.toLowerCase().compareTo(o.last.toLowerCase());
        if (cmp == 0) {
            cmp = first.toLowerCase().compareTo(o.first.toLowerCase());
            if (cmp == 0) {
                cmp = midPlace.compareTo(o.midPlace);
            }
        }
        return cmp;
    }

    public String toString() {
        String str = first + " " + middle + " " + last;

        return str;
    }

}
