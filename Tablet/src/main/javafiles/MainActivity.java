package com.example.laura_acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton searchImageButton= (ImageButton) findViewById(R.id.searchImageButton);
        searchImageButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.searchImageButton:
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
                /* Using QiSDK:
                @Override
public void onRobotFocusGained(QiContext qiContext) {
    // Create a new say action.
    Say say = SayBuilder.with(qiContext) // Create the builder with the context.
                        .withText("Hello human! I am Salt! Ask me questions, or use my tablet to learn more.") // Set the text to say.
                        .build(); // Build the say action.

    // Execute the action.
    say.run();
}
                */
                break;
            default:
                break;
        }
    }
}