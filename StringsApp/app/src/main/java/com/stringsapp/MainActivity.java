package com.stringsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText string1; //EditText = tipo um tipo de dado
    private EditText string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        string1 = findViewById(R.id.string1);// pra achar a caixa de texto do GUI
        string2 = findViewById(R.id.string2);

    }

    public void conferir(View view){

        String txtString1 = string1.getText().toString();
        String txtString2 = string2.getText().toString();

        if (!txtString1.isEmpty() && !txtString2.isEmpty()) {
            String txtResu = "";

            if (txtString1.equals(txtString2)) {
                txtResu = "iguais";
            } else {
                txtResu = "diferentes";
            }

            Intent intent = new Intent(MainActivity.this, StringActivity.class); // intent usado para abrir outra activity
            intent.putExtra("resultado", txtResu);
            startActivity(intent);

        }
    }

}
