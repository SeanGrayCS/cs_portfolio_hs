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
public class ShortestPathMazeRunner {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws java.io.FileNotFoundException {
        
        Scanner dat = new Scanner(new java.io.File("DAT/maze2.dat"));
        
        while(dat.hasNextLine()) {
            int n = Integer.parseInt(dat.nextLine());
            int[][] mazeMat = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] row = dat.nextLine().split(" ");
                for (int j = 0; j < n; j++) {
                    mazeMat[i][j] = Integer.parseInt(row[j]);
                }
            }
            
            ShortestPathMaze maze = new ShortestPathMaze(mazeMat);
            maze.checkForExitPath(0, 0, 1);
            int shortest = maze.getShortestPath();
            System.out.print(maze);
            System.out.print((shortest != -1 ? "shortest path of " + shortest : "no path") + "\n\n");
        }
        
    }
    
}
