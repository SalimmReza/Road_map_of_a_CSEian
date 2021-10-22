package com.example.roadmapofacseian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class advance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
    }

    public void NE(View view) {
        Intent intent = new Intent(advance.this,ne.class);
        startActivity(intent);
    }

    public void SE(View view) {
        Intent intent = new Intent(advance.this,se.class);
        startActivity(intent);
    }

    public void AI(View view) {
        Intent intent = new Intent(advance.this,ai.class);
        startActivity(intent);
    }
}