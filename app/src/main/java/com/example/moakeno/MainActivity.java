package com.example.moakeno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText nome, senha;
    ArrayList<usuario> listausuario = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        nome = findViewById(R.id.nome);
        senha = findViewById(R.id.senha);
        usuario v1 = new usuario("aluno", "123", 2222);
        usuario v2 = new usuario("professor", "123", 233);
        listausuario.add(v1);
        listausuario.add(v2);

    }



    public void login(View h) {
        String l = nome.getText().toString();
        String s = senha.getText().toString();
        if (verifica(l, s)) {
            String mensagem = "Parabéns, você logou";
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
            mudaTela();
        } else {
            Toast.makeText(this, "Login ou senha incorreta!", Toast.LENGTH_LONG).show();
        }
    }


    public void mudaTela() {
        Intent i = new Intent(this, Tela1.class);
        startActivity(i);
    }

    public boolean verifica(String login, String senha) {
        for (usuario pessoa : listausuario) {
            if (pessoa.login.equals(login) && pessoa.senha.equals(senha)) {
                return true;
            }
        }
        return false;
    }
}