package com.example.a0709204;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private ImageView animationIV;
    private Button startBtn;


    private AnimationDrawable frameAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);

        frameAnimation = (AnimationDrawable)animationIV.getDrawable();



        Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.common_animation);

        startBtn.startAnimation(blinkAnimation);


        startBtn.setOnClickListener(v -> {
            if (!frameAnimation.isRunning()) {
                frameAnimation.start();
            }
        });

    }
    public void Dalee(View v)
    {
        Intent intent = new Intent (this, MainActivity2.class);
        startActivity(intent);
    }
}