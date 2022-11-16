package org.alessandrobarile.supertrivia.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.alessandrobarile.supertrivia.R;
import org.alessandrobarile.supertrivia.model.model.Question;
import org.alessandrobarile.supertrivia.model.model.QuestionBank;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity {

    private TextView mQuestionTextView;
    private Button mAnswer01;
    private Button mAnswer02;

    private Button mAnswer03;
    private Button mAnswer04;

    private QuestionBank mQuestionBank = generateQuestions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionTextView = findViewById(R.id.game_activity_textview_question);
        mAnswer01 = findViewById(R.id.game_activity_button_1);
        mAnswer02 = findViewById(R.id.game_activity_button_2);
        mAnswer03 = findViewById(R.id.game_activity_button_3);
        mAnswer04 = findViewById(R.id.game_activity_button_4);

    }

    private QuestionBank generateQuestions(){

        Question question1 = new Question(
                "Who is the creator of Android?",
                Arrays.asList(
                        "Andy Rubin",
                        "Steve Wozniak",
                        "Jake Wharton",
                        "Paul Smith"
                ),
                0
        );

        Question question2 = new Question(
                "When did the first man land on the moon?",
                Arrays.asList(
                        "1958",
                        "1962",
                        "1967",
                        "1969"
                ),
                3
        );

        Question question3 = new Question(
                "What is the house number of The Simpsons?",
                Arrays.asList(
                        "42",
                        "101",
                        "666",
                        "742"
                ),
                3
        );

        return new QuestionBank(Arrays.asList(question1, question2, question3));
    }


}