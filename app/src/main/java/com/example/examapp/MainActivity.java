package com.example.examapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("!@#", "My awesome btn1 been pressed");
                Toast.makeText(getApplicationContext(), "Ты нажал на кнопку 1", Toast.LENGTH_LONG).show();

            }
        });

        Button btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("!@#", "My awesome btn2 been pressed");
                Toast.makeText(getApplicationContext(), "Ты нажал на кнопку 2", Toast.LENGTH_LONG).show();

            }
        });

        Button btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("!@#", "My awesome btn3 been pressed");
                Toast.makeText(getApplicationContext(), "Ты нажал на кнопку 3", Toast.LENGTH_LONG).show();

            }
        });

        Button btn_4 = findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("!@#", "My awesome btn4 been pressed");
                Toast.makeText(getApplicationContext(), "Ты нажал на кнопку 4", Toast.LENGTH_LONG).show();

            }
        });

    }



}