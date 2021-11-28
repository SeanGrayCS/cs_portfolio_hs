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
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VLinkedList linkedList = new VLinkedList(); // Instantiate VLinkedList.
        // Current List: null
        linkedList.add(246); // Add VNode with value = 246 at the beginning.
        // Current List: 246 --> null
        linkedList.add(4); // Add VNode with value = 4 at the beginning.
        // Current List: 4 --> 246 --> null
        linkedList.add(2); // Add VNode with value = 2 at the beginning.
        // Current List: 2 --> 4 --> 246 --> null
        linkedList.add(7); // Add VNode with value = 7 at the beginning.
        // Current List: 7 --> 2 --> 4 --> 246 --> null
        linkedList.add(1); // Add VNode with value = 1 at the beginning.
        // Current List: 1 --> 7 --> 2 --> 4 --> 246 --> null
        linkedList.add(0); // Add VNode with value = 0 at the beginning.
        // Current List: 0 --> 1 --> 7 --> 2 --> 4 --> 246 --> null
        linkedList.delete(7); // Delete the first VNode with value == 7.
        // Current List: 0 --> 1 --> 2 --> 4 --> 246 --> null
        linkedList.remove(linkedList.size() - 1); // Remove VNode at the last index (index 4 in this case).
        // Current List: 0 --> 1 --> 2 --> 4 --> null
        linkedList.insert(3, 3); // Insert VNode with value = 3 at index 3.
        // Current List: 0 --> 1 --> 2 --> 3 --> 4 --> null
        
        // Print the entire linkedList.
        System.out.print("Linked List of Size " + linkedList.size() +
                " and head value equal to " + linkedList.head().getValue() + ":\n");
        System.out.print(linkedList + "\n\n");
        
        VLinkedList linkedListEnd = new VLinkedList(0); // Instantiate VLinkedList with head value = 0.
        // Current List: 0 --> null
        linkedListEnd.addEnd(2); // Add VNode with value = 2 at the end.
        // Current List: 0 --> 2 --> null
        linkedListEnd.addEnd(7); // Add VNode with value = 7 at the end.
        // Current List: 0 --> 2 --> 7 --> null
        linkedListEnd.addEnd(3); // Add VNode with value = 3 at the end.
        // Current List: 0 --> 2 --> 7 --> 3 --> null
        linkedListEnd.addEnd(4); // Add VNode with value = 4 at the end.
        // Current List: 0 --> 2 --> 7 --> 3 --> 4 --> null
        linkedListEnd.addEnd(246); // Add VNode with value = 246 at the end.
        // Current List: 0 --> 2 --> 7 --> 3 --> 4 --> 246 --> null
        linkedListEnd.insert(1, 1); // Insert VNode with value = 1 at index 1 .
        // Current List: 0 --> 1 --> 2 --> 7 --> 3 --> 4 --> 246 --> null
        linkedListEnd.remove(linkedListEnd.size() - 1); // Remove VNode at the last index (index 6 in this case).
        // Current List: 0 --> 1 --> 2 --> 7 --> 3 --> 4 --> null
        linkedListEnd.delete(7); // Delete the first VNode with value == 7.
        // Current List: 0 --> 1 --> 2 --> 3 --> 4 --> null
        
        // Print the entire linkedListEnd.
        System.out.print("Linked List of Size " + linkedListEnd.size() +
                " and head value equal to " + linkedListEnd.head().getValue() + ":\n");
        System.out.print(linkedListEnd);
    }
    
}
