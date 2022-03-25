package com.example.tp2_splashscreen_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();

        Bundle b = intent.getExtras();
        String username = b.getString("username");
        String password = b.getString("password");

        TextView  usernameTV= (TextView)findViewById(R.id.username);
        usernameTV.setText(username);
        TextView passwordTV = (TextView)findViewById(R.id.password);
        passwordTV.setText(password);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle b = intent.getExtras();
        String username = b.getString("username");
        String password = b.getString("password");

        TextView  usernameTV= (TextView)findViewById(R.id.username);
        usernameTV.setText(username);
        TextView passwordTV = (TextView)findViewById(R.id.password);
        passwordTV.setText(password);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(), "MainActivity::onStart",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getBaseContext(), "Home::onStop",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();
        Toast.makeText(getBaseContext(), "Home::onDestroy",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getBaseContext(), "Home::onRestart",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(), "Home::onPause",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), "Home::onResume",
                Toast.LENGTH_LONG).show();
    }
}