package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class superMarket extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_tourist, container, false);

        if (Enugu.enuguKey) {

            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info( R.drawable.shoprite, "Shoprite Shopping Mall", "enugu"));
            infos.add(new info(R.drawable.roban_stores, "Roban Stores", "enugu"));
            infos.add(new info( R.drawable.spar, "Spar", "enugu"));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext());
            horizontalListRoot.setLayoutManager(myHorizontalManager);
            Recycler recycler = new Recycler(infos);
            horizontalListRoot.setAdapter(recycler);
            Enugu.enuguKey = false;
        }

        if (Lagos.lagosKey){
            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info( R.drawable.ikeja_city_mall_frontview, "Ikeja City Mall", "lagos"));
            infos.add(new info(R.drawable.citydia_super_market, "Citydia", "lagos"));
            infos.add(new info(R.drawable.trimat_lagos_mall, "Trimat", "lagos"));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext());
            horizontalListRoot.setLayoutManager(myHorizontalManager);
            horizontalListRoot.setHasFixedSize(true);
            Recycler recycler = new Recycler(infos);
            horizontalListRoot.setAdapter(recycler);
            Lagos.lagosKey = false;

        }


        if (CrossRiver.crossRiverKey){

            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info( R.drawable.calabar_mall, "Calabar Mall", "cross river"));
            infos.add(new info( R.drawable.tinapa_shopping_mall, "Tinapa Shopping Complex", "cross river"));
            infos.add(new info( R.drawable.cross_river_mall, "Cross River Mall", "cross river"));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext());
            horizontalListRoot.setLayoutManager(myHorizontalManager);
            horizontalListRoot.setHasFixedSize(true);
            Recycler recycler = new Recycler(infos);
            horizontalListRoot.setAdapter(recycler);
            CrossRiver.crossRiverKey = false;
        }


        return view;
    }
}
