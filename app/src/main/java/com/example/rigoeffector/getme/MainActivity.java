package com.example.rigoeffector.getme;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;

public class MainActivity extends AppCompatActivity {
TextView t,kgl;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        t=(TextView)findViewById(R.id.myfont);
        Typeface myface=Typeface.createFromAsset(getAssets(),"fonts/RobotoSlab-Bold.ttf");
        t.setTypeface(myface);
        kgl=(TextView) findViewById(R.id.textView);
        Typeface myface2=Typeface.createFromAsset(getAssets(),"fonts/CaviarDreams.ttf");
        kgl.setTypeface(myface2);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new  Intent(MainActivity.this,StopActivity.class));
            }
        });

    }
}
