package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class exercise4Extra1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4_extra1);

        Button btnClose = findViewById(R.id.btnClose);

        btnClose.setOnClickListener(View ->{
            finish();
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
            Intent intent = new Intent(this, exercise5.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise4.class);
            startActivity(intent);
        });
    }
}