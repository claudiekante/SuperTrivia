package org.alessandrobarile.supertrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView gQuestionTextView;
    private Button gAnswer01;
    private Button gAnswer02;
    private Button gAnswer03;
    private Button gAnswer04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gQuestionTextView = findViewById(R.id.game_activity_textview_question);
        gAnswer01 = findViewById(R.id.game_activity_button_1);
        gAnswer02 = findViewById(R.id.game_activity_button_2);
        gAnswer03 = findViewById(R.id.game_activity_button_3);
        gAnswer04 = findViewById(R.id.game_activity_button_4);

    }
}