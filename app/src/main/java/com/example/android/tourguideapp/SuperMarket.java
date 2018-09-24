package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SuperMarket extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_tourist, container, false);

        if (Enugu.enuguKey) {

            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info(getContext(), R.drawable.shoprite, getString(R.string.shopriteShop), getString(R.string.enugu)));
            infos.add(new info(getContext(), R.drawable.roban_stores, getString(R.string.robanStores),  getString(R.string.enugu)));
            infos.add(new info(getContext(), R.drawable.spar, getString(R.string.spar),  getString(R.string.enugu)));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext());
            horizontalListRoot.setLayoutManager(myHorizontalManager);
            Recycler recycler = new Recycler(infos);
            horizontalListRoot.setAdapter(recycler);
            Enugu.enuguKey = false;
        }

        if (LagosActivity.lagosKey){
            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info(getContext(), R.drawable.ikeja_city_mall_frontview, getString(R.string.ikejaCity), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.citydia_super_market, getString(R.string.cityDia), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.trimat_lagos_mall, getString(R.string.trimat), getString(R.string.lagos)));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext());
            horizontalListRoot.setLayoutManager(myHorizontalManager);
            horizontalListRoot.setHasFixedSize(true);
            Recycler recycler = new Recycler(infos);
            horizontalListRoot.setAdapter(recycler);
            LagosActivity.lagosKey = false;

        }


        if (CrossRiverActivity.crossRiverKey){

            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info(getContext(), R.drawable.calabar_mall, getString(R.string.calabarMall), getString(R.string.cross_river)));
            infos.add(new info(getContext(), R.drawable.tinapa_shopping_mall, getString(R.string.tinapaShopping), getString(R.string.cross_river)));
            infos.add(new info(getContext(), R.drawable.cross_river_mall, getString(R.string.crossRiver), getString(R.string.cross_river)));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext());
            horizontalListRoot.setLayoutManager(myHorizontalManager);
            horizontalListRoot.setHasFixedSize(true);
            Recycler recycler = new Recycler(infos);
            horizontalListRoot.setAdapter(recycler);
            CrossRiverActivity.crossRiverKey = false;
        }


        return view;
    }
}
