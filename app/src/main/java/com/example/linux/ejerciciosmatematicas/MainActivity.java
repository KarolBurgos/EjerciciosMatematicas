package com.example.linux.ejerciciosmatematicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void multiplicar(View view){
        Intent i=new Intent (this,Multiplicar.class);
        startActivity(i);
    }
    public void sumar(View view){
        Intent i=new Intent (this,Sumar.class);
        startActivity(i);
    }
    public void dividir(View view){
        Intent i=new Intent (this,Dividir.class);
        startActivity(i);
    }
    public void restar(View view){
        Intent i=new Intent (this,Restar.class);
        startActivity(i);
    }
    public void acercade(View view){
        Intent i=new Intent (this,AcercaDe.class);
        startActivity(i);
    }
    public void salir(View view)
    {
        finish();
    }
}
