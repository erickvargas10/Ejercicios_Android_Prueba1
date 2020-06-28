package com.example.ejercicio37;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Path;

public class CanvasEJ extends View implements View.OnTouchListener {

    private int corx, cory;

    public CanvasEJ(Context context){
        super(context);
        corx = 100;
        cory = 100;
        setOnTouchListener(this);
    }

    public boolean onTouch(View v, MotionEvent event) {
        corx = (int) event.getX();
        cory = (int) event.getY();
        v.invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int alto = canvas.getHeight();

        Path camino = new Path();
        camino.moveTo(0, alto / 2);
        camino.lineTo(40, alto / 2 - 30);
        camino.lineTo(80, alto / 2 - 60);
        camino.lineTo(120, alto / 2 - 90);
        camino.lineTo(160, alto / 2 - 120);
        camino.lineTo(220, alto / 2 - 150);
        camino.lineTo(280, alto / 2 - 180);
        camino.lineTo(340, alto / 2 - 210);
        Paint pincel1 = new Paint();
        pincel1.setARGB(255, 255, 0, 0);
        pincel1.setTextSize(50);
        canvas.drawTextOnPath("EJERCICIO 37", camino, 0, 0,
                pincel1);
    }
}