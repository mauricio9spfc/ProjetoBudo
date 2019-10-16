package projetobudo.studio.com.projetobudo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dicionario extends Activity {

    private ImageView botaoHome;
    private ImageView botaoHistoria;
    private ImageView botaoDicionario;
    private ImageView botaoExameDeFaixa;
    private ImageView botaoTecnicas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicionario);

        botaoHome = (ImageView) findViewById(R.id.botaoHomeId);
        botaoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dicionario.this, MainActivity.class));
            }
        });

        botaoHistoria = (ImageView) findViewById(R.id.botaoHistoriaId);
        botaoHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dicionario.this, Historia.class));
            }
        });


        botaoTecnicas = (ImageView) findViewById(R.id.botaoTecnicasId);
        botaoTecnicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dicionario.this, Tecnicas.class));
            }
        });


        botaoExameDeFaixa = (ImageView) findViewById(R.id.botaoExameId);
        botaoExameDeFaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dicionario.this, ExameDeFaixa.class));
            }
        });


    }
}
