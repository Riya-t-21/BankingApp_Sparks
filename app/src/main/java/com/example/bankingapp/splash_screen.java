package com.example.bankingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends Activity {

    TextView designed, name, app_name;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = findViewById(R.id.riyaLogo);


        new Handler().postDelayed(() -> {

        }, 1000);

        new Handler().postDelayed(() -> {


            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();

        }, 2500);
    }


}

