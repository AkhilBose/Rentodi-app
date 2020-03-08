package com.Byteinfotech.atto.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.Byteinfotech.atto.dblistview.R;

public class Splash extends AppCompatActivity {

    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);



        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            public void run() {
                Intent myIntent = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(myIntent);
                finish();
            }
        }, 3700);
            }



}
