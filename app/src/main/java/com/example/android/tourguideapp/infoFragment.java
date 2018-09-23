package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class infoFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.info_activity, container, false);



        TextView textView = view.findViewById(R.id.infoText);
        ImageView imageView = view.findViewById(R.id.infoImage);
        if(Enugu.enuguKey){
            textView.setText(getString(R.string.enugu_info));
            imageView.setImageResource(R.drawable.enugu_food);
            Enugu.enuguKey = false;
        }else if(Lagos.lagosKey){
            textView.setText(getString(R.string.lagos_info));
            imageView.setImageResource(R.drawable.lag_culture);
            Lagos.lagosKey = false;
        }else if(CrossRiver.crossRiverKey){
            textView.setText(getString(R.string.crossRiver_Info));
            imageView.setImageResource(R.drawable.cross_river_culture1);
            CrossRiver.crossRiverKey = false;
        }





        return view;
    }


}
