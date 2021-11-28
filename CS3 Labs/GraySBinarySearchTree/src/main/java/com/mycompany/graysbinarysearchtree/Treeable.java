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
public interface Treeable {
    public Object getValue();
    public Treeable getLeft();
    public Treeable getRight();
    public void setValue(Comparable value);
    public void setLeft(Treeable left);
    public void setRight(Treeable right);
}
