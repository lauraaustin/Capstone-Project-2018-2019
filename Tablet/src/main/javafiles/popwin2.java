package com.example.laura_acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class popwin2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popwin2);

        Button close2 = (Button) findViewById(R.id.close2);
        close2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // code here for changing pages to web info
                startActivity(new Intent(popwin2.this, faq.class));
            }
        });
    }
}
