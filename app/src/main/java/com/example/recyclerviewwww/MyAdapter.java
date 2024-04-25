package com.example.recyclerviewwww;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.myViewholder> {
    private  List<String> titles;
    private  List<String> descriptions;

    public  MyAdapter(List<String> titles,List<String> descriptions) {
        this.titles=titles;
        this.descriptions=descriptions;
    }
    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return  new myViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewholder holder, int position) {
        holder.titleTextView.setText(titles.get(position));
        holder.descriptionTextView.setText(descriptions.get(position));

        holder.titleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clickedTitle = titles.get(position);
                Toast.makeText(v.getContext(), "clicked on" + clickedTitle, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {

        return titles.size();
    }
    public  static  class  myViewholder extends RecyclerView.ViewHolder {
        TextView titleTextView,descriptionTextView;
        public myViewholder(@NonNull View itemView) {
            super(itemView);
            titleTextView=itemView.findViewById(R.id.titleTextview);
            descriptionTextView=itemView.findViewById(R.id.descriptionTextview);
        }

    }



}

