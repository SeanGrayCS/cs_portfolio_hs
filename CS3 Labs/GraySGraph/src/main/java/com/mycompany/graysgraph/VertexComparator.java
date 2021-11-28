/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysgraph;

import java.util.Comparator;

/**
 *
 * @author seanp
 */
public class VertexComparator implements Comparator<Vertex> {
    
    @Override
    public int compare(Vertex v1, Vertex v2) {
        if (v1.dist < v2.dist) {
            return -1;
        }
        if (v1.dist > v2.dist) {
            return 1;
        }
        return 0;
    }
    
}
