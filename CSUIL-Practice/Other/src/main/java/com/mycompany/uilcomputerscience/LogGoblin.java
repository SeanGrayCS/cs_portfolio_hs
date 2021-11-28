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
public class LogGoblin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        while (in.hasNextLine()) {
            String[] words = in.nextLine().split(" ");
            if (map.containsKey(words[0])) {
                if (map.get(words[0]).equals(words[2])) {
                    map.remove(words[0]);
                } else {
                    System.out.println(words[0] + " is the impostor");
                    break;
                }
            } else {
                map.put(words[0], words[2]);
            }
        }
    }
    
}
