/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysviperlinkedlists;

/**
 *
 * @author seanp
 */
public class VNode {
    private int value;
    private VNode next;
    
    public VNode() {
        value = 0;
        next = null;
    }
    public VNode(int val) {
        value = val;
        next = null;
    }
    public VNode(int val, VNode nxt) {
        value = val;
        next = nxt;
    }
    
    public int getValue() {
        return value;
    }
    public VNode getNext() {
        return next;
    }
    
    public void setValue(int val) {
        value = val;
    }
    public void setNext(VNode nxt) {
        next = nxt;
    }
}
