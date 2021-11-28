/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graysvisualization;

import java.io.File;
import java.io.Serializable;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

/**
 *
 * @author seanp
 */
public class DataModel implements Serializable {
    
    private Double[][] viewport1Data;
    private Object[] viewport1Headers;
    private boolean[] inputs;
    private int[] input_colors;
    private File dataFile;
    private File videoFile;

    public DataModel(Double[][] viewport1Data,
            Object[] viewport1Headers, boolean[] inputs, int[] input_colors,
            File dataFile, File videoFile) {
        this.viewport1Data = viewport1Data;
        this.viewport1Headers = viewport1Headers;
        this.inputs = inputs;
        this.input_colors = input_colors;
        this.dataFile = dataFile;
        this.videoFile = videoFile;
    }

    public Double[][] getViewport1Data() {
        return viewport1Data;
    }

    public Object[] getViewport1Headers() {
        return viewport1Headers;
    }

    public boolean[] getInputs() {
        return inputs;
    }

    public int[] getInput_colors() {
        return input_colors;
    }
    
    public File getDataFile() {
        return dataFile;
    }
    
    public File getVideoFile() {
        return videoFile;
    }
    
}
