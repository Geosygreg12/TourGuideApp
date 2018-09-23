package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class touristAttraction extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_tourist, container, false);

        if (Enugu.enuguKey) {

            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info( R.drawable.enugu_golf_course, "Enugu Golf Course", "enugu"));
            infos.add(new info(R.drawable.ezeagu_tourist_complex, "Ezeagu Tourist Complex", "enugu"));
            infos.add(new info( R.drawable.ngwo_caves, "Ngwo Caves", "enugu"));
            infos.add(new info( R.drawable.auhum, "Auhum Cave and Water fall", "enugu"));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext());
            horizontalListRoot.setLayoutManager(myHorizontalManager);
            Recycler recycler = new Recycler(infos);
            horizontalListRoot.setAdapter(recycler);
            Enugu.enuguKey = false;
        }

        if (Lagos.lagosKey){
            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info( R.drawable.theat7, "National Theatre", "lagos"));
            infos.add(new info(R.drawable.nat, "Nigerian National Museum", "lagos"));
            infos.add(new info(R.drawable.shrine3, "The New African Shrine", "lagos"));
            infos.add(new info(R.drawable.high_impct_planet, "Hi Impact Planet", "lagos"));
            infos.add(new info(R.drawable.lekki, "Lekki Conservation Centre", "lagos"));
            infos.add(new info(R.drawable.surfers_at_tarkwa_bay, "Tarkwa Bar Beach", "lagos"));
            infos.add(new info(R.drawable.lekki_leisure_lake, "Lekki Leisure Lake", "lagos"));
            infos.add(new info(R.drawable.terrakulture_craft_shop, "Tevra Kulture", "lagos"));
            infos.add(new info(R.drawable.elegushi_beach, "Elegushi Beach", "lagos"));
            infos.add(new info(R.drawable.quilox_lightview, "Club Quilox", "lagos"));
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
            infos.add(new info( R.drawable.obudu_cattles, "Obudu Mountain Resort", "cross river"));
            infos.add(new info( R.drawable.tinap_business_resort, "Tinapa Business Resort", "cross river"));
            infos.add(new info( R.drawable.national_museum_calabar, "National Museum Calabar", "cross river"));
            infos.add(new info( R.drawable.nondon_international_hotel_swim, "Marina Resort", "cross river"));
            infos.add(new info( R.drawable.slave, "Slave History Museum", "cross river"));
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
