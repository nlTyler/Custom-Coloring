package edu.up.com.example.customcoloring;


import android.widget.SeekBar;

public class FruitModel {
    public SeekBar redBar;
    public SeekBar greenBar;
    public SeekBar blueBar;

    public FruitModel (SeekBar skbr, SeekBar skbr2, SeekBar skbr3) {
        this.redBar = skbr;
        this.greenBar = skbr2;
        this.blueBar = skbr3;
    }
    public int currentColor() {
        int red = redBar.getProgress();
        int green = greenBar.getProgress();
        int blue = blueBar.getProgress();
        return android.graphics.Color.rgb(red, green, blue);
    }

}
