package com.example.roadmapofacseian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class beginner extends AppCompatActivity {
    TextView uva, codeblock, vscode, OnlineGDB, Programiz, ideone, codeforces, TopCoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);
        codeblock = findViewById(R.id.codeblock);
        codeblock.setMovementMethod(LinkMovementMethod.getInstance());
        vscode = findViewById(R.id.vscode);
        vscode.setMovementMethod(LinkMovementMethod.getInstance());
        OnlineGDB = findViewById(R.id.OnlineGDB);
        OnlineGDB.setMovementMethod(LinkMovementMethod.getInstance());
        Programiz = findViewById(R.id.Programiz);
        Programiz.setMovementMethod(LinkMovementMethod.getInstance());
        ideone = findViewById(R.id.ideone);
        ideone.setMovementMethod(LinkMovementMethod.getInstance());
        codeforces = findViewById(R.id.codeforces);
        codeforces.setMovementMethod(LinkMovementMethod.getInstance());
        TopCoder = findViewById(R.id.TopCoder);
        TopCoder.setMovementMethod(LinkMovementMethod.getInstance());
        uva = findViewById(R.id.uva);
        uva.setMovementMethod(LinkMovementMethod.getInstance());
    }
}