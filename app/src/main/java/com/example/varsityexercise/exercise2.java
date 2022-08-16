package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class exercise2 extends AppCompatActivity {
    protected float catRating = 0;
    protected float dogRating = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);


        ImageView imageView = findViewById(R.id.petImage1);
        RadioGroup radioPet = findViewById(R.id.radioPet);
        RadioButton radioCat = findViewById(R.id.radioButtonCat);
        RadioButton radioDog = findViewById(R.id.radioButtonDog);
        Button btnEvaluate = findViewById(R.id.btnEvaluate);
        RatingBar ratingBarPet = findViewById(R.id.ratingBarPet);
        TextView ratingText = findViewById(R.id.textViewRating);


        radioCat.setOnClickListener(View ->{
            this.changeImageCat(imageView, ratingBarPet);
            ratingText.setText("Rating: " + Float.toString(this.catRating));
        });

        radioDog.setOnClickListener(View->{
            this.changeImageDog(imageView, ratingBarPet);
            ratingText.setText("Rating: " + Float.toString(this.dogRating));
        });

        btnEvaluate.setOnClickListener(View -> {
            //ratingText.setText(Float.toString(ratingBarPet.getRating()));
            evaluate(ratingText,ratingBarPet,imageView);
        });



        this.footer();


    }

    protected void changeImageCat(ImageView petImage, RatingBar ratingBarPet){
        petImage.setImageResource(R.drawable.cat);
        ratingBarPet.setRating(this.catRating);

    }
    protected void changeImageDog(ImageView petImage, RatingBar ratingBarPet){
        petImage.setImageResource(R.drawable.dog);
        ratingBarPet.setRating(this.dogRating);
    }
    protected void evaluate(TextView ratingText, RatingBar ratingBarPet, ImageView imageView){


        Drawable petDrawable = imageView.getDrawable();



        Drawable catDrawable = getResources().getDrawable(R.drawable.cat);
        Drawable dogDrawable = getResources().getDrawable(R.drawable.dog);

        if (petDrawable.getConstantState().equals(catDrawable.getConstantState())){
            System.out.println("cat");
            this.catRating = ratingBarPet.getRating();
            ratingText.setText("Rating: " + Float.toString(this.catRating));
        }

        if (petDrawable.getConstantState().equals(dogDrawable.getConstantState())){
            System.out.println("dog");
            this.dogRating = ratingBarPet.getRating();
            ratingText.setText("Rating: " + Float.toString(this.dogRating));
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
            Intent intent = new Intent(this, exercise3.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise1.class);
            startActivity(intent);
        });
    }

}