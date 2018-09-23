package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class states extends Fragment implements View.OnClickListener{


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.states_activity, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView crossRiver;
        TextView enugu;
        TextView lagos;

        crossRiver = view.findViewById(R.id.crossRiver);

        crossRiver.setOnClickListener(this);
        enugu = view.findViewById(R.id.enugu);
        enugu.setOnClickListener(this);
        lagos = view.findViewById(R.id.lagos);
        lagos.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.crossRiver:
                startActivity(new Intent(getContext(), CrossRiver.class));
                break;
            case R.id.enugu:
                startActivity(new Intent(getContext(), Enugu.class));
                break;
            case R.id.lagos:
                startActivity(new Intent(getContext(), Lagos.class));
                break;
        }


    }
}
