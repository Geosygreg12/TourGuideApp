package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                Fragment fragment = null;
                switch (i){
                    case 0:
                        fragment =  new states();
                    break;
                    case 1:
                        fragment =  new emergencyActivity();
                    break;
                }
                return fragment;

            }


            @Override
            public String getPageTitle(int position) {

                String title[] = new String[]{
                        getString(R.string.States),
                        getString(R.string.Emergency)
                };
                return title[position];

            }

            @Override
            public int getCount() {
                return 2;
            }

        });

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);

        tabLayout.setupWithViewPager(viewPager);
    }




}
