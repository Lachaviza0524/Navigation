package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void MenuOne (View view){
        Intent menuone = new Intent(this, MainActivity.class);
        startActivity(menuone);
    }
    public void TwoActivity (View view){
        Intent twoactivity = new Intent(this, SecondActivity.class);
        startActivity(twoactivity);
    }
}