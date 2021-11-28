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
public class BSTree {
    
    private TreeNode root;
    private int[] longestPaths = {-1, -1};
    
    public BSTree() {
        root = null;
    }
    
    public BSTree(Comparable value) {
        root = new TreeNode(value, null, null);
    }
    
    public TreeNode getRoot() {
        return root;
    }
    
    public Comparable add(Comparable value) {
        root = add(value, root);
        return value;
    }
    
    private TreeNode add(Comparable value, TreeNode current) {
        
        if (current == null) {
            return new TreeNode(value, null, null);
        }
        
        int dirTest = value.compareTo(current.getValue());
        if (dirTest < 0) {
            current.setLeft(add(value, current.getLeft()));
        } else if (dirTest > 0) {
            current.setRight(add(value, current.getRight()));
        }
        return current;
        
    }
    
    public String preOrder() {
        return preOrder(root);
    }
    
    private String preOrder(TreeNode current) {
        
        String output = "";
        if (current != null) {
            output += current.getValue() + " ";
            output += preOrder(current.getLeft());
            output += preOrder(current.getRight());
        }
        return output;
        
    }
    
    public String postOrder() {
        return postOrder(root);
    }
    
    private String postOrder(TreeNode current) {
        
        String output = "";
        if (current != null) {
            output += postOrder(current.getLeft());
            output += postOrder(current.getRight());
            output += current.getValue() + " ";
        }
        return output;
        
    }
    
    public String inOrder() {
        return inOrder(root);
    }
    
    private String inOrder(TreeNode current) {
        
        String output = "";
        if (current != null) {
            output += inOrder(current.getLeft());
            output += current.getValue() + " ";
            output += inOrder(current.getRight());
        }
        return output;
        
    }
    
    public String revOrder() {
        return revOrder(root);
    }
    
    private String revOrder(TreeNode current) {
        
        String output = "";
        if (current != null) {
            output += revOrder(current.getRight());
            output += current.getValue() + " ";
            output += revOrder(current.getLeft());
        }
        return output;
        
    }
    
    public int getNumLeaves() {
        return getNumLeaves(root);
    }
    
    private int getNumLeaves(TreeNode current) {
        
        if (current != null) {
            if (current.getLeft() == null && current.getRight() == null) {
                return 1;
            }
            return getNumLeaves(current.getLeft()) + getNumLeaves(current.getRight());
        }
        return 0;
        
    }
    
    public int getNumLevels() {
        return getNumLevels(root);
    }
    
    private int getNumLevels(TreeNode current) {
        
        if (current == null) {
            return 0;
        }
        return 1 + Math.max(getNumLevels(current.getLeft()),
                getNumLevels(current.getRight()));
        
    }
    
    public int getWidth() {
        getWidth(root);
        return longestPaths[0] + longestPaths[1] + 1;
    }
    
    private int[] getWidth(TreeNode current) {
        
        int[] farthestPaths = {-1, -1};
        
        if (current == null || isLeaf(current)) {
            farthestPaths[0] = 0;
            farthestPaths[1] = 0;
        } else {
            int[] farthestPathsRight;
            int[] farthestPathsLeft;
            
            if (current.getLeft() == null) {
                farthestPaths[0] = 0;
                farthestPathsRight = getWidth(current.getRight());
                farthestPaths[1] = Math.max(farthestPathsRight[0],
                        farthestPathsRight[1]) + 1;
            } else if (current.getRight() == null) {
                farthestPathsLeft = getWidth(current.getLeft());
                farthestPaths[0] = Math.max(farthestPathsLeft[0],
                        farthestPathsLeft[1]) + 1;
                farthestPaths[1] = 0;
            } else {
                farthestPathsLeft = getWidth(current.getLeft());
                farthestPathsRight = getWidth(current.getRight());
                farthestPaths[0] = Math.max(farthestPathsLeft[0],
                        farthestPathsLeft[1]) + 1;
                farthestPaths[1] = Math.max(farthestPathsRight[0],
                        farthestPathsRight[1]) + 1;
            }
        }
        
        if ((farthestPaths[0] + farthestPaths[1]) >
                (longestPaths[0] + longestPaths[1])) {
            longestPaths = farthestPaths;
        }
        
        return farthestPaths;
        
    }
    
    private boolean isLeaf(TreeNode node) {
        return (node.getLeft() == null && node.getRight() == null);
    }
    
    public int getHeight() {
        return getNumLevels(root) - 1;
    }
    
    public int getNumNodes() {
        return getNumNodes(root);
    }
    
    private int getNumNodes(TreeNode current) {
        
        if (current == null) {
            return 0;
        }
        return 1 + getNumNodes(current.getLeft()) + getNumNodes(current.getRight());
        
    }
    
    public boolean isFull() {
        return (Math.pow(2, getNumLevels(root)) - 1 == getNumNodes(root));
    }
    
    @Override
    public String toString() {
        return inOrder(root);
    }
    
}
