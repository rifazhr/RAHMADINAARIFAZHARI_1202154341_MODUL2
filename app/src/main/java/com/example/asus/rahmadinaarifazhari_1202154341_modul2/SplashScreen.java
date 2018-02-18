package com.example.asus.rahmadinaarifazhari_1202154341_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private static int splashInterval = 2000; //lamanya splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() { //menjalankan spalsh screen


            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent

                Toast.makeText(SplashScreen.this,"RAHMADINA ARIFAZHARI_1202154341",Toast.LENGTH_LONG).show(); //membuat pop up messages

                //batas selesai Splashscreen
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    };
}