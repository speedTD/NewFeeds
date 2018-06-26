package com.developer.dinhduy.animation_demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout lay1,lay2;
Button Btn;
Animation topup,topdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay1=(LinearLayout) findViewById(R.id.lay11);
        lay2=(LinearLayout) findViewById(R.id.lay12);
        Btn=(Button) findViewById(R.id.btn);
        topup= AnimationUtils.loadAnimation(this,R.anim.toup);
        topdown=AnimationUtils.loadAnimation(this,R.anim.uptodown);

        lay1.setAnimation(topdown);
        lay2.setAnimation(topup);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 startActivity(new Intent(MainActivity.this,HomeActivity.class));

                Toast.makeText(MainActivity.this, "Complied", Toast.LENGTH_SHORT).show();






            }
        });


    }
}
