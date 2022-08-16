package com.example.varsityexercise;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContactsRecViewAdapter extends RecyclerView.Adapter<ContactsRecViewAdapter.ViewHolder> {

    private ArrayList<Contact> contacts = new ArrayList<>();

    private final Context context;
    private ImageView imageViewForCard;
    public ContactsRecViewAdapter(Context context,ImageView imageViewForCard) {
        this.context = context;
        this.imageViewForCard = imageViewForCard;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_recycler_list,parent,false);
        //ViewHolder holder = new ViewHolder(view);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtName.setText(contacts.get(position).getName());
        holder.txtEmail.setText(contacts.get(position).getEmail());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, contacts.get(position).getName(),Toast.LENGTH_SHORT).show();
                Glide.with(context)
                        .asBitmap()
                        .load(contacts.get(position).getImageUrl())
                        .into(imageViewForCard);
                //holder.e20cardImage.setImageResource(R.drawable.dog);
            }
        });

        Glide.with(context)
                .asBitmap()
                .load(contacts.get(position).getImageUrl())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    public static class  ViewHolder extends RecyclerView.ViewHolder{

        //private final ImageView e20cardImage;
        private final TextView txtName;
        private final TextView txtEmail;
        private final ImageView imageView;

        private final CardView parent;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            //e20cardImage = itemView.findViewById(R.id.e20cardImage);
            txtName = itemView.findViewById(R.id.txtName);
            parent = itemView.findViewById(R.id.recyclerParant);
            txtEmail = itemView.findViewById(R.id.txtEmail);
            imageView = itemView.findViewById(R.id.image);

        }
    }
}
