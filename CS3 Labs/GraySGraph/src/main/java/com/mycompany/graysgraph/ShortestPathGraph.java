// Sean Gray
// Period 6
// ShortestPathGraph.java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysgraph;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author seanp
 */
public class ShortestPathGraph {
    
    private final HashMap<Character, Integer> indexMap;
    private final Character[] nodes;
    private final boolean[][] edges;
    private boolean[][] checked;
    
    public ShortestPathGraph(String connections) {
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
    
    public int shortestPath(String one, String two) {
        // Make chars from the String paramters
        char source = one.charAt(0);
        char target = two.charAt(0);
        
        // Check if there is a direct path
        if (edges[indexMap.get(one.charAt(0))][indexMap.get(two.charAt(0))]) {
            return 1;
        }
        if (one.charAt(0) == two.charAt(0)) {
            return 0;
        }
        
        int numNodes = nodes.length;
        // Re-Initialize checked array to set all values to false
        checked = new boolean[numNodes][numNodes];
        
        // Implement Dijkstra's Algorithm using a PriorityQueue
        PriorityQueue<Vertex> pq = new PriorityQueue<>(new VertexComparator());
        
        // Add the source node to the PriorityQueue as a Vertex
        pq.add(new Vertex(source, indexMap.get(source), 0));
        
        // Iterate through all paths from the source
        while (!pq.isEmpty()) {
            // Take the first Vertex (least distance) out of the PriorityQueue
            Vertex leastDist = pq.poll();
            int idx = leastDist.index;
            int dist = leastDist.dist;
            
            // Return the current distance if the current Vertex is the target
            if (leastDist.value == target) {
                return dist;
            }
            
            // Add every neighbour of the current Vertex to the PriorityQueue
            for (int i = 0; i < numNodes; i++) {
                if (edges[idx][i] && !checked[idx][i]) {
                    checked[idx][i] = true;
                    checked[i][idx] = true;
                    pq.add(new Vertex(nodes[i], i, dist + 1));
                }
            }
        }
        
        // Return -1 if no path was found
        return -1;
    }
    
    
    
}
