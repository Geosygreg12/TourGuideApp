package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class info {
    private int mImageAddress;
    private int mFirstImageAddress;
    private int mSecondAddress;
    private String mTitle;


    public info(int imageList, int firstImage, int secondImage, String title){
        mImageAddress = imageList;
        mTitle = title;
        mFirstImageAddress = firstImage;
        mSecondAddress = secondImage;
    }

    public String getmTitle(){
        return mTitle;
    }

    public int getmFirstImageAddress(){
        return mFirstImageAddress;
    }

    public int getmSecondAddress(){
        return mSecondAddress;
    }

    public int getImageAddress(){
        return mImageAddress;
    }
}

class infoAdapter extends ArrayAdapter<info> {


    infoAdapter(@NonNull Context context, int resource, @NonNull ArrayList<info> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        info item = (info) getItem(position);
        ImageView imageView = convertView.findViewById(R.id.image);
        imageView.setImageResource(item.getImageAddress());
        ImageView firstImage = convertView.findViewById(R.id.firstSupportingImage);
        firstImage.setImageResource(item.getmFirstImageAddress());
        ImageView secondImage = convertView.findViewById(R.id.secondSupportingImage);
        secondImage.setImageResource(item.getmSecondAddress());
        TextView textView = convertView.findViewById(R.id.imageTitle);
        textView.setText(item.getmTitle());

        return convertView;
    }
}
