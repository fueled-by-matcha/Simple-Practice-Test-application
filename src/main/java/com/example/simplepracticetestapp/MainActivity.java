package com.example.simplepracticetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button subject1;
    private Button subject2;
    public String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        subject1 = (Button) findViewById(R.id.subject1);
        subject2 = (Button) findViewById(R.id.subject2);

        subject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                subject = subject1.getText().toString();
                intent.putExtra("Subject", subject);
                startActivity(intent);
            }
        });

        subject2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Settings.class);
                subject = subject2.getText().toString();
                intent.putExtra("Subject", subject);
                startActivity(intent);
            }

        });
    }

}
