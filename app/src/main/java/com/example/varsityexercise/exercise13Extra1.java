package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class exercise13Extra1 extends AppCompatActivity {

    private ImageView actImage;
    private TextView actName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise13_extra1);

        actImage = findViewById(R.id.act_profile_ImageView);
        actName = findViewById(R.id.act_name_TV);

        Intent intent = getIntent();
        String name =  intent.getStringExtra("Image_name");
        int resourceID = intent.getIntExtra("image_resource",0);

        actName.setText(name);
        actImage.setImageResource(resourceID);

        System.out.println(name+" "+resourceID);


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
            Intent intent = new Intent(this, exercise14.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise13.class);
            startActivity(intent);
        });
    }
}