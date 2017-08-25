package com.rich.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView animationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationView= (LottieAnimationView) findViewById(R.id.animation_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        animationView.setProgress(0f)  ;
//        animationView.playAnimation();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        animationView.cancelAnimation();
    }
}
