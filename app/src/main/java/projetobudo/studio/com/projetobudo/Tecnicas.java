package projetobudo.studio.com.projetobudo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class Tecnicas extends YouTubeBaseActivity{
// implements YouTubePlayer.OnInitializedListener {

    //private YouTubePlayerView youTubePlayerView;
    //private static final String GOOGLE_API_KEY = "AIzaSyCvsq0rc7jWCoB7WyBZ4fTIcIEZaUH6Hik";
    private ImageView botaoHome;
    private ImageView botaoHistoria;
    private ImageView botaoDicionario;
    private ImageView botaoExameDeFaixa;
    private Button botaoOsaekomi;
    private Button botaoAshiWaza;
    private Button botaoTeWaza;
    private Button botaoKoshiWaza;
    private Button botaoMasutemiWaza;
    private Button botaoKaeshiWaza;
    private Button botaoRenRakuRenkaWaza;
    private Button botaoShimeWaza;
    private Button botaoShiseiTaiSabaki;
    private Button botaoYokoSutemiWaza;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnicas);

        botaoHome = (ImageView) findViewById(R.id.botaoHomeId);
        botaoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, MainActivity.class));
            }
        });

        botaoDicionario = (ImageView) findViewById(R.id.botaoDicionarioId);
        botaoDicionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, Dicionario.class));
            }
        });


        botaoHistoria = (ImageView) findViewById(R.id.botaoHistoriaId);
        botaoHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, Historia.class));
            }
        });


        botaoExameDeFaixa = (ImageView) findViewById(R.id.botaoExameId);
        botaoExameDeFaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, ExameDeFaixa.class));
            }
        });

        botaoTeWaza = (Button) findViewById(R.id.button_tewaza);
        botaoTeWaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, TeWaza.class));
            }
        });

        botaoKoshiWaza = (Button) findViewById(R.id.button_koshiwaza);
        botaoKoshiWaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, KoshiWaza.class));
            }
        });
        botaoAshiWaza = (Button) findViewById(R.id.button_ashiwaza);
        botaoAshiWaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, AshiWaza.class));
            }
        });

        botaoMasutemiWaza = (Button) findViewById(R.id.button_masutemiwaza);
        botaoMasutemiWaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, MasutemiWaza.class));
            }
        });

        botaoYokoSutemiWaza = (Button) findViewById(R.id.button_yokotemiwaza);
        botaoYokoSutemiWaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, YokoSutemiWaza.class));
            }
        });

        botaoShiseiTaiSabaki = (Button) findViewById(R.id.button_taisabaki);
        botaoShiseiTaiSabaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, ShiseiTaiSabaki.class));
            }
        });

        botaoKaeshiWaza = (Button) findViewById(R.id.button_kaeshiwaza);
        botaoKaeshiWaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, KaeshiWaza.class));
            }
        });

        botaoRenRakuRenkaWaza = (Button) findViewById(R.id.button_renrakuwaza);
        botaoRenRakuRenkaWaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, RenrakuRenkaWaza.class));
            }
        });

        botaoShimeWaza = (Button) findViewById(R.id.button_shimewaza);
        botaoShimeWaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, ShimeWaza.class));
            }
        });

        //botaoTecnicas = (ImageView) findViewById(R.id.botaoTecnicasId);
        //botaoTecnicas.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  startActivity(new Intent(Tecnicas.this, Tecnicas.class));
     //       }
       // });

        botaoOsaekomi = (Button) findViewById(R.id.button_osaekomiwaza);
        botaoOsaekomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tecnicas.this, OsaekomiWaza.class));
            }
        });




    }

    }

