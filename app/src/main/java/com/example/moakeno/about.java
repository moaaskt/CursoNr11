package com.example.moakeno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();
    }


    public void alert(View view){
        String mensagem = "Feito Por Moacir S. Neto";
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();


    }






    public void voltar(View view){
        Intent k = new Intent(this, Tela1.class);
        startActivity(k);
    }


}