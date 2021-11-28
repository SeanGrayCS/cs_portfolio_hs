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
public class GraySVLinkedList {
    private VNode head;
    
    public GraySVLinkedList() {
        head = null;
    }
    public GraySVLinkedList(int headVal) {
        head = new VNode(headVal);
    }
    
    public int get(int index) {
        VNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }
    
    public VNode head() {
        return head;
    }
    
    public void remove(int index) {
        VNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }
    
    public void delete(int value) {
        VNode current = head;
        while (current.getNext().getValue() != value) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }
    
    public void addEnd(int value) {
        if (head != null) {
            VNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new VNode(value));
        } else {
            head = new VNode(value);
        }
    }
    
    public void add(int value) {
        head = new VNode(value, head);
    }
    
    public void insert(int index, int value) {
        VNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        current.setNext(new VNode(value, current.getNext()));
    }
    
    public int size() {
        int size = 1;
        VNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }
    
    @Override
    public String toString() {
        String output = "[";
        VNode current = head;
        while (current != null) {
            output += current.getValue() + ", ";
            current = current.getNext();
        }
        return output.substring(0, output.length() - 2) + "]";
    }
}
