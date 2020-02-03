package com.example.simplepracticetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class Settings extends AppCompatActivity {
    private int questionNum;
    private int passGrade;
    private SeekBar setNum;
    private EditText passingGrade;
    private Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        start = (Button) findViewById(R.id.startBtn);
        passingGrade = (EditText) findViewById(R.id.setGrade);
        setNum = (SeekBar) findViewById(R.id.setNumberQuestions);
    }

}
