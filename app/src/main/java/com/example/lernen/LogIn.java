package com.example.lernen;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class LogIn extends AppCompatActivity {

    TextView tv_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        //getActionBar().hide(); //Para ocultar la barra azul de arriba

        //Para pasar de una activity(Paguina) a otra
        tv_registrar = (TextView) findViewById(R.id.tvLRegistro);
        tv_registrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentRegistro = new Intent(LogIn.this,Registro.class);
                LogIn.this.startActivity(intentRegistro);

            }
        });
    }
}
