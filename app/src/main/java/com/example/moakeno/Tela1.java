package com.example.moakeno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        getSupportActionBar().hide();
    }
    public void iniciar(View h) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}