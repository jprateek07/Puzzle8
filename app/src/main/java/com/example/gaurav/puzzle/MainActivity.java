package com.example.gaurav.puzzle;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.InputStream;

//import pl.droidsonroids.gif.GifTextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    Button button;
    TextView appname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.start);
        appname = (TextView) findViewById( R.id.appname );
        final Animation animation;
        ImageView i=(ImageView)findViewById(R.id.img);
        Glide.with(MainActivity.this).load(R.drawable.load).into(i);

        final Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                button.setVisibility(View.VISIBLE);
            }
        },5000);

        // load the animation
//        animation = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.slide_up);
//
//        // set animation listener
//        animation.setAnimationListener(this);
//
//        final GifTextView loader = (GifTextView) findViewById( R.id.loader );
//        new Handler().postDelayed( new Runnable() {
//            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
//            @Override
//            public void run() {
//                loader.startAnimation( animation );
//            }
//        }, 5000);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        button.setVisibility( View.VISIBLE );
        appname.setVisibility(View.VISIBLE);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}