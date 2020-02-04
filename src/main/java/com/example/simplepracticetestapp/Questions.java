package com.example.simplepracticetestapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import androidx.appcompat.app.AppCompatActivity;

public class Questions extends AppCompatActivity {
    private TextView question;
    private RadioButton btnA, btnB, btnC, btnD;
    private Button next;
    public String a,b,c,d;
    public String q;
    int score;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        next = (Button) findViewById(R.id.nextBtn);
        question = (TextView) findViewById(R.id.questionText);
        btnA = (RadioButton) findViewById(R.id.radioButtonA);
        btnB = (RadioButton) findViewById(R.id.radioButtonB);
        btnC = (RadioButton) findViewById(R.id.radioButtonC);
        btnD = (RadioButton) findViewById(R.id.radioButtonD);
        int score =  0;


    }

}
