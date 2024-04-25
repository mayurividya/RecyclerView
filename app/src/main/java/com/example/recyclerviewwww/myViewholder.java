package com.example.recyclerviewwww;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewholder  extends RecyclerView.ViewHolder {

    TextView titleTextview;
    TextView descriptionTextview;

    public myViewholder(@NonNull View itemView) {
        super(itemView);
        titleTextview=itemView.findViewById(R.id.titleTextview);
        descriptionTextview=itemView.findViewById(R.id.descriptionTextview);
    }
}
