package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class accomodationFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_enugu, container, false);

        /*each 'if' statement handles the population of accomodation view and info of a particular state.
        * the recycler view is initialised from the layout file and a horizontal layout manager is used
        * to populate views horizontally.
        * */
        if (Enugu.enuguKey) {
            RecyclerView myRecyclerView = view.findViewById(R.id.myHorizontalListRoot);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info(getContext(), R.drawable.nondon_international_hotel_swim, R.drawable.nondon_international_hotel, R.drawable.nondon_hotels, getString(R.string.nondonHotel), getString(R.string.enugu)));
            infos.add(new info( getContext(), R.drawable.nike_lake, R.drawable.nike_lake2, R.drawable.nike_lake3, getString(R.string.nikeLakeHotel), getString(R.string.enugu)));
            infos.add(new info( getContext(),R.drawable.oakland, R.drawable.oakland2, R.drawable.oakland3, getString(R.string.oaklanHotel), getString(R.string.enugu)));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
            myRecyclerView.setLayoutManager(myHorizontalManager);
            Recycler recycler = new Recycler(infos);
            myRecyclerView.setAdapter(recycler);

            final ArrayList<String> moreinfo = new ArrayList<>();
            moreinfo.add(getString(R.string.related));
            moreinfo.add(getString(R.string.adigSuites));
            moreinfo.add(getString(R.string.robanHotels));
            moreinfo.add(getString(R.string.gldenRoyale));
            moreinfo.add(getString(R.string.ceasarPlce));

            //the arraylist above contains the names of other hotels in enugu not included in the recycler view list.
            //and they are added dynamically to the ui as children of a linear layout already declared and initialised from the layout.
            //the same is done for the rest of the states
            //each related hotel is monitored for click events by passing onclicklistener method.
            //the intent opens google map and searches for the hotel within the specified coordinates which represents the state's location
            for (int i = 0; i < moreinfo.size(); i++) {
                LinearLayout linearLayout = view.findViewById(R.id.myVerticalListRoot);
                TextView textView = new TextView(view.getContext());
                textView.setText(moreinfo.get(i));
                final int finalI = i;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final int num = finalI;
                        Intent crIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.enuguLocation) + moreinfo.get(num)));
                        crIntent.setPackage(getString(com.example.android.tourguideapp.R.string.googleMapPackage));
                        if (crIntent.resolveActivity(v.getContext().getPackageManager()) != null) {
                            startActivity(crIntent);
                        }
                    }
                });
                textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                textView.setTextSize(24);
                textView.setTextColor(getResources().getColor(android.R.color.white));
                linearLayout.addView(textView);
            }
            Enugu.enuguKey = false;
        }

        if (LagosActivity.lagosKey) {
            RecyclerView myRecyclerView = view.findViewById(R.id.myHorizontalListRoot);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info(getContext(), R.drawable.ibis, R.drawable.ibis2, R.drawable.ibis3, getString(R.string.ibisHotel), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.four_point, R.drawable.four_point1, R.drawable.four_point2, getString(R.string.fourPoint), getString(R.string.lagos)));
            infos.add(new info(getContext(), R.drawable.sheraton, R.drawable.sheraton1, R.drawable.sheraton2, getString(R.string.sheratonHotel), getString(R.string.lagos)));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
            myRecyclerView.setLayoutManager(myHorizontalManager);
            myRecyclerView.setHasFixedSize(true);
            Recycler recycler = new Recycler(infos);
            myRecyclerView.setAdapter(recycler);

            final ArrayList<String> moreinfo = new ArrayList<>();
            moreinfo.add(getString(R.string.related));
            moreinfo.add(getString(com.example.android.tourguideapp.R.string.westonHotel));
            moreinfo.add(getString(com.example.android.tourguideapp.R.string.southernSunIkoyi));
            moreinfo.add(getString(com.example.android.tourguideapp.R.string.whiteHouse));
            for (int i = 0; i < moreinfo.size(); i++) {
                LinearLayout linearLayout = view.findViewById(R.id.myVerticalListRoot);
                TextView textView = new TextView(view.getContext());
                textView.setText(moreinfo.get(i));
                final int finalI = i;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final int num = finalI;
                        Intent crIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.lagosLocationUri) + moreinfo.get(num)));
                        crIntent.setPackage(getString(R.string.googleMapPackage));
                        if (crIntent.resolveActivity(v.getContext().getPackageManager()) != null) {
                            startActivity(crIntent);
                        }
                    }
                });
                textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                textView.setTextSize(24);
                textView.setTextColor(getResources().getColor(android.R.color.white));
                linearLayout.addView(textView);
            }
            LagosActivity.lagosKey = false;

        }


        if (CrossRiverActivity.crossRiverKey) {

            RecyclerView myRecyclerView = view.findViewById(R.id.myHorizontalListRoot);
            ArrayList<info> infos = new ArrayList<>();
            infos.add(new info(getContext(), R.drawable.nondon_international_hotel_swim, R.drawable.nondon_international_hotel, R.drawable.metropolitan_hote, getString(com.example.android.tourguideapp.R.string.metropolitan), getString(R.string.cross_river)));
            infos.add(new info(getContext(), R.drawable.ibis, R.drawable.ibis2, R.drawable.mirage_hotel_calabar, getString(R.string.mirageHotel), getString(R.string.cross_river)));
            infos.add(new info(getContext(), R.drawable.ibis, R.drawable.ibis2, R.drawable.nondon_hotels, getString(R.string.moutySuites), getString(R.string.cross_river)));
            LinearLayoutManager myHorizontalManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
            myRecyclerView.setLayoutManager(myHorizontalManager);
            myRecyclerView.setHasFixedSize(true);
            Recycler recycler = new Recycler(infos);
            myRecyclerView.setAdapter(recycler);

            final ArrayList<String> moreinfo = new ArrayList<>();
            moreinfo.add(getString(R.string.related));
            moreinfo.add(getString(R.string.paladiumHotel));
            moreinfo.add(getString(R.string.freemansHotel));
            moreinfo.add(getString(R.string.splendourHotel));
            moreinfo.add(getString(R.string.pearlSuites));
            moreinfo.add(getString(R.string.calabarHarbor));
            for (int i = 0; i < moreinfo.size(); i++) {
                LinearLayout linearLayout = view.findViewById(R.id.myVerticalListRoot);
                TextView textView = new TextView(view.getContext());
                textView.setText(moreinfo.get(i));
                final int finalI = i;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final int num = finalI;
                        Intent crIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.crossRiverLocationUri) + moreinfo.get(num)));
                        crIntent.setPackage(getString(R.string.googleMapPackage));
                        if (crIntent.resolveActivity(v.getContext().getPackageManager()) != null) {
                            startActivity(crIntent);
                        }
                    }
                });
                textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                textView.setTextSize(24);
                textView.setTextColor(getResources().getColor(android.R.color.white));
                linearLayout.addView(textView);
            }
            CrossRiverActivity.crossRiverKey = false;
        }


        return view;
    }

}
