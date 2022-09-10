package com.dacha.android1lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String result = getIntent().getStringExtra("result");
        ((TextView) findViewById(R.id.
                tv_second)).setText(result);

    }
}