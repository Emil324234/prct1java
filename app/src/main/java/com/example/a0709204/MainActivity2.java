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

public class MainActivity2 extends AppCompatActivity {

    private ImageView animationIV;
    private Button startBtn;


    private AnimationDrawable frameAnimation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);
        Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);


        startBtn.startAnimation(blinkAnimation);

        startBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                animationIV.startAnimation(blinkAnimation);
            }
        });
    }

    public void Menu(View v)
    {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }


}