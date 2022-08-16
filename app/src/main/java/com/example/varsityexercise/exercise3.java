package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.extra.Catalog;

public class exercise3 extends AppCompatActivity {
    Catalog catalog;
    String playerName = null;
    int score = 0;
    //private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        //All view element declaration
        EditText editTextPlayerName = findViewById(R.id.editTextPlayerName);
        Button btnStartGame = findViewById(R.id.btnStartGame);
        TextView textViewQuestion = findViewById(R.id.textViewQuestion);
        Button btnTrue = findViewById(R.id.btnTrue);
        Button btnFalse = findViewById(R.id.btnFalse);
        TextView textViewResult = findViewById(R.id.textViewResult);

        if (editTextPlayerName.getText().length() == 0){
            btnStartGame.setEnabled(false);
        }

        editTextPlayerName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0) {
                    //editTextPlayerName.setError("Required");
                    btnStartGame.setEnabled(false);
                } else {
                    editTextPlayerName.setError(null);
                    btnStartGame.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        this.initiateCatalog();

        btnStartGame.setOnClickListener(View->{
            hideKeyboard(View);
            System.out.println("in the button function");
            textViewQuestion.setVisibility(View.VISIBLE);
            btnTrue.setVisibility(View.VISIBLE);
            btnFalse.setVisibility(View.VISIBLE);
            //textViewResult.setVisibility(View.VISIBLE);

            editTextPlayerName.setVisibility(View.INVISIBLE);
            btnStartGame.setVisibility(View.INVISIBLE);

            playerName = editTextPlayerName.getText().toString();
            System.out.println(playerName);

            startGame(textViewQuestion,btnTrue,btnFalse);
        });

        this.footer();
    }

    public void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager)
                getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    void initiateCatalog(){
        String [] question = {
                "The inventor of Linux is Steve Jobbs",
                "One Megabyte are 1000000 bytes",
                "OCR is short for optical character recognition",
                "The Vulcan Nerve Pinch consists of Ctrl+Alt+Del",
                "ROM stands for Read-Often-Memory",
        };

        boolean [] answer = {
                false,
                true,
                true,
                true,
                false
        };


        this.catalog = new Catalog(question,answer);
    }

    void startGame(TextView textViewQuestion, Button btnTrue, Button btnFalse){
        //showNextStatement(textViewQuestion);
        textViewQuestion.setText(catalog.getCurrentStatement().getText());
        btnTrue.setOnClickListener(View->{
            updateScore(true);
            showNextStatement(textViewQuestion);
        });

        btnFalse.setOnClickListener(View->{
            updateScore(false);
            showNextStatement(textViewQuestion);
        });
    }



    void updateScore(boolean userGivenAnswer){
        if (checkAnswer(userGivenAnswer))
            score += 100;
        else
            score -= 100;

    }

    boolean checkAnswer(boolean userGivenAnswer){
        if(userGivenAnswer == catalog.getCurrentStatement().isCorrect()){
            return true;
        }
        else {
            return false;
        }
    }

    void showNextStatement(TextView textViewQuestion){
        if (catalog.getSize()-1 > catalog.getCurrentIndex()){
            catalog.jumpToNextStatement();
            textViewQuestion.setText(catalog.getCurrentStatement().getText());
            //System.out.println("in show next statement " + catalog.getCurrentIndex());
        }
        else {
            endGame();
        }
    }

    void endGame(){
        TextView textViewQuestion = findViewById(R.id.textViewQuestion);
        Button btnTrue = findViewById(R.id.btnTrue);
        Button btnFalse = findViewById(R.id.btnFalse);
        TextView textViewResult = findViewById(R.id.textViewResult);

        btnTrue.setEnabled(false);
        btnFalse.setEnabled(false);

        textViewQuestion.setVisibility(View.INVISIBLE);
        btnTrue.setVisibility(View.INVISIBLE);
        btnFalse.setVisibility(View.INVISIBLE);
        textViewResult.setVisibility(View.VISIBLE);

        textViewResult.setText("Wow" + playerName + "! You got " + score +" points!");
    }

    protected void footer(){
        Button btnHome = findViewById(R.id.btnHome);
        Button btnNext = findViewById(R.id.btnNext);
        Button btnPrevious = findViewById(R.id.btnPrevious);

        btnHome.setOnClickListener(View ->{
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });

        btnNext.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise4.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise2.class);
            startActivity(intent);
        });
    }
}