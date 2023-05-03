package com.example.mobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String TEXT = "Не передалось";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        Bundle extras = getIntent().getExtras();
        TEXT = extras.getString(TEXT);
        TextView textView = findViewById(R.id.textViewc);
        textView.setText(TEXT);

    }
}