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
public class Vertex {
    
    public char value;
    public int index;
    public int dist;
    //public Vertex prev;
    
    public Vertex(char value, int index) {
        this.value = value;
        this.index = index;
        dist = Integer.MAX_VALUE;
        //prev = null;
    }
    
    public Vertex(char value, int index, int dist) {
        this.value = value;
        this.index = index;
        this.dist = dist;
        //prev = null;
    }
    
    // Use if the path is needed
    public Vertex(char value, int index, int dist, Vertex prev) {
        this.value = value;
        this.index = index;
        this.dist = dist;
        //this.prev = prev;
    }
    
    @Override
    public String toString() {
        // Use if path is needed
        //if (prev == null) {
            //return "" + value;
        //}
        //return prev.toString() + " -> " + value;
        
        return "" + value;
    }
    
}
