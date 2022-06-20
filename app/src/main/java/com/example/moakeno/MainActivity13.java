package com.example.moakeno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }


public void enviar(View vs){
    String mensagem = "Email inexistente";
    Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
}

    public void voltar(View h) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}