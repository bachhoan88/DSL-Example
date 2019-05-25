package com.self.dslexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.module.core.Core;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String coreData = Core.CORE_DATA;
        String coreJava = Core.CORE_JAVA;

        TextView textView = findViewById(R.id.textView);
        textView.setText(coreData + ", " + coreJava);
    }
}
