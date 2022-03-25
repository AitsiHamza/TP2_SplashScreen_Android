package com.example.tp2_splashscreen_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Toast.makeText(getBaseContext(), "Hello!",Toast.LENGTH_LONG).show();

        /****** Create Thread that will sleep for 5 seconds****/
        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    ProgressBar progressBar=(ProgressBar)findViewById(R.id.progressBar);
                    for(int i=0;i<100;i++){
                        progressBar.setProgress(i);
                        sleep(50);
                    }

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(), LoginActivity.class);
                    startActivity(i);

                    //Remove activity
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        // start thread
        background.start();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(), "SplashScreen::onStart",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getBaseContext(), "SplashScreen::onStop",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();
        Toast.makeText(getBaseContext(), "SplashScreen::onDestroy",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getBaseContext(), "SplashScreen::onRestart",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(), "SplashScreen::onPause",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), "SplashScreen::onResume",
                Toast.LENGTH_LONG).show();
    }
}