package com.example.laura_acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button learnmoreButton = (Button) findViewById(R.id.learnmoreButton);
        learnmoreButton.setOnClickListener(this);

        Button projbtn = (Button) findViewById(R.id.projbtn);
        projbtn.setOnClickListener(this);

        Button aboutmebtn = (Button) findViewById(R.id.aboutmebtn);
        aboutmebtn.setOnClickListener(this);

        Button backbtn4 = (Button) findViewById(R.id.backbtn4);
        backbtn4.setOnClickListener(this);

        Button faqbtn = (Button) findViewById(R.id.faqbtn);
        faqbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.learnmoreButton:
                startActivity(new Intent(MainActivity2.this, WebInfo.class));
                break;
            case R.id.projbtn:
                startActivity(new Intent(MainActivity2.this, ProjInfo.class));
                break;
            case R.id.aboutmebtn:
                startActivity(new Intent(MainActivity2.this, aboutsalt.class));
                break;
            case R.id.backbtn4:
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
                break;
            case R.id.faqbtn:
                startActivity(new Intent(MainActivity2.this, faq.class));
                break;
            default:
                break;
        }

    }
}