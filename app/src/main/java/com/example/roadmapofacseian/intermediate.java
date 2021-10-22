package com.example.roadmapofacseian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class intermediate extends AppCompatActivity {
    TextView eclipse,netbeans,xampp,oracle,pycharm,anaconda, laravel, nodepad,sublime,
            cisco , linux, arduino, mathlab , algomore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);
        eclipse = findViewById(R.id.eclipsTextViewId);
        eclipse.setMovementMethod(LinkMovementMethod.getInstance());
        netbeans = findViewById(R.id.netbeansTextViewId);
        netbeans.setMovementMethod(LinkMovementMethod.getInstance());
        xampp = findViewById(R.id.xamppTextViewId);
        xampp.setMovementMethod(LinkMovementMethod.getInstance());
        oracle = findViewById(R.id.oracleTextViewId);
        oracle.setMovementMethod(LinkMovementMethod.getInstance());
        pycharm = findViewById(R.id.pycharmTextViewId);
        pycharm.setMovementMethod(LinkMovementMethod.getInstance());
        anaconda = findViewById(R.id.anacondaTextViewId);
        anaconda.setMovementMethod(LinkMovementMethod.getInstance());
        laravel = findViewById(R.id.laravelTextViewId);
        laravel.setMovementMethod(LinkMovementMethod.getInstance());
        nodepad = findViewById(R.id.nodepadId);
        nodepad.setMovementMethod(LinkMovementMethod.getInstance());
        sublime= findViewById(R.id.sublimeId);
        sublime.setMovementMethod(LinkMovementMethod.getInstance());
        cisco= findViewById(R.id.ciscoTextViewId);
        cisco.setMovementMethod(LinkMovementMethod.getInstance());
        linux= findViewById(R.id.linuxId);
        linux.setMovementMethod(LinkMovementMethod.getInstance());
        arduino= findViewById(R.id.arduinoTextViewId);
        arduino.setMovementMethod(LinkMovementMethod.getInstance());
        mathlab= findViewById(R.id.matLabId);
        mathlab.setMovementMethod(LinkMovementMethod.getInstance());
        algomore=findViewById(R.id.algoMoreId);
    }

    public void algorithm(View view) {
        Intent intent = new Intent(intermediate.this,algorithm.class);
        startActivity(intent);
    }
}