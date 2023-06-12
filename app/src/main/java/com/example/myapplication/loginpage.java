package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
    }
    public void back(View v){
        Intent i= new Intent(this, Welcome.class);
        startActivity(i);
    }
    public void next(View n){
        Intent i = new Intent(this, rabanaHome.class);
        startActivity(i);
    }
}