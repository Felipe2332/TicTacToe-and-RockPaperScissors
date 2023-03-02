package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ptnJogar = findViewById(R.id.button);
        Button ptnFale = findViewById(R.id.button3);

        ptnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
            }
        });
        ptnFale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fale_conosco();
            }
        });
    }

    public void jogar (){
        Intent t = new Intent(MainActivity.this, escolha_o_jogo.class);
        startActivity(t);
        finish();
    }

    public void fale_conosco(){
        Intent tt = new Intent(MainActivity.this,FaleConosco.class);
        startActivity(tt);
    }
}