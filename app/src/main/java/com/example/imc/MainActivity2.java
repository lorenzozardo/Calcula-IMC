package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText btnNome, btnIdade, btnAltura, btnPeso;
    Button btnCalcular, btnSairIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnNome = findViewById(R.id.btnNome);
        btnIdade = findViewById(R.id.btnIdade);
        btnAltura = findViewById(R.id.btnAltura);
        btnPeso = findViewById(R.id.btnPeso);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnSairIMC = findViewById(R.id.btnSairIMC);

        btnSairIMC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });
    }

    public void calcular(View view) {
        int idade = Integer.parseInt(btnIdade.getText().toString());
        int altura = Integer.parseInt(btnAltura.getText().toString());
        int peso = Integer.parseInt(btnPeso.getText().toString());

        btnCalcular.setText(String.valueOf(peso/(altura*altura)));
    }
}