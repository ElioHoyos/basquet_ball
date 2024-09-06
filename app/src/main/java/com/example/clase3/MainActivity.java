package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.clase3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //variables
    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

    }

    //método de acciones de los botones del app
    private void setupButtons(){
        //-1 al local
        binding.localMinusButton.setOnClickListener(v -> {
            viewModel.decreaseLocal();
        });
        //+1 al local
        binding.localPlusButton.setOnClickListener(v -> {
            addPointsToScore(1, true);
        });
        //+2 al local
        binding.localTwoPointsButton.setOnClickListener(v -> {
            addPointsToScore(2, true);
        });
        //-1 al visitante
        binding.visitorMinusButton.setOnClickListener(v -> {
            viewModel.decreaseVisitor();
        });
        //+1 del visitante
        binding.visitorPlusButton.setOnClickListener(v -> {
            addPointsToScore(1, false);
        });
        //+2 del visitante
        binding.visitorTwoPointsButton.setOnClickListener(v -> {
            addPointsToScore(2, false);
        });
        //método para reiniciar el juego
        binding.restarButton.setOnClickListener(v -> {
            resetScores();
        });
        //iniciar
        binding.resultButton.setOnClickListener(v -> {
            startScoreActivity();
        });

    }

    //método para invocar los puntos de la clase MainViewModel
    private void addPointsToScore(int points, Boolean isLocal){
        viewModel.addPointsToScore(points, isLocal);
    }
    //LOCAL_SCORE_KEY SON VARIABLES QUE FALTAN DECLARAR
    private void startScoreActivity(){
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra(ScoreActivity.LOCAL_SCORE_KEY,viewModel.getLocalScore().getValue());
        intent.putExtra(ScoreActivity.VISITOR_SCORE_KEY,viewModel.getVisitorScore().getValue());
        //arranque el juego de la suma de puntos
        startActivity(intent);
    }
    //resetear resultado de los puntos | invocamos al método de la clase MainViewModel resetScores
    private void resetScores(){
        viewModel.resetScores();
    }

}