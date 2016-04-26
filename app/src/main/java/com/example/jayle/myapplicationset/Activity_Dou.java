package com.example.jayle.myapplicationset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity_Dou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__dou);
        findViewById(R.id.btnFootball).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity_Dou.this,"Football Scores",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btnLibrary).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity_Dou.this,"Library",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
