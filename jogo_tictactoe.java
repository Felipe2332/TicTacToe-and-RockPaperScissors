package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class jogo_tictactoe extends AppCompatActivity {
    int g = 0, x, jogadas = 0;
    int[][] matrix = new int[3][3];
    Button btn_voltar;
    Button btn_recomecar;
    TextView txtVez;
    ImageView iM1_1, iM1_2, iM1_3, iM2_1, iM2_2, iM2_3, iM3_1, iM3_2, iM3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_tictactoe);
        txtVez = /*(TextView) */ findViewById(R.id.txtVEz);

        iM1_1 = /*(ImageButton)*/ findViewById(R.id.img_1_1);
        iM1_2 = /*(ImageButton)*/ findViewById(R.id.img_1_2);
        iM1_3 = /*(ImageButton)*/ findViewById(R.id.img_1_3);
        iM2_1 = /*(ImageButton)*/ findViewById(R.id.img_2_1);
        iM2_2 = /*(ImageButton)*/ findViewById(R.id.img_2_2);
        iM2_3 = /*(ImageButton)*/ findViewById(R.id.img_2_3);
        iM3_1 = /*(ImageButton)*/ findViewById(R.id.img_3_1);
        iM3_2 = /*(ImageButton)*/ findViewById(R.id.img_3_2);
        iM3_3 = /*(ImageButton)*/ findViewById(R.id.img_3_3);
        btn_voltar = findViewById(R.id.btn_voltartic);
        btn_recomecar = findViewById(R.id.btn_recomecar);

        arruma_matrix();

        iM1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM1_1.setImageResource(R.drawable.x);
                    matrix[0][0] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM1_1.setImageResource(R.drawable.o);
                    matrix[0][0] = 1; //recebe O
                }

                iM1_1.setClickable(false);

                verificar();
            }
        });
        iM1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM1_2.setImageResource(R.drawable.x);
                    matrix[0][1] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM1_2.setImageResource(R.drawable.o);
                    matrix[0][1] = 1; //recebe O
                }

                iM1_2.setClickable(false);

                verificar();
            }
        });
        iM1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM1_3.setImageResource(R.drawable.x);
                    matrix[0][2] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM1_3.setImageResource(R.drawable.o);
                    matrix[0][2] = 1; //recebe O
                }

                iM1_3.setClickable(false);

                verificar();
            }
        });
        iM2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM2_1.setImageResource(R.drawable.x);
                    matrix[1][0] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM2_1.setImageResource(R.drawable.o);
                    matrix[1][0] = 1; //recebe O
                }

                iM2_1.setClickable(false);

                verificar();
            }
        });
        iM2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM2_2.setImageResource(R.drawable.x);
                    matrix[1][1] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM2_2.setImageResource(R.drawable.o);
                    matrix[1][1] = 1; //recebe O
                }

                iM2_2.setClickable(false);

                verificar();
            }
        });
        iM2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM2_3.setImageResource(R.drawable.x);
                    matrix[1][2] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM2_3.setImageResource(R.drawable.o);
                    matrix[1][2] = 1; //recebe O
                }

                iM2_3.setClickable(false);

                verificar();
            }
        });
        iM3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM3_1.setImageResource(R.drawable.x);
                    matrix[2][0] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM3_1.setImageResource(R.drawable.o);
                    matrix[2][0] = 1; //recebe O
                }

                iM3_1.setClickable(false);

                verificar();
            }
        });
        iM3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM3_2.setImageResource(R.drawable.x);
                    matrix[2][1] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM3_2.setImageResource(R.drawable.o);
                    matrix[2][1] = 1; //recebe O
                }

                iM3_2.setClickable(false);

                verificar();
            }
        });
        iM3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Ligação dos componentes da classe com os componentes da interface.
                jogar();
                if(x == 0)
                {
                    iM3_3.setImageResource(R.drawable.x);
                    matrix[2][2] = 0; //recebe X
                }
                else if(x == 1)
                {
                    iM3_3.setImageResource(R.drawable.o);
                    matrix[2][2] = 1; //recebe O
                }

                iM3_3.setClickable(false);

                verificar();
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(jogo_tictactoe.this, escolha_o_jogo.class);
                startActivity(t);
            }
        });

        btn_recomecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVez.setText("É a vez do jogador 1");
                iM1_1.setImageResource(R.drawable.imagem_branco2);
                iM1_2.setImageResource(R.drawable.imagem_branco2);
                iM1_3.setImageResource(R.drawable.imagem_branco2);
                iM2_1.setImageResource(R.drawable.imagem_branco2);
                iM2_2.setImageResource(R.drawable.imagem_branco2);
                iM2_3.setImageResource(R.drawable.imagem_branco2);
                iM3_1.setImageResource(R.drawable.imagem_branco2);
                iM3_2.setImageResource(R.drawable.imagem_branco2);
                iM3_3.setImageResource(R.drawable.imagem_branco2);

                iM1_1.setClickable(true);
                iM1_2.setClickable(true);
                iM1_3.setClickable(true);
                iM2_1.setClickable(true);
                iM2_2.setClickable(true);
                iM2_3.setClickable(true);
                iM3_1.setClickable(true);
                iM3_2.setClickable(true);
                iM3_3.setClickable(true);

                jogadas = 0;

                btn_recomecar.setVisibility(View.INVISIBLE);

                arruma_matrix();
            }
        });
    }

    public void jogar()
    {
        if(g == 1)
        {
            x = 1;
            jogadas++;
        }
        else if(g==0)
        {
            x = 0;
            jogadas++;
        }
    }

    public void verificar()
    {
        TextView txtVez = /*(TextView) */ findViewById(R.id.txtVEz);
        if(x==0)
        {
            g = 1;
            txtVez.setText("É a vez do jogador 2");
        }
        else if(x==1)
        {
            g = 0;
            txtVez.setText("É a vez do jogador 1");
        }

        ganhador();
    }

    public void ganhador()
    {
        txtVez = /*(TextView) */ findViewById(R.id.txtVEz);
        if ((matrix[0][0] == 0 && matrix[0][1] == 0 && matrix[0][2] == 0) || (matrix[1][0] == 0 && matrix[1][1] == 0 && matrix[1][2] == 0) || (matrix[2][0] == 0 && matrix[2][1] == 0 && matrix[2][2] == 0)
                || (matrix[0][0] == 0 && matrix[1][0] == 0 && matrix[2][0] == 0) || (matrix[0][1] == 0 && matrix[1][1] == 0 && matrix[2][1] == 0) || (matrix[0][2] == 0 && matrix[1][2] == 0 && matrix[2][2] == 0)
                || (matrix[0][0] == 0 && matrix[1][1] == 0 && matrix[2][2] == 0) || (matrix[0][2] == 0 && matrix[1][1] == 0 && matrix[2][0] == 0)) {
            txtVez.setText("Jogador 1 é o GANHADOR");
            //btn_voltar.setVisibility(View.VISIBLE);
            btn_recomecar.setVisibility(View.VISIBLE);
            esconde_baguiete();
        } else if ((matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1) || (matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1) || (matrix[2][0] == 1 && matrix[2][1] == 1 && matrix[2][2] == 1)
                || (matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1) || (matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1) || (matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1)
                || (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) || (matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1)) {
            txtVez.setText("Jogador 2 é o GANHADOR");
            //btn_voltar.setVisibility(View.VISIBLE);//erro nesse visible
            btn_recomecar.setVisibility(View.VISIBLE);
            esconde_baguiete();
        } else if (jogadas == 9) {
            txtVez.setText("Deu Empate");
            btn_recomecar.setVisibility(View.VISIBLE);
            esconde_baguiete();
        }
    }

    public  void arruma_matrix()
    {
        for(int l=0;l<3;l++)
        {
            for(int c=0;c<3;c++)
            {
                matrix[l][c] = -1;
            }
        }
    }

    public void esconde_baguiete ()
    {
        iM1_1.setClickable(false);
        iM1_2.setClickable(false);
        iM1_3.setClickable(false);
        iM2_1.setClickable(false);
        iM2_2.setClickable(false);
        iM2_3.setClickable(false);
        iM3_1.setClickable(false);
        iM3_2.setClickable(false);
        iM3_3.setClickable(false);
    }

}