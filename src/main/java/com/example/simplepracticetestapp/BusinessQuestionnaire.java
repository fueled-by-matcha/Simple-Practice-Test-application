package com.example.simplepracticetestapp;

public class BusinessQuestionnaire {
    public String questions[]={
        "What is an organization?",
            "What is the best definition of Efficiency?",
            "What is the best definition of Effectiveness?"
    };

    public String choices[][]={
        {"A deliberate arrangement of people who act together to accomplish some specific purpose", "A group of people", "Individuals", "N/A"},
            {"Most output from least input", "Completing activities so that goals are achieved", "Least output with most input", "Not meeting goals"},
    };

    public String answers[]={
        "A deliberate arrangement of people who act together to accomplish some specific purpose",
            "Most output from least input",
            
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
