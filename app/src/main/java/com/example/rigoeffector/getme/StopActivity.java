package com.example.rigoeffector.getme;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StopActivity extends AppCompatActivity {
Button img;
ImageView im;
TextView t,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        img=(Button) findViewById(R.id.imadd);
        t=(TextView)findViewById(R.id.sourceTXT);
        Typeface myface= Typeface.createFromAsset(getAssets(),"fonts/CaviarDreams.ttf");
        t.setTypeface(myface);
        p=(TextView)findViewById(R.id.yourmap);
        Typeface myface2=Typeface.createFromAsset(getAssets(),"fonts/CaviarDreams.ttf");
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StopActivity.this,LinesActivity.class));
            }
        });

        im=(ImageView) findViewById(R.id.imadds);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StopActivity.this,LinesActivity.class));
            }
        });
    }
}
