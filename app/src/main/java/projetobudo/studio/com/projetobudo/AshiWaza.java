package projetobudo.studio.com.projetobudo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AshiWaza extends AppCompatActivity {

    private ImageView botaoHome;
    private ImageView botaoHistoria;
    private ImageView botaoDicionario;
    private ImageView botaoExameDeFaixa;
    private ImageView botaoTecnicas;
    private Button botaoDeashiharai;
    private Button botaoHizaguruma;
    private Button botaoSasaetsurikomiashi;
    private Button botaoOsotogari;
    private Button botaoOuchigari;
    private Button botaoKosotoGari;
    private Button botaoKouchigari;
    private Button botaoOkuriashiharai;
    private Button botaoUchimata;
    private Button botaoKosotogake;
    private Button botaoAshiGuruma;
    private Button botaoHaraitsurikomiashi;
    private Button botaoOguruma;
    private Button botaoOsotoguruma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashi_waza);

        botaoHome = (ImageView) findViewById(R.id.botaoHomeId);
        botaoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, MainActivity.class));
            }
        });

        botaoDicionario = (ImageView) findViewById(R.id.botaoDicionarioId);
        botaoDicionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, Dicionario.class));
            }
        });


        botaoHistoria = (ImageView) findViewById(R.id.botaoHistoriaId);
        botaoHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, Historia.class));
            }
        });


        botaoExameDeFaixa = (ImageView) findViewById(R.id.botaoExameId);
        botaoExameDeFaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, ExameDeFaixa.class));
            }
        });


        botaoTecnicas = (ImageView) findViewById(R.id.botaoTecnicasId);
        botaoTecnicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, Tecnicas.class));
            }
        });

        botaoDeashiharai = (Button) findViewById(R.id.button_ashiharai);
        botaoDeashiharai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, DeAshiHarai.class));
            }
        });

        botaoHizaguruma = (Button) findViewById(R.id.button_hizaguruma);
        botaoHizaguruma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, HizaGuruma.class));
            }
        });
        botaoSasaetsurikomiashi = (Button) findViewById(R.id.button_sasaetsurikomiashi);
        botaoSasaetsurikomiashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, SasaeTsurikomiAshi.class));
            }
        });

        botaoOsotogari = (Button) findViewById(R.id.button_osotogari);
        botaoOsotogari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, OsotoGari.class));
            }
        });

        botaoOuchigari = (Button) findViewById(R.id.button_ouchigari);
        botaoOuchigari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, OuchiGari.class));
            }
        });

        botaoKosotoGari = (Button) findViewById(R.id.button_kosotogari);
        botaoKosotoGari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, KosotoGari.class));
            }
        });

        botaoKosotogake = (Button) findViewById(R.id.button_kosotogake);
        botaoKosotogake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, KosotoGake.class));
            }
        });

        botaoKouchigari = (Button) findViewById(R.id.button_kouchigari);
        botaoKouchigari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, KouchiGari.class));
            }
        });

        botaoOkuriashiharai = (Button) findViewById(R.id.button_okuriashiharai);
        botaoOkuriashiharai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, OkuriAshiHarai.class));
            }
        });

                botaoUchimata = (Button) findViewById(R.id.button_uchimata);
                botaoUchimata.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(AshiWaza.this, UchiMata.class));
                    }
                });

                botaoAshiGuruma = (Button) findViewById(R.id.button_ashiguruma);
                botaoAshiGuruma.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(AshiWaza.this, AshiGuruma.class));
                    }
                });

                botaoHaraitsurikomiashi = (Button) findViewById(R.id.button_haraitsurikomiashi);
                botaoHaraitsurikomiashi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(AshiWaza.this, HaraiTsurikomiAshi.class));
                    }
                });

                botaoOguruma = (Button) findViewById(R.id.button_oguruma);
                botaoOguruma.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(AshiWaza.this, OGuruma.class));
                    }
                });

        botaoOsotoguruma = (Button) findViewById(R.id.button_osotoguruma);
        botaoOsotoguruma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AshiWaza.this, OsotoGuruma.class));
            }
        });

    }
}
