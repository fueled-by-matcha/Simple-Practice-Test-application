package com.example.simplepracticetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button subject1btn;
    private Button subject2btn;
    public String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        subject1btn = (Button) findViewById(R.id.subject1);
        subject2btn = (Button) findViewById(R.id.subject2);

        subject1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                subject = subject1btn.getText().toString();
                intent.putExtra("Subject", subject);
                startActivity(intent);
            }
        });

        subject2btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Settings.class);
                subject = subject2btn.getText().toString();
                intent.putExtra("Subject", subject);
                startActivity(intent);
            }

        });
    }

}
