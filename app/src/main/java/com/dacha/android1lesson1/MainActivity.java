package com.dacha.android1lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_goSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_goSecond= findViewById(R.id.btn_goSecond);
        findViewById(R.id.btn_goSecond).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                String result = ((TextView)findViewById(R.id.
                        et_edit)).getText().toString();
                intent.putExtra("result" , result);
                startActivity(intent);
                finish();
            }
        });
    }
}