package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.clase3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //variables
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}