// Sean Gray
// Period 6
// Maze.java

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
public class Maze {
    
    private final int[][] mat;
    
    public Maze() {
        this.mat = new int[0][0];
    }
    
    public Maze(int[][] mat) {
        this.mat = mat;
    }
    
    public boolean checkForExitPath(int r, int c, int path) {
        // If out of bounds, exit recursive call
        if (r < 0 || c < 0 || r > mat.length - 1 || c > mat.length - 1) {
            return false;
        }
        // If not on a path, exit recursive call
        if (mat[r][c] != 1) {
            return false;
        }
        // If on the exit, return true
        if (c == mat.length - 1) {
            return true;
        }
        // Leave a bread crumb
        mat[r][c] = -1;
        // Check all directions. If one is true, return true
        return (checkForExitPath(r+1, c, path+1) || checkForExitPath(r, c+1, path+1)
                || checkForExitPath(r-1, c, path+1) || checkForExitPath(r, c-1, path+1));
    }
    
    @Override
    public String toString() {
        String output = "";
        for (int[] row : mat) {
            for (int val : row) {
                output += val + " ";
            }
            output += "\n";
        }
        return output;
    }
    
}
