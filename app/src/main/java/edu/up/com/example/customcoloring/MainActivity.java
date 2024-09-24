package edu.up.com.example.customcoloring;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        FruitView fruitVi = findViewById(R.id.fruitview);
        SeekBar greenBar = findViewById(R.id.seekBar);
        SeekBar redBar = findViewById(R.id.seekBar2);
        SeekBar blueBar = findViewById(R.id.seekBar3);

        FruitModel fruitMod = new FruitModel(redBar, greenBar, blueBar);

        FruitController FruitCon = new FruitController(fruitVi);
        fruitVi.setFruitModel(fruitMod);

        greenBar.setOnSeekBarChangeListener(FruitCon);
        redBar.setOnSeekBarChangeListener(FruitCon);
        blueBar.setOnSeekBarChangeListener(FruitCon);

//        FruitModel FruitMod = new FruitModel(redBar, greenBar, blueBar);
//        FruitController fruitCon = new FruitController(fruitVi, fruitMod);
//
//        greenBar.setOnSeekBarChangeListener(fruitCon);
//        redBar.setOnSeekBarChangeListener(fruitCon);
//        blueBar.setOnSeekBarChangeListener(fruitCon);










    }
}