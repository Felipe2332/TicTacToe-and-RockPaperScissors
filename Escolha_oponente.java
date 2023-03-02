package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Escolha_oponente extends AppCompatActivity {

    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_oponente);

        ImageView btnHeitor = /*(ImageView)*/ findViewById(R.id.iBtnHeitor);
        ImageView btnLucas = /*(ImageView)*/ findViewById(R.id.iBtnLucas);
        ImageView btnLuis = /*(ImageView)*/ findViewById(R.id.iBtnLuis);
        ImageView btnVitor = /*(ImageView)*/ findViewById(R.id.iBtnVitor);
        Button btn_voltar = findViewById(R.id.btn_voltar3);
        //Código responsável pela captura do evento de Clique no botão
        //e execução da ação realizada após o clique.
        btnHeitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                a = 1;
                Intent t = new Intent(Escolha_oponente.this, JogoJogo.class);
                t.putExtra("a", a);
                startActivity(t);
                finish();
            }
        });
        btnLucas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                a = 2;
                Intent t2 = new Intent(Escolha_oponente.this, JogoJogo.class);
                t2.putExtra("a", a);
                startActivity(t2);
                finish();
            }
        });
        btnLuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                a = 3;
                Intent t3 = new Intent(Escolha_oponente.this, JogoJogo.class);
                t3.putExtra("a", a);
                startActivity(t3);
                finish();
            }
        });
        btnVitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                a = 4;
                Intent t4 = new Intent(Escolha_oponente.this, JogoJogo.class);
                t4.putExtra("a", a);
                startActivity(t4);
                finish();
            }
        });
        //Colocar botão voltar na tela de escolha jogo
        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t5 = new Intent(Escolha_oponente.this,escolha_o_jogo.class);
                startActivity(t5);
                finish();
            }
        });
    }
}