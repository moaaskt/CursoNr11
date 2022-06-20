package com.example.moakeno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity7 extends AppCompatActivity {
    Button btn;
    static Usuario logado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        getSupportActionBar().hide();
        RadioGroup group = findViewById(R.id.radioGroup);

        RadioButton btn1 = findViewById(R.id.btn1);
        RadioButton btn2 = findViewById(R.id.btn2);
        RadioButton btn3 = findViewById(R.id.btn3);
        RadioButton btn4 = findViewById(R.id.btn4);

        btn = (Button) findViewById(R.id.btn);
        btn.setEnabled(false); //desativa botao




    }


    public void onRadioButtonClicked(View view) {
        // checando quando a radio foi marcado
        boolean checked = ((RadioButton) view).isChecked();


        switch (view.getId()){
            case R.id.btn1:
                if(checked) {
                    btn.setEnabled(true);
                    logado.pontos ++;
                }
                break;

            case R.id.btn2:
                if(checked)
                    btn.setEnabled(true);
                break;

            case R.id.btn3:
                if(checked)
                    btn.setEnabled(true);
                break;

            case R.id.btn4:
                if(checked)
                    btn.setEnabled(true);
                break;

        }

    }



    public void avancar(View h) {
        Intent i = new Intent(this, MainActivity8.class);
        startActivity(i);
        MainActivity8.logado = logado;
    }


}