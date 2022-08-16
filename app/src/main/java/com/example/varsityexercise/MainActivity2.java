package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList <String> data;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        data = createData();
        listView = findViewById(R.id.main2ListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            Intent intent ;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(MainActivity2.this, "Title"+position, Toast.LENGTH_SHORT).show();
                //intent.putExtra("clicked_number",  data.get(position).first.toString());
                System.out.println(position);
                switch (position+1){
                    case 1:
                        System.out.println(position);
                        intent = new Intent(MainActivity2.this, exercise1.class);
                        break;
                    case 2:
                        System.out.println(position);
                        intent = new Intent(MainActivity2.this, exercise2.class);
                        break;
                    case 3:
                        System.out.println(position);
                        intent = new Intent(MainActivity2.this, exercise3.class);
                        break;
                    case 4:
                        intent = new Intent(MainActivity2.this, exercise4.class);
                        break;
                    case 5:
                        intent = new Intent(MainActivity2.this, exercise5.class);
                        break;
                    case 6:
                        intent = new Intent(MainActivity2.this, exercise6.class);
                        break;
                    case 7:
                        intent = new Intent(MainActivity2.this, exercise7.class);
                        break;
                    case 8:
                        intent = new Intent(MainActivity2.this, exercise8.class);
                        break;
                    case 9:
                        intent = new Intent(MainActivity2.this, exercise9.class);
                        break;
                    case 10:
                        intent = new Intent(MainActivity2.this, exercise10.class);
                        break;
                    case 11:
                        intent = new Intent(MainActivity2.this, exercise11.class);
                        break;
                    case 12:
                        intent = new Intent(MainActivity2.this, exercise12.class);
                        break;
                    case 13:
                        intent = new Intent(MainActivity2.this, exercise13.class);
                        break;
                    case 14:
                        intent = new Intent(MainActivity2.this, exercise14.class);
                        break;
                    case 15:
                        intent = new Intent(MainActivity2.this, exercise15.class);
                        break;
                    case 16:
                        intent = new Intent(MainActivity2.this, exercise16.class);
                        break;
                    case 17:
                        intent = new Intent(MainActivity2.this, exercise17.class);
                        break;
                    case 18:
                        intent = new Intent(MainActivity2.this, exercise18.class);
                        break;
                    case 19:
                        intent = new Intent(MainActivity2.this, exercise19.class);
                        break;
                    case 20:
                        intent = new Intent(MainActivity2.this, exercise20.class);
                        break;
                    default:
                        intent = new Intent(MainActivity2.this, exercise1.class);
                        break;
                }

                System.out.println(data.get(position));
                startActivity(intent);
            }
        });
    }

    public ArrayList<String> createData(){
        ArrayList <String> data = new ArrayList<>();
        data.add("Exercise 1");
        data.add("Exercise 2");
        data.add("Exercise 3");
        data.add("Exercise 4");
        data.add("Exercise 5");
        data.add("Exercise 6");
        data.add("Exercise 7");
        data.add("Exercise 8");
        data.add("Exercise 9");
        data.add("Exercise 10");
        data.add("Exercise 11");
        data.add("Exercise 12");
        data.add("Exercise 13");
        data.add("Exercise 14");
        data.add("Exercise 15");
        data.add("Exercise 16");
        data.add("Exercise 17");
        data.add("Exercise 18");
        data.add("Exercise 19");
        data.add("Exercise 20");
        data.add("Exercise 21");
        return data;
    }
}