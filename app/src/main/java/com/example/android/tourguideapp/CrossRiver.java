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

public class CrossRiver extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    static boolean crossRiverKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_river);


        //the app actionbar is replaced with a tool bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*if the screen is rotated or set to landscape mode, the apps saved state should remain intact
        otherwise the default fragment which is the accomodation fragment is opened
        the same is done for the remaining states, enugu and lagos. */

        if (savedInstanceState == null){
            crossRiverKey = true;
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

        if (id == R.id.nav_accomdation) {
            crossRiverKey = true;
            getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new accomodationFragment()).commit();
        } else if (id == R.id.nav_touristAttractions) {
            crossRiverKey = true;
            getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new touristAttraction()).commit();
        } else if (id == R.id.nav_superMarkets) {
            crossRiverKey = true;
            getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new superMarket()).commit();
        } else if (id == R.id.nav_info) {
            crossRiverKey = true;
            getSupportFragmentManager().beginTransaction().replace(R.id.frameRoot, new infoFragment()).commit();
        } else if (id == R.id.nav_home) {
            startActivity(new Intent(this, MainActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
