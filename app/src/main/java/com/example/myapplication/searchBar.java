package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class searchBar extends AppCompatActivity {
private Button openKeyboardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bar);

        openKeyboardButton = findViewById(R.id.openkeyboard);
        openKeyboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKeyboard();
            }
        });
    }
    private void openKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }
    }


    public void search(View v){
        //show the soft keyboard
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(v, InputMethodManager.SHOW_IMPLICIT);
    }
    public void back(View v){
        Intent i= new Intent(this, rabanaHome.class);
        startActivity(i);
    }

    public void gnext(View n){
        Intent i = new Intent(this, guitarChords.class);
        startActivity(i);
    }

    public void vnext(View n){
        Intent i = new Intent(this, violinChords.class);
        startActivity(i);
    }
    public void pnext(View n){
        Intent i = new Intent(this, pianoChords.class);
        startActivity(i);
    }
}