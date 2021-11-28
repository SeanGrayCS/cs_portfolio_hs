/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uilcomputerscience;

import java.util.Scanner;

/**
 *
 * @author seanp
 */
public class FtoR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double f = in.nextDouble();
        
        double r = f + 459.67;
        System.out.printf("%.2f", r);
    }
    
}
