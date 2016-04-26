package com.example.jayle.myapplicationset;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnApp1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Spotify Streamer",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btnApp2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Activity_Dou.class);
                startActivity(i);
            }
        });
        findViewById(R.id.btnApp3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"工程大突破",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btnApp4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"XYZ阅读器",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btnApp5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Capstone",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
