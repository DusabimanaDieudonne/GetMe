package com.example.rigoeffector.getme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LinesActivity extends AppCompatActivity {
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lines);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        im=(ImageView) findViewById(R.id.images);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinesActivity.this,SourceActivity.class));
            }
        });
    }
}
