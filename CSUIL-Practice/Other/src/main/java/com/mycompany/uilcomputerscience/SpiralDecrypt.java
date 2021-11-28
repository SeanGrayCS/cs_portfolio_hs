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
public class SpiralDecrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String keyword = in.next();
        String[][] mat = new String[a][b];
        int totalLetters = a * b;
        while (keyword.length() < totalLetters) {
            keyword = keyword + keyword;
        }
        keyword = keyword.substring(0, totalLetters);
        int row = 0;
        int col = 0;
        int direction = 0; // 0 - right, 1 - down, 2 - left, 3 - up
        while (keyword.length() > 0) {
            mat[row][col] = keyword.substring(0, 1);
            keyword = keyword.substring(1);
            switch (direction) {
                case 0: {
                    if (col < b - 1 && mat[row][col + 1] == null) {
                        col++;
                        break;
                    } else {
                        direction++;
                    }
                }
                case 1: {
                    if (row < a - 1 && mat[row + 1][col] == null) {
                        row++;
                        break;
                    } else {
                        direction++;
                    }
                }
                case 2: {
                    if (col > 0 && mat[row][col - 1] == null) {
                        col--;
                        break;
                    } else {
                        direction++;
                    }
                }
                case 3: {
                    if (row > 0 && mat[row - 1][col] == null) {
                        row--;
                        break;
                    } else {
                        direction = 0;
                    }
                }
                default: {
                    if (col < b - 1 && mat[row][col + 1] == null) {
                        col++;
                    } else {
                        direction++;
                    }
                    break;
                }
            }
        }
        String out = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                out += mat[i][j] + " ";
            }
            out = out.substring(0, out.length() - 1) + "\n";
        }
        System.out.print(out);
    }
    
}
