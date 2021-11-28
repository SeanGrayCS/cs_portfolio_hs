/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysdoublylinkedlists;

/**
 *
 * @author seanp
 */
public class VNode {
    
    private int value;
    private VNode previous;
    private VNode next;
    
    public VNode(int val, VNode prev, VNode nxt) {
        value = val;
        previous = prev;
        next = nxt;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public VNode getPrevious() {
        return previous;
    }

    public void setPrevious(VNode previous) {
        this.previous = previous;
    }

    public VNode getNext() {
        return next;
    }

    public void setNext(VNode next) {
        this.next = next;
    }
    
}
