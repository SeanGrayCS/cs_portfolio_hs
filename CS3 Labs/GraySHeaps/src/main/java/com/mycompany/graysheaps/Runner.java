/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysheaps;

/**
 *
 * @author seanp
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Heap heap = new Heap();

        heap.add(1);
        heap.add(2);
        heap.add(8);
        heap.add(9);
        heap.add(10);
        heap.add(7);
        heap.add(75);
        heap.add(17);
        heap.add(5);

        heap.print();
        heap.remove();
        heap.print();
        heap.remove();
        heap.print();
        heap.remove();
        heap.print();
        heap.remove();
        heap.print();
        heap.remove();
        heap.print();
        heap.remove();
        heap.print();
        heap.remove();

        heap.print();
        heap.add(25);
        heap.print();
        heap.add(35);
        heap.print();
        heap.remove();
        heap.print();

    }

}
