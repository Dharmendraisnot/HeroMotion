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

        spiderImage = findViewById(R.id.spiderImage);
        animateBtn = findViewById(R.id.animateBtn);

        animateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                spiderImage.animate()
                        .alpha(0.5f)          // fade
                        .scaleX(1.5f)         // zoom X
                        .scaleY(1.5f)         // zoom Y
                        .translationX(300f)   // move right
                        .translationY(-200f)  // move up
                        .setDuration(2000);   // 2 seconds
            }
        });
    }
}