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
public class SortRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heap heap = new Heap();
        int[] nums = {99,2,8,75,10,7,9,17,5,3,4,1,11,1};
        heap.heapSort(nums);
        System.out.println(heap);
    }
    
}