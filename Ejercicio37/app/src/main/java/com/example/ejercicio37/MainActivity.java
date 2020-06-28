package com.example.ejercicio37;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

        public class MainActivity extends AppCompatActivity{
            CanvasEJ miCanvas;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                miCanvas = new CanvasEJ(this);
                setContentView(miCanvas);

            }
        }