/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysqueuepalindrome;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author seanp
 */
public class QueuePalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("palinlist.dat"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String lineFormatted = "[";
            Queue<String> queue = new LinkedList<>();
            Stack<String> stack = new Stack<>();
            
            Scanner chopper = new Scanner(line);
            while (chopper.hasNext()) {
                String chunk = chopper.next();
                queue.add(chunk);
                stack.add(chunk);
                lineFormatted += chunk + ", ";
            }
            lineFormatted = lineFormatted.substring(0, lineFormatted.length() - 2) + "]";
        
            boolean isPalinlist = true;
            while (!queue.isEmpty()) {
                if (!queue.remove().equals(stack.pop())) {
                    isPalinlist = false;
                }
            }
            
            if (isPalinlist) {
                System.out.println(lineFormatted + " is a palinlist.");
            } else {
                System.out.println(lineFormatted + " is not a palinlist.");
            }
        }
    }
    
}
