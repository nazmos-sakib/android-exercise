package com.example.varsityexercise;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

public class exercise7 extends AppCompatActivity {

    Button btnChoseFavoriteAnimal;
    ImageView favoriteAnimal;

    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Log.d("in main activity", "onActivityResult");

                    if(result.getResultCode() == 90){
                        Intent intent = result.getData();

                        if(intent!=null){
                            //some code
                            int imageRes = intent.getIntExtra("clickedImage",0);
                            favoriteAnimal.setImageResource(imageRes);
                        }
                    }
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise7);

        btnChoseFavoriteAnimal = findViewById(R.id.btnChooseAnimal);
        favoriteAnimal = findViewById(R.id.imageViewFavoriteAnimal);


        //Drawable res = R.drawable.cat;

        //favoriteAnimal.setImageResource(2131165280);



        System.out.println("drawable id" + R.drawable.cat);

        btnChoseFavoriteAnimal.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise7Extra1.class);
            activityResultLauncher.launch(intent);
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
            Intent intent = new Intent(this, exercise6.class);
            startActivity(intent);
        });
    }
}