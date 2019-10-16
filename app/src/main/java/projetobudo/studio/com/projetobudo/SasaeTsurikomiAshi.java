package projetobudo.studio.com.projetobudo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class SasaeTsurikomiAshi extends YouTubeBaseActivity
        implements YouTubePlayer.OnInitializedListener {

    private ImageView botaoHome;
    private ImageView botaoHistoria;
    private ImageView botaoDicionario;
    private ImageView botaoExameDeFaixa;
    private ImageView botaoTecnicas;

    private YouTubePlayerView youTubePlayerView;
    private static final String GOOGLE_API_KEY = "AIzaSyCvsq0rc7jWCoB7WyBZ4fTIcIEZaUH6Hik";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sasae_tsurikomi_ashi);



        botaoHome = (ImageView) findViewById(R.id.botaoHomeId);
        botaoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SasaeTsurikomiAshi.this, MainActivity.class));
            }
        });

        botaoDicionario = (ImageView) findViewById(R.id.botaoDicionarioId);
        botaoDicionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SasaeTsurikomiAshi.this, Dicionario.class));
            }
        });


        botaoHistoria = (ImageView) findViewById(R.id.botaoHistoriaId);
        botaoHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SasaeTsurikomiAshi.this, Historia.class));
            }
        });


        botaoExameDeFaixa = (ImageView) findViewById(R.id.botaoExameId);
        botaoExameDeFaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SasaeTsurikomiAshi.this, ExameDeFaixa.class));
            }
        });

        botaoTecnicas = (ImageView) findViewById(R.id.botaoTecnicasId);
        botaoTecnicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SasaeTsurikomiAshi.this, Tecnicas.class));
            }
        });



        youTubePlayerView = findViewById(R.id.video_sasae_tsurikomi_ashi_id);
        youTubePlayerView.initialize(GOOGLE_API_KEY, this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean foiRestaurado) {
        Toast.makeText(this, "Player iniciado com sucesso", Toast.LENGTH_SHORT).show();

        Log.i("estado_player", "estado: " + foiRestaurado);
        if (!foiRestaurado) {
            youTubePlayer.cueVideo("Lk7HX8kYJUc");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Erro ao iniciar o Player", Toast.LENGTH_SHORT).show();

    }
}

