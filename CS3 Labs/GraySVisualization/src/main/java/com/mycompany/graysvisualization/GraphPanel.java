/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysvisualization;

/**
 *
 * @author seanp
 */

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics2D;

public class GraphPanel extends JPanel {
    
    private int scaleFactor;
    private ArrayList<Line> lines;
    private Line time;
    
    public GraphPanel() {
        this.scaleFactor = 1;
        lines = new ArrayList<>();
        time = new Line(new double[]{}, Color.BLACK);
        
        this.setPreferredSize(new java.awt.Dimension(575 + (50 * 100),
                400));
        
    }
    
    public void setScaleFactor (int scaleFactor) {
        this.scaleFactor = scaleFactor;
        this.setPreferredSize(new java.awt.Dimension(600 + (scaleFactor * 100) -
                (scaleFactor / 2), 400));
        repaint();
    }
    
    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
        repaint();
    }
    
    public void setTime(Line time) {
        this.time = time;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        // Clears the drawing area with a white rectangle overlayed on top.
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        // Makes the time tick line with 1 second intervals if there is data.
        if (time.getData().length > 0) {
            int displayWidth = 600 + (100 * scaleFactor);
            int buffer = 50;
            int xScaleFactor = (displayWidth - buffer / 2) / time.getData().length;
            int x = buffer / 2, y;
            int prevX = x;

            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(time.getColor());
            g2d.setStroke(new BasicStroke(5F));

            int zerots = (int) (time.getData()[0] * 1000);
            int numSeconds = 1;
            for (double timestamp : time.getData()) {
                int tsShifted = (int) (timestamp * 1000);
                if ((tsShifted - zerots) % 1000 == 0) {
                    g2d.drawLine(prevX, 375, x, 375);
                    g2d.drawLine(x, 365, x, 385);
                    g2d.drawString("" + numSeconds, x - 3, 360);
                    numSeconds++;
                } else if ((tsShifted - zerots) % 500 == 0) {
                    g2d.drawLine(prevX, 375, x, 375);
                    g2d.drawLine(x, 370, x, 380);
                } else {
                    g2d.drawLine(prevX, 375, x, 375);
                }
                prevX = x;
                x += xScaleFactor;
            }
            g2d.setStroke(new BasicStroke(1F));
        }
    
        lines.forEach(line -> {
            graphLine(line, g);
        });
        
    }
    
    private void graphLine(Line line, Graphics g) {
        
        g.setColor(line.getColor());
        
        double[] dataPoints = line.getData();
        
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (double dataPoint : dataPoints) {
            if (dataPoint > max) {
                max = dataPoint;
            }
            if (dataPoint< min) {
                min = dataPoint;
            }
        }
        
        int displayWidth = 600 + (100 * scaleFactor);
        
        int buffer = 50;
        double baseLine = ((50 * (min / max)) -
                (getHeight() - 100)) / ((min / max) - 1);
        int xScaleFactor = (displayWidth - buffer / 2) /
                dataPoints.length;
        double yScaleFactor = (baseLine - 50) / max;
        
        int x = buffer / 2, y;
        
        int prevX = x;
        int prevY = (int) baseLine;
        
        for (int i = 0; i < dataPoints.length; i++) {
            
            y = (int) (baseLine - (dataPoints[i] * yScaleFactor));
            
            g.fillOval(x, y, 5, 5);
            if (i > 0) {
                g.drawLine(prevX + 5 / 2, prevY + 5 / 2, x + 5 / 2,
                        y + 5 / 2);
            }
            
            prevX = x;
            prevY = y;
            
            x += xScaleFactor;            
        }
        
    }
    
}
