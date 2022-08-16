package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class exercise1 extends AppCompatActivity {
    private boolean currentImage = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        ImageView petImage = findViewById(R.id.petImage);
        Button btnChangeCategory = findViewById(R.id.btnChangeCategory);




        btnChangeCategory.setOnClickListener(View ->{
            this.toggleImage(petImage);
            this.currentImage = !this.currentImage;
        });

        this.footer();

    }

    protected void toggleImage(ImageView petImage){
        if (this.currentImage)
            petImage.setImageResource(R.drawable.cat);
        else
            petImage.setImageResource(R.drawable.dog);
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
            Intent intent = new Intent(this, exercise2.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });
    }
}