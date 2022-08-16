package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class exercise6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise6);

        Button btnCalculate = findViewById(R.id.btnCalculate);
        EditText num1 = findViewById(R.id.editTextNum4);
        EditText num2 = findViewById(R.id.editTextNum3);

        RadioGroup radioGroup = findViewById(R.id.radioGroupCalculation);
        RadioButton radioButtonAdd = findViewById(R.id.radioButtonAdd);
        RadioButton radioButtonMultiply = findViewById(R.id.radioButtonMultiply);
        RadioButton radioButtonSub = findViewById(R.id.radioButtonSub);


        if (num1.getText().length() == 0 && num2.getText().length() == 0){
            btnCalculate.setEnabled(false);
        }

        num2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0 && num1.getText().toString().length()>0) {
                    //editTextPlayerName.setError("Required");
                    btnCalculate.setEnabled(true);
                } else {
                    //editTextPlayerName.setError(null);
                    btnCalculate.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnCalculate.setOnClickListener(View->{
            //int n1 = Integer.num1.toString().trim();
            Intent intent = new Intent(this, exercise6_Extra1.class);
            System.out.println("first activity");
            intent.putExtra("num1", Integer.parseInt(num1.getText().toString().trim()));
            intent.putExtra("num2", Integer.parseInt(num2.getText().toString().trim()));
            intent.putExtra("operation", setOperation(radioButtonAdd,radioButtonMultiply,radioButtonSub));

            //System.out.println(setOperation(radioButtonAdd,radioButtonMultiply,radioButtonSub));
            startActivity(intent);
        });

        setOperation(radioButtonAdd,radioButtonMultiply,radioButtonSub);


        footer();
    }

    protected int setOperation(RadioButton add, RadioButton mul, RadioButton sub){
        if (add.isChecked()){
            return 1;
        }
        else if (mul.isChecked()){
            return 2;
        }
        else if (sub.isChecked()){
            return 3;
        }

        return 0;
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
            Intent intent = new Intent(this, exercise7.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise5.class);
            startActivity(intent);
        });
    }
}