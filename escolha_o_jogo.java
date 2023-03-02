package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class escolha_o_jogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_ojogo);

        Button btnJoken = findViewById(R.id.btn_jokentech);
        Button btnticta = findViewById(R.id.btn_tictactech);

        btnJoken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                joken();
            }
        });
        btnticta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tictac();
            }
        });

    }

    public void joken (){
        Intent t = new Intent(escolha_o_jogo.this, Escolha_oponente.class);
        startActivity(t);
        finish();
    }

    public void tictac(){
        Intent tt = new Intent(escolha_o_jogo.this, jogo_tictactoe.class);
        startActivity(tt);
    }

}