package com.example.mobile1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Mobile1";

    public MainActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.w(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.v(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

}