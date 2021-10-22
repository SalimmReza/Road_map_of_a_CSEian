package com.example.roadmapofacseian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void BEGINNER(View view) {
        Intent intent = new Intent(MainActivity2.this,beginner.class);
        startActivity(intent);
    }

    public void INTERMEDIATE(View view) {
        Intent intent = new Intent(MainActivity2.this,intermediate.class);
        startActivity(intent);
    }

    public void ADVANCE(View view) {
        Intent intent = new Intent(MainActivity2.this,advance.class);
        startActivity(intent);
    }

    public void JOB(View view) {
        Intent intent = new Intent(MainActivity2.this,job_seeker.class);
        startActivity(intent);
    }
}