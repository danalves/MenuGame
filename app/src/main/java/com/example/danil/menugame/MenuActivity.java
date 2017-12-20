package com.example.danil.menugame;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Button btPlay;
    Button btSair;
    TextView tvHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btPlay = (Button)findViewById(R.id.btPlay);
        btSair = (Button)findViewById(R.id.btSair);
        tvHeader = (TextView)findViewById(R.id.tvHeader);

        Typeface fonte = Typeface.createFromAsset(getAssets(), "fonts/happy.ttf");

        btPlay.setTypeface(fonte);
        btSair.setTypeface(fonte);
        tvHeader.setTypeface(fonte);
    }

    public void play(View v){
        Toast.makeText(this, "O jogo ainda está sendo construído!", Toast.LENGTH_SHORT).show();
    }

    public void sair(View v){
        finish();
    }

}
