package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class exercise11 extends AppCompatActivity {

    ImageView cat;
    ImageView dog;
    ConstraintLayout cl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise11);

        cat = findViewById(R.id.imageViewCat);
        dog = findViewById(R.id.imageViewDog);
        cl = findViewById(R.id.clInExercise10);



        cat.setOnClickListener(View->{
            ObjectAnimator animation = ObjectAnimator.ofFloat(cat,"alpha",toggleAlpha(cat));
            animation.setDuration(4000);
            animation.start();
        });

        ObjectAnimator animationDogRotate = ObjectAnimator.ofFloat(dog,"rotation",toggleRotation(dog));
        ObjectAnimator animationDogAlpha = ObjectAnimator.ofFloat(dog,"alpha",toggleAlpha(dog));
        animationDogRotate.setDuration(4000);
        animationDogAlpha.setDuration(4000);
        //animationDog.start();

        dog.setOnClickListener(View->{
            System.out.println("dog - alpha: " + dog.getImageAlpha());
            //ObjectAnimator(dog,cat);
            //animationDogRotate.start();
            animationDogAlpha.start();
        });


        footer();
    }

    public float toggleAlpha(ImageView clickedImg){
        if (clickedImg.getAlpha()==1) {
            //clickedImg.setAlpha(0f);
            return 0f;
        } else if (clickedImg.getAlpha()==0) {
            //clickedImg.setAlpha(1f);
            return 1f;
        } else {
            return 1f;
        }
    }

    public float toggleRotation(ImageView clickedImg){
        if (clickedImg.getRotation()==0.0){
            //clickedImg.setRotation(180);
            return 180f;
        } else if (clickedImg.getRotation()==180.0){
            //clickedImg.setRotation(0f);
            return 0f;
        } else {
            return 0f;
        }
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
            Intent intent = new Intent(this, exercise12.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise10.class);
            startActivity(intent);
        });
    }
}