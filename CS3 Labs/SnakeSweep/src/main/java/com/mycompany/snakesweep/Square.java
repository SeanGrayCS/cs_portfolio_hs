/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakesweep;

/**
 *
 * @author seanp
 */

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Square extends JLabel {
    
    private int numBombs;
    private final int gridX;         // the x location of the square in the grid
    private final int gridY;         // the y location of the square in the grid
    private boolean flag;
    private boolean covered;
    
    private final ImageIcon tileIcon;
    
    public final static ImageIcon ICON_TILE_0 =
            new ImageIcon("images\\tile0.png");
    public final static ImageIcon ICON_TILE_1 =
            new ImageIcon("images\\tile1.png");
    public final static ImageIcon ICON_TILE_2 =
            new ImageIcon("images\\tile2.png");
    public final static ImageIcon ICON_TILE_3 =
            new ImageIcon("images\\tile3.png");
    public final static ImageIcon ICON_0 = new ImageIcon("images\\0.png");
    public final static ImageIcon ICON_1 = new ImageIcon("images\\1.png");
    public final static ImageIcon ICON_2 = new ImageIcon("images\\2.png");
    public final static ImageIcon ICON_3 = new ImageIcon("images\\3.png");
    public final static ImageIcon ICON_4 = new ImageIcon("images\\4.png");
    public final static ImageIcon ICON_5 = new ImageIcon("images\\5.png");
    public final static ImageIcon ICON_6 = new ImageIcon("images\\6.png");
    public final static ImageIcon ICON_7 = new ImageIcon("images\\7.png");
    public final static ImageIcon ICON_8 = new ImageIcon("images\\8.png");
    public final static ImageIcon ICON_9 = new ImageIcon("images\\9.png");
    public final static ImageIcon ICON_FLAG = new ImageIcon("images\\flag.png");
    
    
    
    
    // Number of bombs will determine which icons to show when clicked
    // 0     Display a blank square
    // 1 - 8 Displays the number of adjacent bombs
    // 9     Displays a bomb
    
    // Data class will change the Icon Instance Variable based on numbers
    // 0 - blank image
    // 1 - "1" in Blue
    // 2 - "2" in Green
    // 3 - "3" in Red
    // 4 - "4" in Purple
    // 5 - "5" in Dark Red
    // 6 - "6" in Teal
    // 7 - "7" in Black
    // 8 - "8" in Gray
    // 9 - Snake Bomb
    // Right click - Flag on Button image
    
    // All image Icons are 32 x 32 pixels

    public Square(int gridX, int gridY) {
        super();
        this.numBombs = 0;
        this.gridX = gridX;
        this.gridY = gridY;
        this.flag = false;
        this.covered = true;
        
        int tileNum = (int)(Math.random() * 3);
        switch (tileNum) {
            case 0 -> this.tileIcon = ICON_TILE_0;
            case 1 -> this.tileIcon = ICON_TILE_1;
            case 2 -> this.tileIcon = ICON_TILE_2;
            case 3 -> this.tileIcon = ICON_TILE_3;
            default -> this.tileIcon = ICON_TILE_0;
        }
        this.setIcon(tileIcon);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
        this.setIcon(flag ? ICON_FLAG : tileIcon);
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
        if (covered) {
            this.setIcon(tileIcon);
            return;
        }
        switch (numBombs) {
            case 0 -> this.setIcon(ICON_0);
            case 1 -> this.setIcon(ICON_1);
            case 2 -> this.setIcon(ICON_2);
            case 3 -> this.setIcon(ICON_3);
            case 4 -> this.setIcon(ICON_4);
            case 5 -> this.setIcon(ICON_5);
            case 6 -> this.setIcon(ICON_6);
            case 7 -> this.setIcon(ICON_7);
            case 8 -> this.setIcon(ICON_8);
            default -> this.setIcon(ICON_9);
        }
    }
    
    public int getGridX() {
        return gridX;
    }

    public int getGridY() {
        return gridY;
    }

    public int getNumBombs() {
        return numBombs;
    }

    public void setNumBombs(int numBombs) {
        this.numBombs = numBombs > 9 ? 9 : numBombs;
        this.setCovered(this.isCovered());
    }
    
}
