/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakesweep;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;

/**
 *
 * @author seanp
 */
public class GridCanvas extends Canvas {
    
    boolean repainting;
    
    public GridCanvas() {
        super();
        setIgnoreRepaint(true);
        repainting = false;
    }
    
    @Override
    public void repaint() {
        if (repainting) {
            return;
        }
        repainting = true;
        
        BufferStrategy strategy = getBufferStrategy();
        Graphics g = strategy.getDrawGraphics();
        
        // Draw using g
        
        if (g != null) {
            g.dispose();
        }
        
        strategy.show();
        Toolkit.getDefaultToolkit().sync();
        
        repainting = false;
    }
    
}
