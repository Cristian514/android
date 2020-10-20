package com.example.juliocesar.diseologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CITA extends AppCompatActivity {

    Button  agendar, otros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_i_t);

        agendar=findViewById(R.id.agendar);
        otros=findViewById(R.id.otros);

        agendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CITA.this,Login.class));
                finish();
            }
        }) ;

        otros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CITA.this, "NO HAY HORARIOS", Toast.LENGTH_SHORT).show();
                //Aquí codigo
            }
        });
    }
}