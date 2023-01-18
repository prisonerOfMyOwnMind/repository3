package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    Button button = null;
    ConstraintLayout linLayout = null;
    ConstraintLayout.LayoutParams lpView = null;
    Button btn = null;
    Button btn2 = null;
    ConstraintLayout.LayoutParams leftMarginParams = null;
    int count = 0;
    static int x = 2;

// todo: сделать новю активити на constraint layout. Чтобы открывалась при запуске приложения(это можно сделать через манифест)

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout linLayout = (ConstraintLayout) findViewById(R.id.layout1);
        ConstraintSet set = new ConstraintSet();
        ConstraintLayout.LayoutParams lpView = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);

        btn = new Button(this);
        btn.setText("Button 1");
        linLayout.addView(btn, 0);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                leftMarginParams.leftMargin = 0;
                leftMarginParams.topMargin = 100;
                Button btn1 = new Button(v.getContext());
                btn1.setText("Button " + x);
                btn1.setOnClickListener(this);

                linLayout.addView(btn1, 3);
                x++;


            }


        });
        //ConstraintLayout linLayout2 = findViewById(R.id.layout1);
        ConstraintLayout.LayoutParams lpView2 = new ConstraintLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        leftMarginParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        leftMarginParams.leftMargin = 300;
        leftMarginParams.topMargin = 150;
        btn2 = new Button(this);
        btn2.setText("Switch");
        btn2.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), MainActivity2.class
            );
            startActivity(secondActivityIntent);
        });
        linLayout.addView(btn2);


    }

}