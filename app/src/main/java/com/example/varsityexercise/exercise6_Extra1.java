package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class exercise6_Extra1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise6_extra1);


        TextView showResult = findViewById(R.id.textView12);
        Intent intent = getIntent();
        //String a = intent.getStringExtra("num1");
        //String b = intent.getStringExtra("num1");

        int a = intent.getIntExtra("num1",0);
        int b = intent.getIntExtra("num2",0);
        int o = intent.getIntExtra("operation",1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(o);

        int result = 0;

        if (o==1){
            result = add(a,b);
        }

        if (o==2){
            result = mul(a,b);
        }

        if (o==3){
            result = sub(a,b);
        }

        showResult.setText(Integer.toString(result));


        footer();
    }

    int add(int a, int b){
        return a+b;
    }

    int mul(int a, int b){
        return a*b;
    }

    int sub(int a, int b){
        return a-b;
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
            Intent intent = new Intent(this, exercise7.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise6.class);
            startActivity(intent);
        });
    }
}