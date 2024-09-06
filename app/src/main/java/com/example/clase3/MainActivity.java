package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

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

    //método
    private void setupButtons(){

        binding.localMinusButton.setOnClickListener(v -> {

        });

        binding.localPlusButton.setOnClickListener(v -> {

        });

        binding.localTwoPointsButton.setOnClickListener(v -> {

        });

        binding.visitorMinusButton.setOnClickListener(v -> {

        });

        binding.visitorPlusButton.setOnClickListener(v -> {

        });

        binding.visitorTwoPointsButton.setOnClickListener(v -> {

        });

        binding.restarButton.setOnClickListener(v -> {

        });

        binding.resultButton.setOnClickListener(v -> {

        });

    }

}