package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity2 extends AppCompatActivity
{
    Button btn12 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn12 = findViewById(R.id.button12);
        btn12.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), MainActivity.class
            );
            startActivity(secondActivityIntent);
        });

    }
    public void function(View view)
    {
        setContentView(R.layout.activity_main);

    }


}