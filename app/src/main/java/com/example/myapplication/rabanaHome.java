package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class rabanaHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rabanahome);
    }

    public void next(View n){
        Intent i = new Intent(rabanaHome.this, MainActivity.class);
        startActivity(i);
    }
    public void artist(View n){
        Intent i = new Intent(rabanaHome.this, artists.class);
        startActivity(i);
    }
}
