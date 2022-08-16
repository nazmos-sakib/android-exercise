package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class exercise5Extra1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5_extra1);
        System.out.println("------------------------------------------------------second activity");
        TextView showResult = findViewById(R.id.textViewExercise5Result);
        Intent intent = getIntent();
        //String a = intent.getStringExtra("num1");
        //String b = intent.getStringExtra("num1");

        int a = intent.getIntExtra("num1",0);
        int b = intent.getIntExtra("num2",0);

        System.out.println(a);
        System.out.println(b);
        //int a = intent.getIntExtra("num1",0);
        //int b = intent.getIntExtra("num2",0);

        showResult.setText( Integer.toString(a*b));




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
            Intent intent = new Intent(this, exercise5.class);
            startActivity(intent);
        });
    }
}