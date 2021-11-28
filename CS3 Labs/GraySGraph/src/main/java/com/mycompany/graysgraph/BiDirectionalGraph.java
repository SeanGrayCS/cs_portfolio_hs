// Sean Gray
// Period 6
// BiDirectionalGraph.java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysgraph;

import java.util.HashMap;

/**
 *
 * @author seanp
 */
public class BiDirectionalGraph {
    
    private final HashMap<String, Integer> indexMap;
    private final String[] nodes;
    private final boolean[][] edges;
    private boolean[][] checked;
    
    public BiDirectionalGraph(String connections) {
        // Parse the String of connections into a HashMap
        String[] edgeArr = connections.split(" ");
        indexMap = new HashMap<>();
        for (String edge : edgeArr) {
            indexMap.put(edge, 0);
        }
        int numNodes = indexMap.size();
        
        // Initialize the nodes array and fill it with the nodes
        nodes = indexMap.keySet().toArray(new String[numNodes]);
        for (int i = 0; i < nodes.length; i++) {
            indexMap.put(nodes[i], i);
        }
        
        // Initialize the edges array and fill it with the edges
        edges = new boolean[numNodes][numNodes];
        for (int i = 0; i < edgeArr.length; i+=2) {
            int idx1 = indexMap.get(edgeArr[i]);
            int idx2 = indexMap.get(edgeArr[i+1]);
            edges[idx1][idx2] = edges[idx2][idx1] = true;
        }
        
        // Initialize the checked array
        checked = new boolean[numNodes][numNodes];
    }
    
    public boolean check(String one, String two) {
        // Check if there is a direct path or if they are equal
        if (edges[indexMap.get(one)][indexMap.get(two)]
                || one.equals(two)) {
            return true;
        }
        int numNodes = nodes.length;
        // Re-Initialize checked array to set all values to false
        checked = new boolean[numNodes][numNodes];
        // Recursively check all paths from one until a path from one to two is
        // found or all paths have been checked
        return checkHelp(one, two);  
    }
    
    public boolean checkHelp(String one, String two) {
        int idx1 = indexMap.get(one);
        int idx2 = indexMap.get(two);
        // Base Case: Is there a direct path from one to two or are they equal
        if (edges[idx1][idx2] || one.equals(two)) {
            return true;
        }
        
        // Iterate through all possible paths from one
        for (int i = 0; i < nodes.length; i++) {
            // Don't check one's path with itself
            if (idx1 == i) {
                continue;
            }
            // Check the current path if it has not been checked before
            if (edges[idx1][i] && !checked[idx1][i]) {
                checked[idx1][i] = true;
                checked[i][idx1] = true;
                if (checkHelp(nodes[i], two)) {
                    return true;
                }
            }
        }
        // If no paths from one lead to two, return false
        return false;
    }
    
}
