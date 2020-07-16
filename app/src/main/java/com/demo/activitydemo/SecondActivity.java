package com.demo.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate: I'm on OnCreate Method");

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
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: I'm on onStop Method");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: I'm on onRestart Method");
    }




}