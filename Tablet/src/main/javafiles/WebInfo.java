package com.example.laura_acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WebInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_info);

    Button backbtn = (Button) findViewById(R.id.backbtn);
    backbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // code here for changing pages to web info
                startActivity(new Intent(WebInfo.this, MainActivity2.class));
            }
        });
    }
}
