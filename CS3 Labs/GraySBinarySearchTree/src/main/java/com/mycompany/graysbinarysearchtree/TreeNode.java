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
public class TreeNode implements Treeable {
    
    private Comparable value;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode() {
        value = null;
        left = null;
        right = null;
    }
    
    public TreeNode(Comparable val, TreeNode lft, TreeNode rt) {
        value = val;
        left = lft;
        right = rt;
    }
    
    @Override
    public Object getValue() {
        return value;
    }
    
    @Override
    public TreeNode getLeft() {
        return left;
    }
    
    @Override
    public TreeNode getRight() {
        return right;
    }
    
    @Override
    public void setValue(Comparable value) {
        this.value = value;
    }
    
    @Override
    public void setLeft(Treeable left) {
        this.left = (TreeNode)left;
    }
    
    @Override
    public void setRight(Treeable right) {
        this.right = (TreeNode)right;
    }
    
    
    
}
