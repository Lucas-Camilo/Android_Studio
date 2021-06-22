package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    public EditText txtIdade;
    public Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        it = getIntent();
        txtIdade = findViewById(R.id.edtIdade);

    }

    public void Next(View view)
    {
        if(!txtIdade.getText().toString().equals(""))
        {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Nome", it.getStringExtra("Nome"));
            intent.putExtra("Idade", txtIdade.getText().toString());
            startActivity(intent);
        }
        else
        {
            txtIdade.requestFocus();
        }
    }
}