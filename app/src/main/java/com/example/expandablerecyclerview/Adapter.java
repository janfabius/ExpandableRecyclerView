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

        Model model = modelList.get(position);
        holder.titleView.setText(model.getTitle());
        holder.dayView.setText(model.getDay());
        holder.ratingView.setText(model.getRating());
        holder.summaryView.setText(model.getSummary());
        boolean isExpandad = modelList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpandad ? View.VISIBLE:View.GONE);

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

            //create button for expandable
            titleView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Model model = modelList.get(getAdapterPosition());
                    model.setExpanded(!model.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}
