package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class exercise19 extends AppCompatActivity {


    private FloatingActionButton fab;
    private ConstraintLayout parent;
    private Button btnSnackbar;
    private MaterialCardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise19);

        fab = findViewById(R.id.e19FAB);
        parent = findViewById(R.id.e19parent);
        btnSnackbar = findViewById(R.id.e19snackbar);
        cardView = findViewById(R.id.e19cardView);

        cardView.setOnClickListener(View->{
            Toast.makeText(exercise19.this,"Card View",Toast.LENGTH_SHORT).show();
        });

        btnSnackbar.setOnClickListener(View ->{
            //Toast.makeText(exercise19.this,"Floating action button was clicked",Toast.LENGTH_SHORT).show();
            showSnackbar();
        });

        fab.setOnClickListener(View ->{
            Toast.makeText(exercise19.this,"Floating action button was clicked",Toast.LENGTH_SHORT).show();
        });



        footer();
    }

    private void showSnackbar() {
        Snackbar.make(parent,"This is a snackbar",Snackbar.LENGTH_SHORT)
                .setAction("Retry",new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Toast.makeText(exercise19.this,"after retry",Toast.LENGTH_SHORT).show();
           }

        })
                .setActionTextColor(getResources().getColor(R.color.orange))
                .setTextColor(Color.YELLOW)
                .show();
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
            Intent intent = new Intent(this, exercise20.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise17.class);
            startActivity(intent);
        });
    }
}