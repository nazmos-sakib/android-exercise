package com.example.varsityexercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ProgressBar;



public class exercise14 extends AppCompatActivity {
    private Toolbar tBar;
    private ProgressBar pBar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.action_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //return super.onOptionsItemSelected(item);
        int id = item.getItemId();

        switch (id){
            case R.id.item_do:
                changeProgressBar();
                break;
            case R.id.item_load:
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void changeProgressBar() {
        pBar.setProgress(0);

        CountDownTimer timer = new CountDownTimer(8000,50) {
            @Override
            public void onTick(long l) {
                pBar.setProgress(pBar.getProgress()+1);
            }

            @Override
            public void onFinish() {

            }
        };
        timer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise14);

        tBar = findViewById(R.id.toolbar14);
        pBar = findViewById(R.id.progressBar14);

        setSupportActionBar(tBar);



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
            Intent intent = new Intent(this, exercise15.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise13.class);
            startActivity(intent);
        });
    }
}