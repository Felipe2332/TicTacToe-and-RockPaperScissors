package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Splash01 extends AppCompatActivity {

    //variável para implementação da barra de progresso (eProgresso)
    private ProgressBar eProgresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash01);

        //variável para implementação da barra de progresso (eProgresso)
        eProgresso = (ProgressBar) findViewById(R.id.progressBar);

        //barra de ações
        getSupportActionBar().hide();

        //Tela Cheia
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int progresso=0 ; progresso<=100; progresso+=10) {
                    eProgresso.setProgress(progresso);
                }
                mostrarActivity();
            }
        },5000);
    }

    private void mostrarActivity() {
        Intent t = new Intent(Splash01.this, MainActivity.class);
        startActivity(t);
        finish();
    }
}