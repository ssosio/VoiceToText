package com.example.voicetotext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    TextView tv;
    Intent intent;
    SpeechRecognizer mRecognizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        tv = findViewById(R.id.tv);
        

    }

    @Override
    public void onClick(View view) {

    }
}