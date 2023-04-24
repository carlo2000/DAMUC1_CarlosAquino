package com.example.damuc1_carlosaquino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Entramos al metodo onCreate()");
    }
    @Override
    protected void  onRestart(){
        super.onRestart();
        System.out.println("Entramos al metodo onRestart()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("Entramos al metodo onPause()");
    }

    @Override
    protected void  onStart(){
        super.onStart();
        System.out.println("Entramos al metodo onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("Entramos al metodo onResume");
    }

    @Override
    protected void onStop(){
        super.onStop();
        System.out.println("Entramos al metodo onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("Entramos al metodo onDestroy");
    }
}