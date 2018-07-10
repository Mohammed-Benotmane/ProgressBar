package com.example.mohamed.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar p1 = findViewById(R.id.progressBar);
        ProgressBar p2 = findViewById(R.id.progressBar2);
        ProgressBar p3 = findViewById(R.id.progressBar3);
        p1.setProgress(42);
        p2.setProgress(12);
        p3.setProgress(50);

    }
}
