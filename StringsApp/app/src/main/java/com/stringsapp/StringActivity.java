package com.stringsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StringActivity extends AppCompatActivity {
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        resultado = findViewById(R.id.resultado);

        Bundle bundle = getIntent().getExtras(); // resgatar o que vai passar para outra view
        String resultadoString = bundle.getString("resultado");
        resultado.setText("As strins são " + resultadoString);

    }
}
