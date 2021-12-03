import java.util.*;
import java.io.*;

public class Bojing {
    public static void main(String [] args) throws IOException{
        String name = "bojing";
        Scanner in = new Scanner(new File("./jud/" + name + ".dat"));
        TreeMap<Integer, TreeSet<String>> map = new TreeMap<>();

        // CompareStrings comp = new CompareStrings();
        // ArrayList<String> ans = new ArrayList<String>();
        while(in.hasNextLine()){
            String line = in.nextLine();
            Scanner lineScan = new Scanner(line);
            while(lineScan.hasNext()){
                String cur = lineScan.next();
                int len = cur.length();
                TreeSet<String> prev = map.get(len);
                if (prev == null){
                    prev = new TreeSet<>();
                }
                prev.add(cur);
                map.put(len, prev);
            }
            
        }
        // Collections.sort(ans, comp);
        for (int key : map.keySet()){
            TreeSet<String> set = map.get(key);
            String ans = "";
            for (String s : set){
                ans += s + " ";
            }
            System.out.println(ans.trim());
        }
    }

    // private static class CompareStrings implements Comparator<String>{
    //     public int compare(String s1, String s2){
    //         if (s1.length() < s2.length()){
    //             return -1;
    //         }
    //         if (s2.length() < s1.length())
    //         {
    //             return 1;
    //         }
    //         return s1.compareTo(s2);
    //     }
    // }
}
