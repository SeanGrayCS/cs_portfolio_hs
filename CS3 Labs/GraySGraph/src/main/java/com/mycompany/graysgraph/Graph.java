// Sean Gray
// Period 6
// Graph.java

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
public class Graph {
    
    private final HashMap<Character, Integer> indexMap;
    private final Character[] nodes;
    private final boolean[][] edges;
    private boolean[][] checked;
    
    public Graph(String connections) {
        // Parse the String of connections into a HashMap
        String[] edgeArr = connections.split(" ");
        indexMap = new HashMap<>();
        for (String edge : edgeArr) {
            char node1 = edge.charAt(0);
            char node2 = edge.charAt(1);
            indexMap.put(node1, 0);
            indexMap.put(node2, 0);
        }
        int numNodes = indexMap.size();
        
        // Initialize the nodes array and fill it with the nodes
        nodes = indexMap.keySet().toArray(new Character[numNodes]);
        for (int i = 0; i < nodes.length; i++) {
            indexMap.put(nodes[i], i);
        }
        
        // Initialize the edges array and fill it with the edges
        edges = new boolean[numNodes][numNodes];
        for (String edge : edgeArr) {
            int idx1 = indexMap.get(edge.charAt(0));
            int idx2 = indexMap.get(edge.charAt(1));
            edges[idx1][idx2] = edges[idx2][idx1] = true;
        }
        
        // Initialize the checked array
        checked = new boolean[numNodes][numNodes];
    }
    
    public boolean check(String one, String two) {
        // Check if there is a direct path
        if (edges[indexMap.get(one.charAt(0))][indexMap.get(two.charAt(0))]
                || one.charAt(0) == two.charAt(0)) {
            return true;
        }
        int numNodes = nodes.length;
        // Re-Initialize checked array to set all values to false
        checked = new boolean[numNodes][numNodes];
        // Recursively check all paths from one until a path from one to two is
        // found or all paths have been checked
        return checkHelp(one.charAt(0), two.charAt(0));
    }
    
    public boolean checkHelp(char one, char two) {
        int idx1 = indexMap.get(one);
        int idx2 = indexMap.get(two);
        // Base Case: Is there a direct path from one to two or are they equal
        if (edges[idx1][idx2] || one == two) {
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
