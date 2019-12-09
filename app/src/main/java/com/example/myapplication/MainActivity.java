package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
//import android.nfc.Tag;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

//import android.content.Context;
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Environment;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;


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
    LinearLayout chuchuLayout;
    ImageButton roundBack;
    Button instagramButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());


        Button start = findViewById(R.id.button);
        start.setOnClickListener(unused -> onClickStart());




    }
    protected void onClickStart() {
        setContentView(R.layout.activity_main);

        //top buttons
        donezo = findViewById(R.id.donezoButton);
        back = findViewById(R.id.startzoButton);
        //shirt buttons
        redButton = findViewById(R.id.redButton);
        blueButton = findViewById(R.id.bluebutton);
        whiteButton = findViewById(R.id.whiteButton);
        //misc buttons
        hatButton = findViewById(R.id.hatButton);
        bootButton = findViewById(R.id.bootButton);
        micButton = findViewById(R.id.micButton);
        //images on dog
        dog = findViewById(R.id.dog);
        redShirt = findViewById(R.id.redShirt);
        blueShirt = findViewById(R.id.blueShirt);
        whiteShirt = findViewById(R.id.whiteShirt);
        hat = findViewById(R.id.hat);
        boots = findViewById(R.id.boots);
        mic = findViewById(R.id.mic);
        //layouts
        shareLayout = findViewById(R.id.shareLayout);
        shirtLayout = findViewById(R.id.shirtLayout);
        miscLayout = findViewById(R.id.miscLayout);
        chuchuLayout = findViewById(R.id.ChuchuLayout);

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

        back.setOnClickListener(unused -> onClickBack());

        putClothesOnChuchu();

    }
    protected void onClickBack() {
        setContentView(R.layout.start_screen);
        Button start = findViewById(R.id.button);
        start.setOnClickListener(unused -> onClickStart());
        System.out.println("Back button clicked");
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
        donezo.setOnClickListener(unused -> onClickDone());

    }

    protected void onClickDone() {
        //"switch screen"
        donezo.setVisibility(View.INVISIBLE);
        back.setVisibility(View.INVISIBLE);
        shirtLayout.setVisibility(View.INVISIBLE);
        miscLayout.setVisibility(View.INVISIBLE);
        shareLayout.setVisibility(View.VISIBLE);

        //initialize buttons
        roundBack = findViewById(R.id.roundBack);
        instagramButton = findViewById(R.id.instagramButton);

        roundBack.setOnClickListener(unused -> {
            //"switch screen" back to how it was
            donezo.setVisibility(View.VISIBLE);
            back.setVisibility(View.VISIBLE);
            shirtLayout.setVisibility(View.VISIBLE);
            miscLayout.setVisibility(View.VISIBLE);
            shareLayout.setVisibility(View.INVISIBLE);
        });

        instagramButton.setOnClickListener(unused -> {
            System.out.println("instagram button clicked");
            chuchuLayout.setDrawingCacheEnabled(true);
            chuchuLayout.buildDrawingCache(true);
            Bitmap chuchuBitmap = Bitmap.createBitmap(chuchuLayout.getDrawingCache());
            chuchuLayout.setDrawingCacheEnabled(false);

            String path = Environment.getExternalStorageDirectory().toString() + "/myPhoto.jpg";

            try {
                FileOutputStream outputStream = new FileOutputStream(new File(path));
                chuchuBitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
                outputStream.flush();
                outputStream.close();
                chuchuBitmap.recycle();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("IO Exception");
            }

            System.out.println("Past storeScreenshot");


            ShareToInstagram aah = new ShareToInstagram(path, this);
            System.out.println("instagram button clicked");
            aah.onClickInsta();
        });

    }

}
