package com.example.varsityexercise;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class exercise7Extra1 extends AppCompatActivity {
    ImageButton cat, dog, giraffe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise7_extra1);

        cat = findViewById(R.id.imageButtonCat);
        dog = findViewById(R.id.imageButtonDog);
        giraffe = findViewById(R.id.imageButtonGiraffe);

        cat.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("clickedImage",R.drawable.cat);
            setResult(90,intent);

            //finish();
            exercise7Extra1.super.onBackPressed();
        });

        dog.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("clickedImage",R.drawable.dog);
            setResult(90,intent);

            //finish();
            exercise7Extra1.super.onBackPressed();
        });

        giraffe.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("clickedImage",R.drawable.giraffe);
            setResult(90,intent);

            //finish();
            exercise7Extra1.super.onBackPressed();
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
            Intent intent = new Intent(this, exercise8.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise7.class);
            startActivity(intent);
        });
    }
}