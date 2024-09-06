package com.example.clase3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    //declarar dos clases de java
    private final MutableLiveData<Integer> localScore = new MutableLiveData<>();
    private final MutableLiveData<Integer> visitorScore = new MutableLiveData<>();

    //método main model
    public MainViewModel(){
        resetScores();
    }

    public LiveData<Integer> getLocalScore(){
        return localScore;
    }

    public LiveData<Integer> getVisitorScore(){
        return visitorScore;
    }

    //método para inicializar juego en 0 local y visitante
    void resetScores(){
        localScore.setValue(0);
        visitorScore.setValue(0);
    }

    //método para agregar puntos al local o visitante
    void addPointsToScore(int points, Boolean isLocal){
        if(isLocal){
            localScore.setValue(localScore.getValue() + points);
        }else {
            visitorScore.setValue(visitorScore.getValue() + points);
        }
    }
    //método para restar -1 al local
    void decreaseLocal(){
        if(localScore.getValue() > 0){
            localScore.setValue(localScore.getValue() -1);
        }
    }

    //método para restar -1 al visitante
    void decreaseVisitor(){
        if(visitorScore.getValue() > 0){
            visitorScore.setValue(visitorScore.getValue() -1);
        }
    }

}
