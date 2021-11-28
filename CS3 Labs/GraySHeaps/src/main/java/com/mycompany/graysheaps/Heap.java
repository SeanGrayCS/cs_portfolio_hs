/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysheaps;

//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Gray
//Date - 3/5/21
//Class - CS3 Period 6
//Lab  - Heaps - 18

import java.util.ArrayList;
import static java.lang.System.*;

/**
 *
 * @author seanp
 */
public class Heap {
    
    private ArrayList<Integer> list;
    
    public Heap() {
        list = new ArrayList<>();
    }
    
    public void add(int value) {
        list.add(value);
        swapUp(list.size() - 1);
    }
    
    public void swapUp(int bot) {
        
        if (list.get(bot) > list.get((bot - 1) / 2)) {
            swap(bot, (bot - 1) / 2);
            swapUp((bot - 1) / 2);
        }
        
    }
    
    public void remove() {
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        swapDown(0);
    }
    
    public void swapDown(int top) {
        
        if ((top * 2) + 1 >= list.size()) {
            return;
        }
        int lr = 1;
        if ((top * 2) + 2 < list.size() && 
                list.get((top * 2) + 1).compareTo(list.get((top * 2) + 2)) < 0) {
            lr = 2;
        }
        if (list.get(top) < list.get((top * 2) + lr)) {
            swap((top), (top * 2) + lr);
            swapDown((top * 2) + lr);
        }
        
    }
    
    private void swap(int start, int finish) {
        int value = list.get(start);
        list.set(start, list.get(finish));
        list.set(finish, value);
    }
    
    public void heapSort(int[] nums) {
        for (int num : nums) {
            this.add(num);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.remove(i);
            this.swapDown(0);
            nums[i] = temp;
        }
        for (int num : nums) {
            list.add(num);
        }
    }
    
    public void print() {
        out.println("\n\nPRINTING THE HEAP!\n\n");
        
        int level = -1;
        for (int i = 0; i < list.size(); i++) {
            if ((int)(Math.ceil((Math.log(i + 1) / Math.log(2)))) == 
                    (int)(Math.floor(((Math.log(i + 1) / Math.log(2)))))) {
                level++;
                out.println();
            }
            int numSpaces = 8 - (2 * level);
            if (numSpaces < 1) {
                numSpaces = 1;
            }
            String space = " ".repeat(numSpaces);
            out.print(space + list.get(i));
        }
        
        out.println();
    }
    
    public String toString() {
        return list.toString();
    }
    
}
