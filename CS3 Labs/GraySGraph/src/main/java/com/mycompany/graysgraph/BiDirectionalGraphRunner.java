/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysgraph;

import java.util.Scanner;

/**
 *
 * @author seanp
 */
public class BiDirectionalGraphRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "5\n" +
                "JON BOB BOB SALLY SALLY SUE\n" +
                "JON SUE\n" +
                "JON BOB JON SUE SALLY BOB\n" +
                "SALLY SUE\n" +
                "JON BOB JON SUE FRED SALLY\n" +
                "SALLY SUE\n" +
                "JON BOB TIM CHUCK JON SUE FRED SALLY\n" +
                "SALLY CHUCK\n" +
                "JON BOB TIM CHUCK JON SUE FRED SALLY TIM FRED\n" +
                "SALLY CHUCK";
        
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String connections = in.nextLine();
            BiDirectionalGraph graph = new BiDirectionalGraph(connections);
            String checkPath = in.nextLine();
            String one = checkPath.split(" ")[0];
            String two = checkPath.split(" ")[1];
            System.out.println(one + " CONNECTS TO " + two + " == " +
                    (graph.check(one, two) ? "YAH" : "NAH" ));
        }
    }
    
}
