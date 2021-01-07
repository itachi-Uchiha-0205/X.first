package com.example.x_project;

import android.content.Intent;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;

public class Splash_0 extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_0);

        lottieAnimationView = findViewById(R.id.lottie);
        imageView = findViewById(R.id.img);

        imageView.animate().translationY(200).setDuration(800).setStartDelay(3000);
        lottieAnimationView.animate().translationY(-500).setDuration(1000).setStartDelay(3000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_0.this, Splash_Screen.class);
                startActivity(i);
                finish();
            }
        }, 6000);
    }

}