package com.example.extra;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.varsityexercise.R;

import java.util.ArrayList;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{
    private ArrayList<Actor> data;

    private OnImageClickListener onImageClickListener;

    public CustomAdapter(ArrayList<Actor> data, OnImageClickListener onImageClickListener){
        this.data = data;
        this.onImageClickListener = onImageClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.item_view),parent,false);
        return new ViewHolder(view, onImageClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Actor act = data.get(position);
        holder.imageView.setImageResource(act.iconID);
        holder.textView.setText(act.name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final TextView textView;
        private final ImageView imageView;

        OnImageClickListener onImageClickListener;

        public ViewHolder(@NonNull View itemView, OnImageClickListener onImageClickListener){
            super(itemView);
            imageView = itemView.findViewById(R.id.actImageView);
            textView = itemView.findViewById(R.id.actorNametextView);
            this.onImageClickListener = onImageClickListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onImageClickListener.onImageClick(getAdapterPosition());
        }
    }

    public interface OnImageClickListener{
        void onImageClick(int position);
    }
}