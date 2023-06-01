package com.example.atividade4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMemoria;

    TextView tvNumeros;

    TextView tvNumeros2;

    TextView tvNumeros3;

    TextView tvNumeros4;

    Button btMemorize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMemorize = findViewById(R.id.btMemorize);
        tvNumeros = findViewById(R.id.tvNumeros);
        tvNumeros2 = findViewById(R.id.tvNumeros2);
        tvNumeros3 = findViewById(R.id.tvNumeros3);
        tvNumeros4 = findViewById(R.id.tvNumeros4);

        btMemorize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1=tvNumeros.getText().toString();
                int i1=Integer.parseInt(tvNumeros.getText().toString());
                Intent in = new Intent(MainActivity.this, Resultado.class);
                in.putExtra("n1", tvNumeros.getText().toString());
                startActivity(in);
            }
        });
    }
}