package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class myfragment extends android.support.v4.app.Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_enugu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView horizontalListRoot = view.findViewById(R.id.myHorizontalListRoot);
        ArrayList<info> infos = new ArrayList<>();
        infos.add(new info(R.drawable.nondon_international_hotel_swim, R.drawable.nondon_international_hotel, R.drawable.nondon_hotels, "Nondon Hotels"));
        infos.add(new info(R.drawable.images, R.drawable.images1, R.drawable.images4, "Examples"));
        infos.add(new info(R.drawable.nondon_international_hotel_swim, R.drawable.nondon_international_hotel, R.drawable.nondon_hotels, "Another"));
        LinearLayoutManager myHorizontalManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        horizontalListRoot.setLayoutManager(myHorizontalManager);
        horizontalListRoot.setHasFixedSize(true);
        horizontalListRoot.setAdapter(new Recycler(infos));

        ArrayList<String> moreinfo = new ArrayList<>();
        moreinfo.add("Related: ");
        moreinfo.add("myplaceHolder");
        moreinfo.add("myplaceHolder");
        moreinfo.add("myplaceHolder");
        for(int i = 0; i<moreinfo.size(); i++){
            LinearLayout linearLayout = view.findViewById(R.id.myVerticalListRoot);
            TextView textView = new TextView(getContext());
            textView.setText(moreinfo.get(i));
            textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setTextSize(24);
            linearLayout.addView(textView);
        }


    }
}
