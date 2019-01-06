package com.example.laura_acer.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class faq extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        Button pop1 = (Button) findViewById(R.id.pop1);
        pop1.setOnClickListener(this);

        Button pop2 = (Button) findViewById(R.id.pop2);
        pop2.setOnClickListener(this);

        Button pop3 = (Button) findViewById(R.id.pop3);
        pop3.setOnClickListener(this);

        Button pop4 = (Button) findViewById(R.id.pop4);
        pop4.setOnClickListener(this);

        Button pop5 = (Button) findViewById(R.id.pop5);
        pop5.setOnClickListener(this);

        Button backbtn5 = (Button) findViewById(R.id.backbtn5);
        backbtn5.setOnClickListener(this); }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.pop1:
                    startActivity(new Intent(faq.this, popwin1.class));
                    break;
                case R.id.pop2:
                    startActivity(new Intent(faq.this, popwin2.class));
                    break;
                case R.id.pop3:
                    startActivity(new Intent(faq.this, popwin3.class));
                    break;
                case R.id.pop4:
                    startActivity(new Intent(faq.this, popwin4.class));
                    break;
                case R.id.backbtn5:
                    startActivity(new Intent(faq.this, MainActivity2.class));
                    break;
                case R.id.pop5:
                    startActivity(new Intent(faq.this, popwin5.class));
                    break;
                default:
                    break;
            }

        }




}
