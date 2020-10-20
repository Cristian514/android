package com.example.juliocesar.diseologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class OTROS extends AppCompatActivity {
    Button aceptar_btn, volver_btm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_r_o_s);

        aceptar_btn=findViewById(R.id.aceptar_btn);
        volver_btm=findViewById(R.id.volver_btn);

        aceptar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OTROS.this,CITA.class));
                finish();
            }
        });

        volver_btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OTROS.this, "OK", Toast.LENGTH_SHORT).show();
                //Aquí codigo
            }
        });
    }
}