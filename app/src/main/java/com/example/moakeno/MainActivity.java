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
    ArrayList<Usuario> listausuario = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        nome = findViewById(R.id.nome);
        senha = findViewById(R.id.senha);
        Usuario v1 = new Usuario("aluno", "123", 2222);
        v1.pontos = 0;
        Usuario v2 = new Usuario("professor", "123", 233);
        listausuario.add(v1);
        listausuario.add(v2);

    }



    public void login(View h) {
        String l = nome.getText().toString();
        String s = senha.getText().toString();
        if (verifica(l, s)) {
            String mensagem = "Seja Bem Vindo";
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
            mudaTela();
        } else {
            Toast.makeText(this, "Login ou senha incorreto!", Toast.LENGTH_LONG).show();
        }
    }


    public void mudaTela() {
        Intent i = new Intent(this, Tela1.class);
        startActivity(i);
    }



   public void passWord(View vss){
        Intent j = new Intent(this, MainActivity13.class);
        startActivity(j);
   }

    public boolean verifica(String login, String senha) {
        for (Usuario pessoa : listausuario) {
            if (pessoa.login.equals(login) && pessoa.senha.equals(senha)) {
                MainActivity2.logado = pessoa;
                return true;
            }
        }
        return false;
    }
}