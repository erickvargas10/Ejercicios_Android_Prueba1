package com.example.ejercicio05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv1;
    CheckBox check1,check2;
     Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        check1=findViewById(R.id.check1);
        check2=findViewById(R.id.check2);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String valor1=et1.getText().toString();
                    String valor2=et2.getText().toString();
                    int nro1=Integer.parseInt(valor1);
                    int nro2=Integer.parseInt(valor2);
                    String resu="";
                    if (check1.isChecked()==true) {
                        int suma=nro1+nro2;
                        resu="La suma es: "+ suma;
                    }
                    if (check2.isChecked()==true) {
                        int resta=nro1-nro2;
                        resu=resu + " La resta es: "+ resta;
                    }
                    tv1.setText(resu);
                }
        });
}
}