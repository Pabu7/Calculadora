package com.paulo.calculadora;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText FirstIn;
    private EditText SecondIn;
    private TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstIn = (EditText) findViewById(R.id.FirstIn);
        SecondIn = (EditText) findViewById(R.id.SecondIn);
        out = (TextView) findViewById(R.id.out);
    }

    public void somar(View v){
        float x = Float.parseFloat(FirstIn.getText().toString());
        float y = Float.parseFloat(SecondIn.getText().toString());
        float r = x + y;
        out.setText(String.valueOf(r));
    }

    public void subtrair(View v){
        float x = Float.parseFloat(FirstIn.getText().toString());
        float y = Float.parseFloat(SecondIn.getText().toString());
        float r = x - y;
        out.setText(String.valueOf(r));
    }

    public void multiplicar(View v){
        float x = Float.parseFloat(FirstIn.getText().toString());
        float y = Float.parseFloat(SecondIn.getText().toString());
        float r = x * y;
        out.setText(String.valueOf(r));
    }

    public void dividir(View v){
        float x = Float.parseFloat(FirstIn.getText().toString());
        float y = Float.parseFloat(SecondIn.getText().toString());
        float r = x / y;
        out.setText(String.valueOf(r));
    }

    public void resto(View v){
        float x = Float.parseFloat(FirstIn.getText().toString());
        float y = Float.parseFloat(SecondIn.getText().toString());
        float r = x % y;
        out.setText(String.valueOf(r));
    }

}
