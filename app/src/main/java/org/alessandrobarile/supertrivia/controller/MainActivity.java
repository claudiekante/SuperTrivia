package org.alessandrobarile.supertrivia.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.alessandrobarile.supertrivia.R;
import org.alessandrobarile.supertrivia.model.model.User;

public class MainActivity extends AppCompatActivity {

    // creo l'attributo da riempire col nome che si scrive
   // private String mUser;


//    ici il faut brancher les element graphique
    // avec la methode findViewById() dans OnCreate
    private TextView mGreetingTextView;
    private EditText mNameEditText;
    private Button mPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGreetingTextView = findViewById(R.id.main_textview_welcome);
        mNameEditText = findViewById(R.id.main_edittext_yourname);
        mPlayButton = findViewById(R.id.main_button_play);

        //ora disattivo il bottone play
        mPlayButton.setEnabled(false);

        mNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mPlayButton.setEnabled(!editable.toString().isEmpty());
            }
        });

        //ora verifico il click sul bottone
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity (gameActivityIntent);
                User mUser = null;
                mUser.setmFirstName(mNameEditText.getText().toString());
            }
        });



    }
}