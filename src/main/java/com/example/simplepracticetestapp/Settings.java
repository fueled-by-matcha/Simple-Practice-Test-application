package com.example.simplepracticetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {
    private int questionNum;
    private int passGrade;
    private SeekBar setNum;
    private EditText passingGrade;
    private Button start;
    private TextView infoCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        start = (Button) findViewById(R.id.startBtn);
        passingGrade = (EditText) findViewById(R.id.setGrade);
        setNum = (SeekBar) findViewById(R.id.setNumberQuestions);
        setNum.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Settings.this, "The quiz will be " + progressChangedValue + " questions long",
                        Toast.LENGTH_SHORT).show();
            }
        });
        infoCheck = (TextView) findViewById(R.id.checkInfo);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!passingGrade.equals("")){
                    Intent intent = new Intent(Settings.this, Questions.class);
                    String value = passingGrade.getText().toString();
                    passGrade = Integer.parseInt(value);
                    Bundle extras = new Bundle();
                    extras.putInt("Passing Grade", passGrade);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                else{
                    infoCheck.setText("Please enter a valid passing grade");
                }

            }
        });
    }

}
