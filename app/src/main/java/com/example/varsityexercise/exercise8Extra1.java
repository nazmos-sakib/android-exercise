package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class exercise8Extra1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise8_extra1);


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
            Intent intent = new Intent(this, exercise9.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise8.class);
            startActivity(intent);
        });
    }
}