package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class splashFinalJogo extends AppCompatActivity {

    public int progressBarValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_final_jogo);

        int vitoria = getIntent().getIntExtra("vitoria", 0);
        int derrota = getIntent().getIntExtra("derrota", 0);
        int empate = getIntent().getIntExtra("empate", 0);


        Handler handler = new Handler();

        //barra de ações
        getSupportActionBar().hide();

        //Tela Cheia
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView texto = findViewById(R.id.finaltxt);
        TextView vit = findViewById(R.id.txt_Vitoria);
        TextView emp = findViewById(R.id.txt_Empate);
        TextView der = findViewById(R.id.txt_Derota);

        String a = "FIM DE JOGO";
        /*//ALTERAR A FRASE: altere a variavel
        String a = "FIM DE JOGO";
        //ALTERE MAIS NADA*/

        texto.setText(a + "\nPONTOS: ");
        vit.setText(String.valueOf(vitoria));
        emp.setText(String.valueOf(empate));
        der.setText(String.valueOf(derrota));
/*
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                while(progressBarValue < 100)
                {
                    progressBarValue = progressBarValue + 10;
                    Progressbar.setProgress(progressBarValue);
                }
            }
        }, 5000 );//time in milisecond*/
    }

    public void sair(View view)
    {
        Intent secondActivity = new Intent (splashFinalJogo.this , MainActivity.class);
        startActivity(secondActivity);
    }
}