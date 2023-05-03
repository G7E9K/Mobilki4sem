package com.example.mobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Mobile1";

    public void onButtonClick(View view){
        Log.i(TAG, "Clicked!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra(SecondActivity.TEXT, "Передалось");
        startActivity(intent);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        TextView tv = findViewById(R.id.textViewc);
        tv.setText("Установленный текст");
        ImageView iv = findViewById(R.id.imageViewc);
        iv.setBackgroundResource(R.drawable.mem);
        Button b = findViewById(R.id.buttonc);
        b.setText("Новая кнопка");

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i(TAG, "Clicked");
            }
        };
        b.setOnClickListener(onClickListener);
    }
}