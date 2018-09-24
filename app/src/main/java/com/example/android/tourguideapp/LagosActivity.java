package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class LagosActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    static boolean lagosKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_river);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null){
            lagosKey = true;
            getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new accomodationFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_accomdation);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch(id){
            case R.id.nav_accomdation:
                lagosKey = true;
                getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new accomodationFragment()).commit();
                break;

            case R.id.nav_touristAttractions:
                lagosKey = true;
                getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new TouristAttraction()).commit();
                break;

            case R.id.nav_superMarkets:
                lagosKey = true;
                getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new SuperMarket()).commit();
                break;

            case R.id.nav_info:
                lagosKey = true;
                getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new infoFragment()).commit();
                break;

            case R.id.nav_home:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.nav_clubs:
                lagosKey = true;
                getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new Clubs()).commit();
                break;
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

