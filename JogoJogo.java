package com.example.projeto01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class JogoJogo extends AppCompatActivity {

    int x = new Random().nextInt(3);// 0 = pedra | 1 = papel | 2 = tesoura
    int mao;
    public int vitoria,derrota,empate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_jogo);

        int a = getIntent().getIntExtra("a", 0);

        TextView frase = findViewById(R.id.frase_efeito);

        ImageView imgJogador = findViewById(R.id.imgJogador);

        if(a == 1){
            frase.setText("Quer perder AGORA?");
            imgJogador.setImageResource(R.drawable.whatsapp_image_2022_09_19_at_11_27_02_am);
        }
        else if(a == 2){
            frase.setText("Tenho que treinar, BOORAA");
            imgJogador.setImageResource(R.drawable.lucaooculos);
        }
        else if(a == 3){
            frase.setText("Quem perder paga 10");
            imgJogador.setImageResource(R.drawable._0220602_120631);
        }
        else if(a == 4){
            frase.setText("Valendo CINCÃO (R$)");
            imgJogador.setImageResource(R.drawable.victorprego);
        }

        ImageView iBtnPedra = /*(ImageButton)*/ findViewById(R.id.imgPedra);
        ImageView iBtnPapel = /*(ImageButton)*/ findViewById(R.id.imgPapelo);
        ImageView iBtnTesou = /*(ImageButton)*/ findViewById(R.id.imgTesou);
        //Código responsável pela captura do evento de Clique no botão
        //e execução da ação realizada após o clique.
        iBtnPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                mao = 0;
                jogo();
            }
        });

        iBtnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                mao = 1;
                jogo();
            }
        });

        iBtnTesou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                mao = 2;
                jogo();
            }
        });
    }

    //MENSAGENS
    public void mensagem_empate(){
        AlertDialog.Builder Mensagem = new AlertDialog.Builder(this);

        //Window w = Mensagem.show().getWindow();//ERRO AQUI
        //w.setGravity(Gravity.BOTTOM);

        Mensagem.setTitle("RESULTADO");
        Mensagem.setIcon(R.drawable.ic_launcher_foreground);
        Mensagem.setMessage("Empatou");
        Mensagem.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog alerta = Mensagem.create();
        alerta.show();
        alerta.getWindow().setGravity(Gravity.BOTTOM);
    }

    public void mensagem_vitoria(){
        AlertDialog.Builder Mensagem = new AlertDialog.Builder(this);

        //Window w = Mensagem.show().getWindow();//ERRO AQUI
        //w.setGravity(Gravity.BOTTOM);
        //Mensagem.show().getWindow().getAttributes().gravity = Gravity.BOTTOM;


        Mensagem.setTitle("RESULTADO");
        Mensagem.setIcon(R.drawable.ic_launcher_foreground);
        Mensagem.setMessage("Venceu");
        Mensagem.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog alerta = Mensagem.create();
        alerta.show();
        alerta.getWindow().setGravity(Gravity.BOTTOM);
    }

    public void mensagem_derrota(){
        AlertDialog.Builder Mensagem = new AlertDialog.Builder(this);

        //Window w = Mensagem.show().getWindow();//ERRO AQUI
        //w.setGravity(Gravity.BOTTOM);
        //Mensagem.show().getWindow().getAttributes().gravity = Gravity.BOTTOM;

        Mensagem.setTitle("RESULTADO");
        Mensagem.setIcon(R.drawable.ic_launcher_foreground);
        Mensagem.setMessage("Perdeu perdeu");
        Mensagem.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog alerta = Mensagem.create();
        alerta.show();
        alerta.getWindow().setGravity(Gravity.BOTTOM);
    }

    public void jogo (){

        x = new Random().nextInt(3);// 0 = pedra | 1 = papel | 2 = tesoura
        TextView v = findViewById(R.id.vitoriaID);
        TextView d = findViewById(R.id.derrotaID);
        TextView e = findViewById(R.id.empateID);
        TextView op = findViewById(R.id.mao_oponente);

        if (mao==0){
            if (x==0){
                mensagem_empate();
                empate = empate + 1;
                op.setText("✊");
            }
            else if (x==1){
                mensagem_derrota();
                derrota = derrota +1;
                op.setText("✋");
            }
            else if (x==2){
                mensagem_vitoria();
                vitoria = vitoria+1;
                op.setText("✌");
            }
        }
        else if (mao==1){
            if (x==1){
                mensagem_empate();
                empate = empate + 1;
                op.setText("✋");
            }
            else if (x==2){
                op.setText("✌");
                mensagem_derrota();
                derrota = derrota +1;
            }
            else if (x==0){
                op.setText("✊");
                mensagem_vitoria();
                vitoria = vitoria+1;
            }
        }
        else if (mao==2){
            if (x==2){
                op.setText("✌");
                mensagem_empate();
                empate = empate + 1;
            }
            else if (x==0){
                op.setText("✊");
                mensagem_derrota();
                derrota = derrota +1;
            }
            else if (x==1){
                op.setText("✋");
                mensagem_vitoria();
                vitoria = vitoria+1;
            }
        }

        v.setText("Vitoria: " + String.valueOf(vitoria));
        e.setText("Empate: " + String.valueOf(empate));
        d.setText("Derrota: " + String.valueOf(derrota));



        if(vitoria + empate + derrota == 5){/*
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {*/
                    Intent secondActivity = new Intent (JogoJogo.this , splashFinalJogo.class);
                    secondActivity.putExtra("vitoria", vitoria);
                    secondActivity.putExtra("derrota", derrota);
                    secondActivity.putExtra("empate", empate);
                    startActivity(secondActivity);
                }
            //}, 5000 );//time in milisecond
        //}
    }
}