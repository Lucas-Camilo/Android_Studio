package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;
public class MainActivity3 extends AppCompatActivity {

    public TextView tvwResultado;
    public Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tvwResultado = findViewById(R.id.tvwResultado);

        it = getIntent();
        String nome = it.getStringExtra("Nome");
        String idade = it.getStringExtra("Idade");

        String Resultado = "Pazer "+nome+"\nVocê tem "+idade+" Anos";
        tvwResultado.setText(Resultado);

    }
}