package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends Activity {
    ImageView img1,img2;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //textView=findViewById(R.id.text1);
        img1 = findViewById(R.id.bankLogo);
        //img2=findViewById(R.id.riyaLogo);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        }, 2500);
    }

}


