package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    Button donezo;
    Button back;
    ImageButton redButton;
    ImageButton blueButton;
    ImageButton whiteButton;
    ImageButton hatButton;
    ImageButton bootButton;
    ImageButton micButton;
    ImageView dog;
    ImageView redShirt;
    ImageView blueShirt;
    ImageView whiteShirt;
    ImageView hat;
    ImageView boots;
    ImageView mic;
    LinearLayout shareLayout;
    LinearLayout shirtLayout;
    LinearLayout miscLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);


        Button start = findViewById(R.id.button);
        start.setOnClickListener(unused -> onClickStart());

        //chuchu is naked.



    }
    protected void onClickStart() {
        setContentView(R.layout.activity_main);

        donezo = findViewById(R.id.donezoButton);
        back = findViewById(R.id.startzoButton);
        redButton = findViewById(R.id.redButton);
        blueButton = findViewById(R.id.bluebutton);
        whiteButton = findViewById(R.id.whiteButton);
        hatButton = findViewById(R.id.hatButton);
        bootButton = findViewById(R.id.bootButton);
        micButton = findViewById(R.id.micButton);
        dog = findViewById(R.id.dog);
        redShirt = findViewById(R.id.redShirt);
        blueShirt = findViewById(R.id.blueShirt);
        whiteShirt = findViewById(R.id.whiteShirt);
        hat = findViewById(R.id.hat);
        boots = findViewById(R.id.boots);
        mic = findViewById(R.id.mic);
        shareLayout = findViewById(R.id.shareLayout);
        shirtLayout = findViewById(R.id.shirtLayout);
        miscLayout = findViewById(R.id.miscLayout);

        //show clothing layouts
        shirtLayout.setVisibility(View.VISIBLE);
        miscLayout.setVisibility(View.VISIBLE);

        //don't show share layout
        shareLayout.setVisibility(View.INVISIBLE);

        redShirt.setVisibility(View.INVISIBLE);
        blueShirt.setVisibility(View.INVISIBLE);
        whiteShirt.setVisibility(View.INVISIBLE);
        hat.setVisibility(View.INVISIBLE);
        boots.setVisibility(View.INVISIBLE);
        mic.setVisibility(View.INVISIBLE);
        //chuchu is naked.

        putClothesOnChuchu();

    }

    protected void ChuchuActivity() {


        back.setOnClickListener(unused -> onClickBack());

        //redButton.setOnClickListener();
        //whiteButton.setOnClickListener();
    }

    protected void onClickBack() {
        setContentView(R.layout.start_screen);
    }
    protected void putClothesOnChuchu() {
        redButton.setOnClickListener(unused -> {
            if (redShirt.getVisibility() == View.VISIBLE) {
                redShirt.setVisibility(View.INVISIBLE);
            } else {
                redShirt.setVisibility(View.VISIBLE);
            }
            if (whiteShirt.getVisibility() == View.VISIBLE) {
                whiteShirt.setVisibility(View.INVISIBLE);
            }
            if (blueShirt.getVisibility() == View.VISIBLE) {
                blueShirt.setVisibility(View.INVISIBLE);
            }
        });
        blueButton.setOnClickListener(unused -> {
            if (blueShirt.getVisibility() == View.VISIBLE) {
                blueShirt.setVisibility(View.INVISIBLE);
            } else {
                blueShirt.setVisibility(View.VISIBLE);
            }
            if (whiteShirt.getVisibility() == View.VISIBLE) {
                whiteShirt.setVisibility(View.INVISIBLE);
            }
            if (redShirt.getVisibility() == View.VISIBLE) {
                redShirt.setVisibility(View.INVISIBLE);
            }
        });
        whiteButton.setOnClickListener(unused -> {
            if (whiteShirt.getVisibility() == View.VISIBLE) {
                whiteShirt.setVisibility(View.INVISIBLE);
            } else {
                whiteShirt.setVisibility(View.VISIBLE);
            }
            if (redShirt.getVisibility() == View.VISIBLE) {
                redShirt.setVisibility(View.INVISIBLE);
            }
            if (blueShirt.getVisibility() == View.VISIBLE) {
                blueShirt.setVisibility(View.INVISIBLE);
            }
        });
        hatButton.setOnClickListener(unused -> {
            if (hat.getVisibility() == View.VISIBLE) {
                hat.setVisibility(View.INVISIBLE);
            } else {
                hat.setVisibility(View.VISIBLE);
            }

        });
        bootButton.setOnClickListener(unused -> {
            if (boots.getVisibility() == View.VISIBLE) {
                boots.setVisibility(View.INVISIBLE);
            } else {
                boots.setVisibility(View.VISIBLE);
            }
        });
        micButton.setOnClickListener(unused -> {
            if (mic.getVisibility() == View.VISIBLE) {
                mic.setVisibility(View.INVISIBLE);
            } else {
                mic.setVisibility(View.VISIBLE);
            }
        });
        donezo.setOnClickListener(unused -> {
            donezo.setVisibility(View.INVISIBLE);
            back.setVisibility(View.INVISIBLE);
            shirtLayout.setVisibility(View.INVISIBLE);
            miscLayout.setVisibility(View.INVISIBLE);
            shareLayout.setVisibility(View.VISIBLE);
        });

    }


}
