package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Button start = findViewById(R.id.button);
        start.setOnClickListener(unused -> onClickStart());

        Button donezo = findViewById(R.id.donezoButton);
        ImageButton redButton = findViewById(R.id.redButton);
        ImageButton blueButton = findViewById(R.id.bluebutton);
        ImageButton whiteButton = findViewById(R.id.whiteButton);
        ImageButton hatButton = findViewById(R.id.hatButton);
        ImageButton bootButton = findViewById(R.id.bootButton);
        ImageButton micButton = findViewById(R.id.micButton);
        ImageView dog = findViewById(R.id.dog);
        ImageView redShirt = findViewById(R.id.redShirt);
        ImageView blueShirt = findViewById(R.id.blueShirt);
        ImageView whiteShirt = findViewById(R.id.whiteShirt);
        ImageView hat = findViewById(R.id.hat);
        ImageView boots = findViewById(R.id.boots);
        ImageView mic = findViewById(R.id.mic);

        //redButton.setOnClickListener();
        //whiteButton.setOnClickListener();

    }
    protected void onClickStart() {
        setContentView(R.layout.activity_main);
    }
}
