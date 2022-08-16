package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.extra.Actor;
import com.example.extra.CustomAdapter;

import java.util.ArrayList;

public class exercise13 extends AppCompatActivity implements CustomAdapter.OnImageClickListener{
    private ArrayList<Actor> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise13);

        this.data = createData();
        RecyclerView rView = findViewById(R.id.rView);


        CustomAdapter adapter = new CustomAdapter(data, this);
        rView.setAdapter(adapter);

        //rView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        //rView.setLayoutManager((new GridLayoutManager(this,3)));
        rView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));

        //rView.setOnI


        footer();

    }

    private ArrayList<Actor> createData(){
        ArrayList<Actor> data = new ArrayList<>();
        data.add(new Actor("Johnny Deep", R.drawable.c0));
        data.add(new Actor("Brad Pitt", R.drawable.c1));
        data.add(new Actor("Angelina Jolie", R.drawable.c2));
        data.add(new Actor("Jessica Alba", R.drawable.c4));
        data.add(new Actor("Robert Downey Jr", R.drawable.c5));
        data.add(new Actor("Chris Hemsworth", R.drawable.c6));
        data.add(new Actor("Amanda Seyfried", R.drawable.c7));
        data.add(new Actor("Emma Watson", R.drawable.c3));
        return  data;
    }

    @Override
    public void onImageClick(int position) {
        Actor act = data.get(position);
        Intent intent = new Intent(this,exercise13Extra1.class);
        System.out.println(act.iconID);
        intent.putExtra("image_resource",act.iconID);
        intent.putExtra("Image_name", act.name);

        startActivity(intent);
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
            Intent intent = new Intent(this, exercise12.class);
            startActivity(intent);
        });
    }
}