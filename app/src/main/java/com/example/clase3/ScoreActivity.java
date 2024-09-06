package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ScoreActivity extends AppCompatActivity{

    //variables
    public static final String LOCAL_SCORE_KEY = "local_score";
    public static final String VISITOR_SCORE_KEY = "visitor_score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }
}