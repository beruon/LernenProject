package com.example.lernen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    TextView tv_volverRLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        //getActionBar().hide(); //Para ocultar la barra azul de arriba

        //Para pasar de una activity(Paguina) a otra
        tv_volverRLogin = (TextView) findViewById(R.id.volverRLogIn);
        tv_volverRLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intLogin = new Intent( Registro.this,LogIn.class);
                Registro.this.startActivity(intLogin);
            }
        });
    }
}
