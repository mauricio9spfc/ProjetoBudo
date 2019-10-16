package projetobudo.studio.com.projetobudo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {


    private int position = 0;
    private MediaController mediaController;
    private ImageView botaoConhecer;
    private ImageView botaoHistoria;
    private ImageView botaoDicionario;
    private ImageView botaoExameDeFaixa;
    private ImageView botaoTecnicas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoConhecer = (ImageView)findViewById(R.id.botaoConhecerId);
        botaoConhecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,VenhaNosConhecer.class));
            }
        });

            botaoExameDeFaixa = (ImageView) findViewById(R.id.botaoExameId);
            botaoExameDeFaixa.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, ExameDeFaixa.class));
                }
            });
        botaoHistoria = (ImageView) findViewById(R.id.botaoHistoriaId);
        botaoHistoria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Historia.class));
            }
        });

        botaoDicionario = (ImageView) findViewById(R.id.botaoDicionarioId);
        botaoDicionario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Dicionario.class));
            }
        });

        botaoTecnicas = (ImageView) findViewById(R.id.botaoTecnicasId);
        botaoTecnicas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Tecnicas.class));
            }
        });






        final VideoView videoView = (VideoView) findViewById(R.id.videoView);

        if(mediaController==null){
            mediaController=new MediaController(MainActivity.this);

            mediaController.setAnchorView(videoView);

            videoView.setMediaController(mediaController);
        }

        videoView.requestFocus();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                videoView.seekTo(position);
                if (position ==0){
                    videoView.start();
                }
            mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                @Override
                public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i1) {
                    mediaController.setAnchorView(videoView);
                }
            });
            }


        });
      videoView.setVideoPath("android.resource://projetobudo.studio.com.projetobudo/" +R.raw.video_budo);




    }


}
