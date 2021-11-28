import java.util.Scanner;
import static java.lang.System.out;

import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            String sStr = in.next();
            String[] s = sStr.split("");
            out.print("Case #" + (i+1) + ": ");
            
            String a = "";
            boolean shuffledExists = false;
            
            // Determine a shuffled anagram of s
            int len = s.length;
            HashMap<String, Integer> letMap = new HashMap<>();
            ArrayList<String> sSorted = new ArrayList<>();
            
            int maxValue = 1;
            for (int j = 0; j < len; j++) {
                String let = s[j];
                sSorted.add(let);
                if (letMap.containsKey(let)) {
                    int val = letMap.get(let) + 1;
                    letMap.put(let, val);
                    if (val > maxValue) {
                        maxValue = val;
                    }
                } else {
                    letMap.put(let, 1);
                }
            }
            
            if (maxValue > (len / 2)) {
                out.print("IMPOSSIBLE");
                if (i != (n-1)) {
                    out.print("\n");
                }
                continue;
            }
            
            java.util.Collections.sort(sSorted);
            
            ArrayList<String> sSwap = new ArrayList<>(sSorted);

            for (int j = len/2; j < len; j++) {
                sSwap.add(0, sSorted.get(j));
                sSwap.remove(sSwap.size()-1);
            }
	    for (String letter : sSwap) {
		System.out.println(letter);
	    }
            
            HashMap<String, Integer> usedMap = new HashMap<>();
            String[] aArr = new String[len];
            
            for (int j = 0; j < len; j++) {
                String valLet = sSwap.get(j);
                String idxLet = sSorted.get(j);
		out.print(" " + valLet + " " + idxLet + " ");
                if (usedMap.containsKey(idxLet)) {
                    int prevIdx = usedMap.get(idxLet);
                    int idx = sStr.substring(prevIdx-1).indexOf(idxLet);
                    aArr[idx] = valLet;
                    usedMap.put(valLet, idx);
                }
                int idx = sStr.indexOf(idxLet);
                aArr[idx] = valLet;
                usedMap.put(valLet, idx);
            }
            
            for (String letter : aArr) {
                a += letter;
            }
            
            out.print(a);
            if (i != (n-1)) {
                out.print("\n");
            }
        }
        
    }
    
}