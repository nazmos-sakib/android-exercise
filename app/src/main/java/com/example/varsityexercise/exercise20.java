package com.example.varsityexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class exercise20 extends AppCompatActivity {

    private RecyclerView contactsRecView;
    private RelativeLayout relativeLayout;
    private ImageView newCardImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise20);

        contactsRecView = findViewById(R.id.e20recycleview);
        newCardImage = findViewById(R.id.e20cardImage);
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Md Nazmos Sakib","Sakib@mail.com","https://i.pinimg.com/originals/03/1d/e2/031de25b0f114f1e7a3db893461e12b7.jpg"));
        contacts.add(new Contact("Sk nizam","sk@mail.com","https://faroutmagazine.co.uk/static/uploads/2021/12/Why-Jared-Leto-is-the-most-unlikeable-actor-in-Hollywood.jpg"));
        contacts.add(new Contact("Rashed Amin","rashed@mail.com","https://cdn.britannica.com/66/103066-050-B89D5EAF/Will-Smith-actor-musician-2006.jpg"));
        contacts.add(new Contact("Nusrat Amin","nusrat@mail.com","https://improvemandarin.com/wp-content/uploads/top-Chinese-actress-Liu-Yifei.jpg"));
        contacts.add(new Contact("Sabikunnahar Mahrin","Maha@mail.com","https://images.saymedia-content.com/.image/t_share/MTc0NDg3NjA2MDQ0NjY1MTky/top-10-most-successful-beautiful-korean-drama-actresses.jpg"));
        contacts.add(new Contact("Dipannita Borua","dipu@mail.com","https://improvemandarin.com/wp-content/uploads/top-Chinese-actress-Yang-Mi.jpg"));
        contacts.add(new Contact("Murshid khan","Murshid@mail.com","https://imageio.forbes.com/specials-images/dam/imageserve/968210608/960x0.jpg"));
        contacts.add(new Contact("Imtiaz","zu@mail.com","https://phantom-marca.unidadeditorial.es/198490d8749c76d6bce8ebb4ac39b101/resize/1320/f/jpg/assets/multimedia/imagenes/2021/08/29/16302359860434.jpg"));
        contacts.add(new Contact("Samira","sami@mail.com","https://i.pinimg.com/236x/98/40/22/984022a16e1b7ae4be395434a9f732cf--bollywood-masala-business-school.jpg"));
        contacts.add(new Contact("Prianka","pria@mail.com","https://i2.cinestaan.com/image-bank/1500-1500/138001-139000/138650.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this,newCardImage);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        //contactsRecView.setLayoutManager(new LinearLayoutManager(this));
        //contactsRecView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        contactsRecView.setLayoutManager(new GridLayoutManager(this,2));



        footer();
    }

    public ImageView getNewCardImage() {
        return newCardImage;
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
            Intent intent = new Intent(this, exercise18.class);
            startActivity(intent);
        });

        btnPrevious.setOnClickListener(View ->{
            Intent intent = new Intent(this, exercise17.class);
            startActivity(intent);
        });
    }
}