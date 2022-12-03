package com.example.expandablerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ItemVH> {

    private static final String TAG = "Adapter";
    List<Model> modelList;


    @Override
    public Adapter.ItemVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ItemVH(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ItemVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

     class ItemVH extends RecyclerView.ViewHolder{
        private static final String TAG = "Item";
        TextView titleView, dayView, ratingView, summaryView;
        ConstraintLayout expandableLayout;

        public ItemVH(View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.itemTitle);
            dayView = itemView.findViewById(R.id.daytext);
            ratingView = itemView.findViewById(R.id.rating);
            summaryView = itemView.findViewById(R.id.summary);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);
        }
    }
}
