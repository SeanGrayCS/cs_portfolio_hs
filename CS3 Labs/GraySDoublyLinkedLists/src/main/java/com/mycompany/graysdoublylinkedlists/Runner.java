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
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VLinkedList llist = new VLinkedList();
        llist.add(7);
        llist.add(2);
        llist.add(1);
        llist.add(3);
        llist.add(4);
        System.out.println("Doubly Linked List of Size: " + llist.size() + "\n" + llist);
        llist.deleteOdd();
        System.out.println("\nDoubly Linked List after Deleting Odds:\nSize: " + llist.size() + "\n" + llist);
        
    }
    
}
