package com.example.laura_acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class popwin5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popwin5);
        Button close5 = (Button) findViewById(R.id.close5);
        close5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // code here for changing pages to web info
                startActivity(new Intent(popwin5.this, faq.class));
            }
        });
    }
}
