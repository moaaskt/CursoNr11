package com.example.moakeno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        getSupportActionBar().hide();
    }

    public void avancar(View h) {
        Intent i = new Intent(this, MainActivity10.class);
        startActivity(i);
    }

}