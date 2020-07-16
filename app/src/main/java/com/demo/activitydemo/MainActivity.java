package com.demo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    
    String TAG = "Activity LifeCycle";

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: I'm on OnCreate Method");

        button = findViewById(R.id.btn_click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getBaseContext(),SecondActivity.class));

            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: I'm On Start Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: I'm on onResume Method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: I'm on onPause Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: I'm on onDestory Method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: I'm on onRestart Method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: I'm on onStop Method");
    }
}