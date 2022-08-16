package com.example.extra;

import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.varsityexercise.MainActivity;
import com.example.varsityexercise.R;
import com.example.varsityexercise.exercise2;

public class Footer extends AppCompatActivity {
    public void createFooter(){
        Button btnHome = findViewById(R.id.btnHome);
        Button btnNext = findViewById(R.id.btnNext);
        Button btnPrevious = findViewById(R.id.btnPrevious);

        btnHome.setOnClickListener(View ->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        btnNext.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise2.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
