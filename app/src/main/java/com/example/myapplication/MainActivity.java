package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    public EditText txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNome = findViewById(R.id.edtNome);

    }
    public void Next(View view)
    {
        if(!txtNome.getText().toString().equals(""))
        {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Nome", txtNome.getText().toString());
            startActivity(intent);
        }
        else
        {
            txtNome.requestFocus();
        }
    }
}