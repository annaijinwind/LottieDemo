package com.rich.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.sahasbhop.apngview.ApngDrawable;
import com.github.sahasbhop.apngview.ApngImageLoader;

public class TwonActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twon);
        ApngImageLoader.getInstance().init(getApplicationContext());
        imageView= (ImageView) findViewById(R.id.imageView);
        String uri = "assets://apng/yindao.png";
        ApngImageLoader.getInstance().displayImage(uri, imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApngDrawable apngDrawable = ApngDrawable.getFromView(v);
                if (apngDrawable == null) return;

                if (apngDrawable.isRunning()) {
                    apngDrawable.stop(); // Stop animation
                } else {
                    apngDrawable.setNumPlays(3); // Fix number of repetition
                    apngDrawable.start(); // Start animation
                }
            }
        });
    }
}
