package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void MenuTwo (View view){
        Intent menutwo = new Intent(this, MainActivity.class);
        startActivity(menutwo);
    }
    public void OneActivity (View view){
        Intent oneactivity = new Intent(this, FirstActivity.class);
        startActivity(oneactivity);
    }
}