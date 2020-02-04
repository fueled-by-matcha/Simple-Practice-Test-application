package com.example.simplepracticetestapp;

public class BusinessQuestionnaire {
    public String questions[]={
        "What is an organization?",
    };

    public String choices[][]={
        {"A deliberate arrangement of people who act together to accomplish some specific purpose", "A group of people", "Individuals", "N/A"},
    };

    public String answers[]={
        "A deliberate arrangement of people who act together to accomplish some specific purpose",
    };
    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getAnswer(int a){
        String answer = answers[a];
        return answer;
    }

}
