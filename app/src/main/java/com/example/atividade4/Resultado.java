package com.example.atividade4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView tvMemorize;
    EditText etNumero;
    EditText etNumero2;
    EditText etNumero3;
    EditText etNumero4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

    }
}