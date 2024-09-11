package com.example.a0709204;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private Button startBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        startBtn = findViewById(R.id.button);

        Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);

        startBtn.startAnimation(blinkAnimation);

    }


    public void Hoditb(View v)
    {
        Intent intent = new Intent (this, MainActivity3.class);
        startActivity(intent);
    }


    public void Topot(View v)
    {
        Intent intent = new Intent (this, MainActivity2.class);
        startActivity(intent);
    }
}