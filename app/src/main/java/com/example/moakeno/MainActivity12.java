package com.example.moakeno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        getSupportActionBar().hide();
    }


    public void about(View h) {

        Intent i = new Intent(this, about.class);
        startActivity(i);
    }



    public void sair(View h) {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}