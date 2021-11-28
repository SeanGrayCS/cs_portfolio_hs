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
public class ShortestPathGraphRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "9\n" +
                "CA XY RS YS ST TB AB BD RJ\n" +
                "CD\n" +
                "PQ QX AX BH CH DX EX FX GH AB BC CD DE AE CE FD TH\n" +
                "PT\n" +
                "AE EI IO OU BC CD DF FG\n" +
                "AG\n" +
                "HI HJ HK KQ KM KN MO MP MQ\n" +
                "HQ\n" +
                "AB CD EF GH CB ED GF HI\n" +
                "AI\n" +
                "TV XY AZ XT JK KL LT JX MN TN JL NO OP PT NX\n" +
                "VZ\n" +
                "AB BC CD DE EF FG GH HI IJ AE AC JZ FZ AZ\n" +
                "AZ\n" +
                "NO PQ RS TU OU RP AB CD EF GH AH CE NS FA GQ\n" +
                "DT\n" +
                "IX VX CX DX MX LX BY\n" +
                "IB";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String connections = in.nextLine();
            ShortestPathGraph graph = new ShortestPathGraph(connections);
            String checkPath = in.nextLine();
            String one = checkPath.split("")[0];
            String two = checkPath.split("")[1];
            int shortestPath = graph.shortestPath(one, two);
            System.out.println(one + " connects to " + two + " == " +
                    (shortestPath > -1 ? "yes in " + shortestPath + " steps" 
                            : "no" ));
        }
    }
    
}
