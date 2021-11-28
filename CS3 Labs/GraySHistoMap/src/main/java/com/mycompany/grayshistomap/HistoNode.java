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
public class HistoNode {
    
    private char letter;
    private int letterCount;
    private HistoNode next;
    
    public HistoNode(char let, int cnt, HistoNode n) {
        letter = let;
        letterCount = cnt;
        next = n;
    }
    
    public char getLetter() {
        return letter;
    }
    
    public int getLetterCount() {
        return letterCount;
    }
    
    public void setLetter(char let) {
        letter = let;
    }
    
    public void setLetterCount(int cnt) {
        letterCount = cnt;
    }
    
    public HistoNode getNext() {
        return next;
    }
    
}
