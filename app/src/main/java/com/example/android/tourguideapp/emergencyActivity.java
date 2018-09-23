package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class emergencyActivity extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.emergency_activity, container, false);
        TextView quick_response = view.findViewById(R.id.quick_response_lines);
        TextView policeStations = view.findViewById(R.id.police_stations);
        TextView hospitals = view.findViewById(R.id.hospitals);
        hospitals.setOnClickListener(this);
        policeStations.setOnClickListener(this);
        quick_response.setOnClickListener(this);
        return view;
    }


    /*click events are monitored fpr this activity and an appriopriate browser intent is
    * passed */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.quick_response_lines:
                String quickResponse = "www.npf.gov.ng/complaint/";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(quickResponse));
                if(browserIntent.resolveActivity(getContext().getPackageManager())!= null){
                    startActivity(browserIntent);
                }
                break;

            case R.id.police_stations:
                String string = "www.npf.gov.ng";
                Intent policeStations = new Intent(Intent.ACTION_VIEW, Uri.parse(string));
                if(policeStations.resolveActivity(getContext().getPackageManager())!= null){
                    startActivity(policeStations);
                }
                break;

            case R.id.hospitals:
                String uriHospitals = "www.finelib.com/hospitals-and-medical-centres";
                Intent hospitalsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uriHospitals));
                if(hospitalsIntent.resolveActivity(getContext().getPackageManager())!= null){
                    startActivity(hospitalsIntent);
                }
                break;
        }
    }
}
