/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysbinarysearchtree;

/**
 *
 * @author seanp
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BSTree tree = new BSTree();
        tree.add(90);
        tree.add(80);
        tree.add(100);
        tree.add(70);
        tree.add(85);
        tree.add(98);
        tree.add(120);
        
        System.out.println("IN ORDER\n" + tree.inOrder());
        System.out.println("\nPRE ORDER\n" + tree.preOrder());
        System.out.println("\nPOST ORDER\n" + tree.postOrder());
        System.out.println("\nREVERSE ORDER\n" + tree.revOrder());
        System.out.println("\nTree height is " + tree.getHeight());
        System.out.println("Tree width is " + tree.getWidth());
        System.out.println("Number of leaves is " + tree.getNumLeaves());
        System.out.println("Number of nodes is " + tree.getNumNodes());
        System.out.println("Number of levels is " + tree.getNumLevels());
        System.out.println("Tree as a string\t" + tree);
        if (tree.isFull()) {
            System.out.println("The tree is full.");
        } else {
            System.out.println("The tree is not full.");
        }
        
    }
    
}
