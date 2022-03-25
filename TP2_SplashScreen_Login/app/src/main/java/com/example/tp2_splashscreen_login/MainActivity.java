package com.example.tp2_splashscreen_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton arrowTopIB=findViewById(R.id.arrowTop);
        EditText usernameET=findViewById(R.id.userNameET);
        EditText passwordET=findViewById(R.id.passwordET);
        TextView usernameTV=findViewById(R.id.userNameTV);
        TextView passwordTV=findViewById(R.id.passwordTV);
        Button button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        Home.class);

                Bundle b = new Bundle();
                b.putString("username", usernameET.getText().toString());
                b.putString("password", passwordET.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        });

        arrowTopIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
            }
        });
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
        Toast.makeText(getBaseContext(), "MainActivity::onStop",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();
        Toast.makeText(getBaseContext(), "MainActivity::onDestroy",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getBaseContext(), "MainActivity::onRestart",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(), "MainActivity::onPause",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), "MainActivity::onResume",
                Toast.LENGTH_LONG).show();
    }
}