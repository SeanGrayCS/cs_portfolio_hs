// Sean Gray
// Period 6
// ShortestPathMaze.java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysgraph;

/**
 *
 * @author seanp
 */
public class ShortestPathMaze {
    
    private final int[][] mat;
    private int shortest;
    
    private final String[][] matStr;
    
    public ShortestPathMaze() {
        this.mat = new int[0][0];
        this.shortest = 0;
        
        this.matStr = new String[0][0];
    }
    
    public ShortestPathMaze(int[][] mat) {
        this.mat = mat;
        this.shortest = -1;
        
        this.matStr = new String[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                matStr[i][j] = "" + mat[i][j];
            }
        }
    }
    
    public void checkForExitPath(int r, int c, int path) {
        // If out of bounds, exit recursive call
        if (r < 0 || c < 0 || r > mat.length - 1 || c > mat.length - 1) {
            return;
        }
        // If not on a path, exit recursive call
        if (mat[r][c] != 1) {
            return;
        }
        // If on the exit, check if this path is the shortest so far
        if (c == mat.length - 1) {
            // If this path is the shortest so far, save it as such
            if (shortest == -1 || shortest > path) {
                shortest = path;
                // Mark our path
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat.length; j++) {
                        int val = mat[i][j];
                        if (val == -1) {
                            matStr[i][j] = "P";
                        } else {
                            matStr[i][j] = "" + val;
                        }
                    }
                }
            }
        }
        // Leave a bread crumb
        mat[r][c] = -1;
        // Check all directions that won't exit the maze
        checkForExitPath(r + 1, c, path + 1);
        checkForExitPath(r, c + 1, path + 1);
        checkForExitPath(r - 1, c, path + 1);
        checkForExitPath(r, c - 1, path + 1);
        // Pick up the bread crumb
        mat[r][c] = 1;
    }
    
    public int getShortestPath() {
        return shortest;
    }
    
    @Override
    public String toString() {
        String output = "";
        for (String[] row : matStr) {
            for (String val : row) {
                output += val + " ";
            }
            output += "\n";
        }
        return output;
    }
    
}
