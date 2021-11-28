/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uilcomputerscience;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author seanp
 */
public class UnidentifiedPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String player = in.next();
            HashMap<String, Integer> map = new HashMap<>();
            for (String letter : player.split("")) {
                if (map.get(letter) != null) {
                    map.put(letter, map.get(letter) + 1);
                } else {
                    map.put(letter, 1);
                }
            }
            int nVal = player.length();
            long nFact = 1;
            for (int j = 1; j <= nVal; j++) {
                nFact *= j;
            }
            long denom = 1;
            for (String key : map.keySet()) {
                for (int j = 1; j <= map.get(key); j++) {
                    denom *= j;
                }
            }
            System.out.println((nFact / denom) + " " + player);
        }
    }
    
}
