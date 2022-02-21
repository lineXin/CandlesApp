package com.example.bulbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton on;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        on = (ImageButton) findViewById(R.id.btnon);



    }

    public void turnOnLight(View view) {

        Toast.makeText(this, "ON", Toast.LENGTH_SHORT).show();
       setContentView(R.layout.lightoff);



    }


    public void turnOffLight(View view) {
        Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);



    }
}