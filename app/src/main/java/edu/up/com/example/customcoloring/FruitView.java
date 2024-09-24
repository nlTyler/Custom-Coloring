package edu.up.com.example.customcoloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.SeekBar;

public class FruitView extends SurfaceView {


    Paint tablePaint = new Paint();
    Paint bowlPaint = new Paint();
    Paint applePaint = new Paint();
    Paint orangePaint = new Paint();
    Paint grapePaint = new Paint();
    Paint pearPaint = new Paint();
    Paint backgroundPaint = new Paint();


    public static final float tableTop = 400.0f;
    public static final float tableLeft = 100.0f;
    public static final float tableWidth = 1200.0f;
    public static final float tableHeight = 200.0f;
    public static final float bowlHeight = 50.0f;
    public static final float bowlWidth = 40.0f;
    private FruitModel fruitMod;

    public FruitView(Context context, AttributeSet attrs) {
        super(context, attrs);


        setWillNotDraw(false);

        //Setup our palette
        tablePaint.setColor(0xFF913e17);
        tablePaint.setStyle(Paint.Style.FILL);
        bowlPaint.setColor(0xFFd9ac6f);
        bowlPaint.setStyle(Paint.Style.FILL);
        applePaint.setColor(0xFFde2612);
        applePaint.setStyle(Paint.Style.FILL);
        orangePaint.setColor(0xFFfa8b02);
        orangePaint.setStyle(Paint.Style.FILL);
        grapePaint.setColor(0xFFa702fa);
        grapePaint.setStyle(Paint.Style.FILL);
        backgroundPaint.setColor(0xFF88edf2);
        backgroundPaint.setStyle(Paint.Style.FILL);

        setBackgroundColor(0xFF88edf2);



    }
    @Override
    public void onDraw(Canvas canvas){

        int red = fruitMod.redBar.getProgress();
        int green = fruitMod.greenBar.getProgress();
        int blue = fruitMod.blueBar.getProgress();

        //int currColor = Color.rgb(red, green, blue);
        //bowlPaint.setColor(currColor);


        canvas.drawRect(300, 500, 400, 1000, tablePaint);
        canvas.drawRect(1600, 500, 1700, 1000, tablePaint);
        canvas.drawRect(300, 500, 1800, 600, tablePaint);

        canvas.drawCircle(1040,450, 100, bowlPaint);
        canvas.drawRect(800, 250, 1200, 450, backgroundPaint);

        canvas.drawCircle(1000,380, 30, applePaint);
        canvas.drawCircle(960,400, 30, applePaint);
        canvas.drawCircle(1030, 410, 35, orangePaint);

        canvas.drawCircle(1080, 410, 15, grapePaint);
        canvas.drawCircle(1100, 410, 15, grapePaint);
        canvas.drawCircle(1120, 410, 15, grapePaint);
        canvas.drawCircle(1090, 430, 15, grapePaint);
        canvas.drawCircle(1110, 430, 15, grapePaint);
        canvas.drawCircle(1100, 440, 15, grapePaint);


    }

    public FruitModel getFruitModel() {
        return fruitMod;
    }

    public void updateBowlColor(int color) {
        bowlPaint.setColor(color);
    }

    public void setFruitModel(FruitModel fruitMod) {
        this.fruitMod = fruitMod;
    }
}
