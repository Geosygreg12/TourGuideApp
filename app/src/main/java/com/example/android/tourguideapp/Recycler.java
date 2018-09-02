package com.example.android.tourguideapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class Recycler extends RecyclerView.Adapter<Recycler.myViewHolder>{

    private ArrayList<info> workingList;
    private info currentInfo;

    public Recycler (ArrayList<info> list){
        workingList = list;

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {


        holder.myBind(position);

    }


    @Override
    public int getItemCount() {
        return workingList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle;
        ImageView itemFirstImage;
        ImageView itemSecondImage;
        ImageView itemThirdImage;
        myViewHolder(View itemView) {
            super(itemView);

            itemTitle = itemView.findViewById(R.id.imageTitle);
            itemFirstImage = itemView.findViewById(R.id.image);
            itemSecondImage = itemView.findViewById(R.id.firstSupportingImage);
            itemThirdImage = itemView.findViewById(R.id.secondSupportingImage);

        }

        void myBind (int index){

            currentInfo = workingList.get(index);
            itemTitle.setText(currentInfo.getmTitle());
            itemFirstImage.setImageResource(currentInfo.getImageAddress());
            itemSecondImage.setImageResource(currentInfo.getmFirstImageAddress());
            itemThirdImage.setImageResource(currentInfo.getmSecondAddress());
        }


    }
}
