package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class guitarChords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar_chords);
    }

    public void back(View v){
        Intent i= new Intent(this, searchBar.class);
        startActivity(i);
    }

    public void close(View v){
        Intent i= new Intent(this, rabanaHome.class);
        startActivity(i);
    }
}