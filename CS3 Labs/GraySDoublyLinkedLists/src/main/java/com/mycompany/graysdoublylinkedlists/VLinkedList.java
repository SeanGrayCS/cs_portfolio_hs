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
public class VLinkedList {
    
    private VNode head;
    
    public VLinkedList() {
        head = null;
    }
    
    public VLinkedList(VLinkedList copy) {
        head = copy.head;
    }
    
    public void add(int value) {
        VNode newHead = new VNode(value, null, head);
        if (head != null) {
            head.setPrevious(newHead);
        }
        head = newHead;
    }
    
    public void deleteOdd() {
        VNode current = head;
        while (current != null) {
            if (current.getValue() % 2 == 1) {
                if (current.getPrevious() == null && current.getNext() == null) {
                    head = null;
                    return;
                }
                if (current.getPrevious() == null) {
                    current.getNext().setPrevious(null);
                    head = current.getNext();
                } else if (current.getNext() == null) {
                    current.getPrevious().setNext(null);
                } else {
                    current.getNext().setPrevious(current.getPrevious());
                    current.getPrevious().setNext(current.getNext());
                }
            }
            current = current.getNext();
        }
    }
    
    public int size() {
        int size = 0;
        VNode current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
    
    @Override
    public String toString() {
        if (head == null) {
            return null;
        }
        String string = "";
        VNode current = head;
        while (current != null) {
            string += current.getValue() + " <--> ";
            current = current.getNext();
        }
        
        return string.substring(0, string.length() - 6);
    }
    
}
