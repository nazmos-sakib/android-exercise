package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
//import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class exercise12Extra12 extends AppCompatActivity {

    TextView title;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise12_extra12);

        title = findViewById(R.id.titleTextView);

        Intent intent = getIntent();
        String a = intent.getStringExtra("clicked_number");

        title.setText(a);

        footer();
    }

    protected void footer(){
        Button btnHome = findViewById(R.id.btnHome);
        Button btnNext = findViewById(R.id.btnNext);
        Button btnPrevious = findViewById(R.id.btnPrevious);

        btnHome.setOnClickListener(View ->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        btnNext.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise13.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise12.class);
            startActivity(intent);
        });
    }
}