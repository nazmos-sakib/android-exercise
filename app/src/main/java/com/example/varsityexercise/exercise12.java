package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class exercise12 extends AppCompatActivity {

    ArrayList<Pair<String,String>> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise12);

        ListView listView = findViewById(R.id.listView);

        for (int i =0;i<100;i++){
            arrayList.add(new Pair<>("Title "+i,"Subtitle "+i));
        }

        ArrayAdapter<Pair<String,String>> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_2,android.R.id.text1,arrayList);
        //ArrayAdapter adapter = new ArrayAdapter<>(this,R.layout.for_listview_custom_layout,arrayList);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            final Intent intent = new Intent(exercise12.this, exercise12Extra12.class);
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(exercise12.this, "Title"+position, Toast.LENGTH_SHORT).show();
                //intent.putExtra("title",  arrayList.get(position));
                //intent.putStringArrayListExtra("title",  arrayList.get(position).toString());
                intent.putExtra("clicked_number",  arrayList.get(position).first.toString());
                System.out.println(arrayList.get(position).first);
                startActivity(intent);
            }
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
            Intent intent = new Intent(this, exercise13.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise11.class);
            startActivity(intent);
        });
    }


}