package com.example.android.tourguideapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
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
//public constructor for the recyler view which requires a list with an object type of info to work with
    Recycler(ArrayList<info> list){
        workingList = list;

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(workingList.get(0).getCODE()){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.accomodation_list_item, parent, false);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tourist_attraction_list_item, parent, false);
        }

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
//here the textviews are binded with the views by passing the mybind method
        //described in the viewholder class

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
        private myViewHolder(View itemView) {
            super(itemView);

            if(workingList.get(0).getCODE()){
                itemTitle = itemView.findViewById(R.id.imageTitle);
                itemFirstImage = itemView.findViewById(R.id.image);
                itemSecondImage = itemView.findViewById(R.id.firstSupportingImage);
                itemThirdImage = itemView.findViewById(R.id.secondSupportingImage);
            }else{
                itemTitle = itemView.findViewById(R.id.touristTitleId);
                itemFirstImage = itemView.findViewById(R.id.touristImageId);
            }


        }

        void myBind (int index){

            final info currentInfo = workingList.get(index);
            itemTitle.setText(currentInfo.getmTitle());
            itemFirstImage.setImageResource(currentInfo.getImageAddress());
            if(currentInfo.getCODE()){
                itemSecondImage.setImageResource(currentInfo.getmFirstImageAddress());
                itemThirdImage.setImageResource(currentInfo.getmSecondAddress());
            }
            itemTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String string = currentInfo.getmTitle();
                    Uri gmmap = Uri.parse(currentInfo.getmLocationAddress() + string);
                    Intent intent = new Intent(Intent.ACTION_VIEW, gmmap);
                    intent.setPackage("com.google.android.apps.maps");
                    PackageManager pm = v.getContext().getPackageManager();
                    if(intent.resolveActivity(pm)!= null){
                        v.getContext().startActivity(intent);
                    }
                }
            });

        }


    }
}
