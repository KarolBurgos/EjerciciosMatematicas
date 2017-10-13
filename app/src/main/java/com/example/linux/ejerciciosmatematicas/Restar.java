package com.example.linux.ejerciciosmatematicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Restar extends AppCompatActivity {

    private EditText resultado,num1,num2;
    private int contar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        resultado=(EditText)findViewById(R.id.resul);
        num1 =(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);

        num1.setEnabled(false);
        num2.setEnabled(false);
        num1.setText(String.valueOf((int)(Math.random()*12+1)));
        num2.setText(String.valueOf((int)(Math.random()*12+1)));
        contar=0;
    }

    public void operar(View view){

        if(Integer.valueOf(num1.getText().toString())-Integer.valueOf(num2.getText().toString())==Integer.valueOf(resultado.getText().toString()))
        {
            Toast resu=Toast.makeText(this,"Numero correcto",Toast.LENGTH_LONG);
            resu.show();
            num1.setText(String.valueOf((int)(Math.random()*12+1)));
            num2.setText(String.valueOf((int)(Math.random()*12+1)));
            contar++;
        }else
        {
            Toast resu=Toast.makeText(this,"Numero incorrecto",Toast.LENGTH_LONG);
            resu.show();
        }
        if(contar==5)
        {
            Toast resu=Toast.makeText(this,"HAS GANADO",Toast.LENGTH_LONG);
            resu.show();
            finish();
        }

    }


    public void salir(View view){
        finish();
    }
}
