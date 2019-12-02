package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    Button donezo = findViewById(R.id.donezoButton);
    Button back = findViewById(R.id.startzoButton);
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Button start = findViewById(R.id.button);
        start.setOnClickListener(unused -> onClickStart());
        redShirt.setVisibility(View.INVISIBLE);
        blueShirt.setVisibility(View.INVISIBLE);
        whiteShirt.setVisibility(View.INVISIBLE);
        hat.setVisibility(View.INVISIBLE);
        boots.setVisibility(View.INVISIBLE);
        mic.setVisibility(View.INVISIBLE);
        //chuchu is naked.



    }
    protected void onClickStart() {
        setContentView(R.layout.activity_main);
    }

    protected void ChuchuActivity() {


        back.setOnClickListener(unused -> onClickBack());

        //redButton.setOnClickListener();
        //whiteButton.setOnClickListener();
    }

    protected void onClickBack() {
        setContentView(R.layout.start_screen);
    }
    protected void putClothesonChuchu() {
        redButton.setOnClickListener(unused -> {
            redShirt.setVisibility(View.VISIBLE);
            if (whiteShirt.getVisibility() == View.VISIBLE) {
                whiteShirt.setVisibility(View.INVISIBLE);
            }
            if (blueShirt.getVisibility() == View.VISIBLE) {
                blueShirt.setVisibility(View.INVISIBLE);
            }
        });
        blueButton.setOnClickListener(unused -> {
            blueShirt.setVisibility(View.VISIBLE);
            if (whiteShirt.getVisibility() == View.VISIBLE) {
                whiteShirt.setVisibility(View.INVISIBLE);
            }
            if (redShirt.getVisibility() == View.VISIBLE) {
                redShirt.setVisibility(View.INVISIBLE);
            }
        });
        whiteButton.setOnClickListener(unused -> {
            whiteShirt.setVisibility(View.VISIBLE);
            if (redShirt.getVisibility() == View.VISIBLE) {
                redShirt.setVisibility(View.INVISIBLE);
            }
            if (blueShirt.getVisibility() == View.VISIBLE) {
                blueShirt.setVisibility(View.INVISIBLE);
            }
        });
        hatButton.setOnClickListener(unused ->
                hat.setVisibility(View.VISIBLE));
        bootButton.setOnClickListener(unused ->
                boots.setVisibility(View.VISIBLE));
        micButton.setOnClickListener(unused ->
                mic.setVisibility(View.VISIBLE));



    }


}
