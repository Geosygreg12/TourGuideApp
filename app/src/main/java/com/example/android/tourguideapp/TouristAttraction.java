package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TouristAttraction extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_tourist, container, false);

        if (Enugu.enuguKey) {

            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info(getContext(), R.drawable.enugu_golf_course, getString(R.string.enuguGolfCourse), getString(R.string.enugu)));
            infos.add(new info(getContext(), R.drawable.ezeagu_tourist_complex, getString(R.string.ezeaguTouristComplex), getString(R.string.enugu)));
            infos.add(new info(getContext(), R.drawable.ngwo_caves, getString(R.string.ngwoCaves), getString(R.string.enugu)));
            infos.add(new info(getContext(), R.drawable.auhum, getString(R.string.auhumCave), getString(R.string.enugu)));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext());
            horizontalListRoot.setLayoutManager(myHorizontalManager);
            Recycler recycler = new Recycler(infos);
            horizontalListRoot.setAdapter(recycler);
            Enugu.enuguKey = false;
        }

        if (LagosActivity.lagosKey){
            RecyclerView horizontalListRoot = view.findViewById(R.id.touristMe);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info(getContext(), R.drawable.theat7, getString(R.string.nationalTheatre), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.nat, getString(R.string.nigerianNationalMuseum), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.shrine3, getString(R.string.africanShine), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.high_impct_planet, getString(R.string.implactPlanet), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.lekki, getString(R.string.lekkiCentre), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.surfers_at_tarkwa_bay, getString(R.string.tarkwaBar), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.lekki_leisure_lake, getString(R.string.lekkiLeisure), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.terrakulture_craft_shop, getString(R.string.tevraKulture), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.elegushi_beach, getString(R.string.elegushiBeach), getString(R.string.lagos)));
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
            infos.add(new info(getContext(), R.drawable.obudu_cattles, getString(R.string.obuduMountain), getString(R.string.cross_river)));
            infos.add(new info(getContext(), R.drawable.tinap_business_resort, getString(R.string.tinapaBusinessResort), getString(R.string.cross_river)));
            infos.add(new info(getContext(), R.drawable.national_museum_calabar, getString(R.string.nationalMuseum), getString(R.string.cross_river)));
            infos.add(new info(getContext(), R.drawable.nondon_international_hotel_swim, getString(R.string.marinaResort), getString(R.string.cross_river)));
            infos.add(new info(getContext(), R.drawable.slave, getString(R.string.slaveHistory), getString(R.string.cross_river)));
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
