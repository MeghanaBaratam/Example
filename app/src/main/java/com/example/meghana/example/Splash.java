package com.example.meghana.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by meghana on 30/5/16.
 */
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        final ImageView img = (ImageView) findViewById(R.id.imageView);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.animator.rotate);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.animator.blink);
        assert img != null;
        img.startAnimation(an);

        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                img.startAnimation(an2);
                finish();
                Log.d("start", "onAnimationEnd: ");
                Intent i = new Intent(Splash.this,MainActivity.class);
                startActivity(i);


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
    }




