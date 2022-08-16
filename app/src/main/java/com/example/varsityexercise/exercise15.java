package com.example.varsityexercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class exercise15 extends AppCompatActivity {
    private EditText searchText;
    private Button btnSearch;
    private Toolbar tBar;
    private ProgressBar pBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise15);

        searchText = findViewById(R.id.mapSearch);
        btnSearch = findViewById(R.id.btnSearch);
        tBar = findViewById(R.id.toolbar15);
        pBar = findViewById(R.id.progressBar15);

        setSupportActionBar(tBar);

        btnSearch.setOnClickListener(view -> {
            showLocation(searchText.getText().toString());
        });

        footer();
    }

    private void showLocation(String loc) {
        String uriText = "geo: 0,0?q="+loc;
        Uri uri = Uri.parse(uriText);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(mapIntent);
    }


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

    protected void footer(){
        Button btnHome = findViewById(R.id.btnHome);
        Button btnNext = findViewById(R.id.btnNext);
        Button btnPrevious = findViewById(R.id.btnPrevious);

        btnHome.setOnClickListener(View ->{
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });

        btnNext.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise16.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise14.class);
            startActivity(intent);
        });
    }
}