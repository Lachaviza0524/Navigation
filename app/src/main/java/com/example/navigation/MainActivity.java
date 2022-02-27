package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FirstActivity(View view){
        Intent firstactivity = new Intent(this, FirstActivity.class);
        startActivity(firstactivity);
    }
    public void SecondActivity(View view){
        Intent secondactivity = new Intent(this, SecondActivity.class);
        startActivity(secondactivity);
    }
}