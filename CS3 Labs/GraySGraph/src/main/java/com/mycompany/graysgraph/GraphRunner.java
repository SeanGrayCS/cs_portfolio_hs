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
public class GraphRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "9\n" +
                "CA XY RS YS ST TB AX BD RJ\n" +
                "CD\n" +
                "PQ QX AX BX CX DX EX FX GX AB BC CD DE AE CE FD TG\n" +
                "PT\n" +
                "AE EI IO OU BC CD DF FG\n" +
                "AG\n" +
                "HI HJ HK KL KM KN MO MP MQ\n" +
                "HQ\n" +
                "AB CD EF GH CB ED GF HI\n" +
                "AI\n" +
                "TV XY AZ XT JK KL LT JX MN TN JL NO OP PT NX\n" +
                "VZ\n" +
                "AB BC CD DE EF FG GH HI IJ JA AC FZ\n" +
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
            Graph graph = new Graph(connections);
            String checkPath = in.nextLine();
            String one = checkPath.split("")[0];
            String two = checkPath.split("")[1];
            System.out.println(one + " connects to " + two + " == " +
                    (graph.check(one, two) ? "yes" : "no" ));
        }
    }
    
}
