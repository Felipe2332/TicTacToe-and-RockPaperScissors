package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FaleConosco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fale_conosco);


        Button ptnVoltar = findViewById(R.id.btn_voltar);

        ptnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar();
            }
        });
    }

    public void voltar (){
        Intent t = new Intent(FaleConosco.this, MainActivity.class);
        startActivity(t);
        finish();
    }

}