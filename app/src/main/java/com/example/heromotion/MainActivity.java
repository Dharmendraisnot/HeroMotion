package com.example.heromotion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView spiderImage;
    Button animateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button leftBtn = findViewById(R.id.leftBtn);
        Button rightBtn = findViewById(R.id.rightBtn);

        leftBtn.setOnClickListener(v ->
                spiderImage.animate()
                        .translationXBy(-100f)
                        .setDuration(500)
        );

        rightBtn.setOnClickListener(v ->
                spiderImage.animate()
                        .translationXBy(100f)
                        .setDuration(500)
        );

        spiderImage = findViewById(R.id.spiderImage);
        animateBtn = findViewById(R.id.animateBtn);

        animateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                spiderImage.animate()
                        .alpha(0.3f)
                        .scaleX(1.5f)
                        .scaleY(1.5f)
                        .translationX(200f)
                        .setDuration(1500)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {

                                spiderImage.animate()
                                        .alpha(1f)
                                        .scaleX(1f)
                                        .scaleY(1f)
                                        .translationX(0f)
                                        .setDuration(1500);
                            }
                        });
            }
        });
    }
}