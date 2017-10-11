package com.example.manolo.a03_calculadorabasicacompleta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private double n1=0,n2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.txt1);
        et2= (EditText)findViewById(R.id.txt2);
        et3= (EditText)findViewById(R.id.txt3);
        cogerNumeros();
    }

    public void suma(View vista){
        cogerNumeros();
        et3.setText(String.valueOf(n1+n2));
    }
    public void resta(View vista){
        cogerNumeros();
        et3.setText(String.valueOf(n1-n2));
    }
    public void multi(View vista){
        cogerNumeros();
        et3.setText(String.valueOf(n1*n2));
    }
    public void divi(View vista){ //Si divido entre 0 Java devuelve Infinity
        cogerNumeros();
        if (n2==0)
            Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
        else
            et3.setText(String.valueOf(n1/n2));
    }

    public void cogerNumeros(){
        et1=(EditText)findViewById(R.id.txt1);
        n1=Double.parseDouble(et1.getText().toString());
        n2=Double.parseDouble(et2.getText().toString());


    }

}

