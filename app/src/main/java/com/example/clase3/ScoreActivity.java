package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.clase3.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity{

    //variables
    public static final String LOCAL_SCORE_KEY = "local_score";
    public static final String VISITOR_SCORE_KEY = "visitor_score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityScoreBinding binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //variables
        int localScore = getIntent().getExtras().getInt(LOCAL_SCORE_KEY);
        int visitorScore = getIntent().getExtras().getInt(VISITOR_SCORE_KEY);

        binding.scoreText.setText(getString(R.string.local_visitor_score_format, localScore, visitorScore));

        //algoritmo if
        if(localScore > visitorScore){
            binding.whoWonText.setText("Gano el local");
        }else if(visitorScore > localScore){
            binding.whoWonText.setText("Gano el visitante");
        }else{
            binding.whoWonText.setText("Resultado iguales ( ͡❛ ︵ ͡❛)");
        }


    }
}