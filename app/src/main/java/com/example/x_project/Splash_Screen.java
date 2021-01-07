package com.example.x_project;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;

public class Splash_Screen extends AppCompatActivity {

    LottieAnimationView  lottieAnimationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        lottieAnimationView2 = findViewById(R.id.anim1);

        lottieAnimationView2.animate().setDuration(3000).setStartDelay(3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 4000);
    }
}