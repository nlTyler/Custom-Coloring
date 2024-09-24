package edu.up.com.example.customcoloring;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class FruitController implements SeekBar.OnSeekBarChangeListener {
    private FruitView fruitVi;
    private FruitModel fruitMod;

    public FruitController(FruitView fruitV) {
        this.fruitVi = fruitV;
        this.fruitMod = fruitV.getFruitModel();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        int currentColor = fruitMod.currentColor();
        fruitVi.updateBowlColor(currentColor);

        fruitVi.invalidate();

    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }



}
