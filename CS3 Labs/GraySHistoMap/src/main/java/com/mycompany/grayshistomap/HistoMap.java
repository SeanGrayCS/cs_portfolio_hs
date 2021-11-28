/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grayshistomap;

/**
 *
 * @author seanp
 */
public class HistoMap {
    
    private final HistoNode head;
    
    public HistoMap() {
        head = new HistoNode('A', 0, new HistoNode('B', 0, 
                new HistoNode('C', 0, new HistoNode('F', 0, null))));
    }
    
    public void put(int grade) {
        HistoNode current = head;
        if (grade < 70) {
            current = current.getNext().getNext().getNext();
            grade = 100;
        }
        while (grade < 90) {
            current = current.getNext();
            grade += 10;
        }
        current.setLetterCount(current.getLetterCount() + 1);
    }
    
    public int get(char grade) {
        HistoNode current = head;
        while (true) {
            if (current.getLetter() == grade) {
                break;
            }
            if (current.getNext() == null) {
                // In case grade parameter is not a node.
                return -1;
            }
            current = current.getNext();
        }
        return current.getLetterCount();
    }
    
}
