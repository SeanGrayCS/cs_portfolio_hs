/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysvisualization;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JPanel;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

/**
 *
 * @author seanp
 */
public class VideoPanel extends JPanel {
    
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;
    
    public VideoPanel() {
        super();
        
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(600, 400));
        
        add(mediaPlayerComponent);

        setVisible(true);
    }
    
    public void start (File file) {
        mediaPlayerComponent.mediaPlayer().media().startPaused(file.toString());
    }
    
    public void play () {
        mediaPlayerComponent.mediaPlayer().controls().play();
    }
    
    public void pause() {
        mediaPlayerComponent.mediaPlayer().controls().pause();
    }
    
    public void forward() {
        mediaPlayerComponent.mediaPlayer().controls().skipTime(50);
    }
    
    public void backward() {
        mediaPlayerComponent.mediaPlayer().controls().skipTime(-50);
    }
    
    public void front() {
        mediaPlayerComponent.mediaPlayer().controls().setTime(0);
    }
    
    public void end() {
        mediaPlayerComponent.mediaPlayer().controls().setTime(
                mediaPlayerComponent.mediaPlayer().status().length());
    }
    
}
