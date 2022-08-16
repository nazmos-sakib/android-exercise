package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class exercise5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5);

        Button btnMultiply = findViewById(R.id.btnMultiply);
        EditText num1 = findViewById(R.id.editTextNum1);
        EditText num2 = findViewById(R.id.editTextNum2);

        if (num1.getText().length() == 0 && num2.getText().length() == 0){
            btnMultiply.setEnabled(false);
        }

        num2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0 && num1.getText().toString().length()>0) {
                    //editTextPlayerName.setError("Required");
                    btnMultiply.setEnabled(true);
                } else {
                    //editTextPlayerName.setError(null);
                    btnMultiply.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnMultiply.setOnClickListener(View->{
            //int n1 = Integer.num1.toString().trim();
            Intent intent = new Intent(this, exercise5Extra1.class);
            System.out.println("first activity");
            intent.putExtra("num1", Integer.parseInt(num1.getText().toString().trim()));
            intent.putExtra("num2", Integer.parseInt(num2.getText().toString().trim()));

            //intent.putExtra("num1", num1.getText().toString().trim());
            //intent.putExtra("num2", num2.getText().toString().trim());
            //System.out.println("first activity");
            startActivity(intent);
        });


        footer();
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
            Intent intent = new Intent(this, exercise6.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise4.class);
            startActivity(intent);
        });
    }
}