package com.example.matt.click;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class HomeActivityFull extends AppCompatActivity {

    public ArrayList<HomeCardData> homeCardDataList;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        AppBarLayout toolbar = (AppBarLayout) findViewById(R.id.app_bar);
        //setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(HomeActivityFull.this, NewSearchActivity.class);
                newIntent.putExtra("homeCards", homeCardDataList);


                startActivity(newIntent);
                customAdapter.notifyDataSetChanged();
            }
        });
        */

        gridLayoutManager = new GridLayoutManager(this, 1);

        //Recylcer view and card
        recyclerView = (RecyclerView) findViewById(R.id.recy);
        recyclerView.setLayoutManager(gridLayoutManager);
        homeCardDataList = new ArrayList<>();
        homeCardDataList.add(new HomeCardData());

        customAdapter = new CustomAdapter(this, homeCardDataList);
        recyclerView.setAdapter(customAdapter);
        customAdapter.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu_simple, menu); //your file name
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        Intent newIntent;
        switch (item.getItemId()) {

            case R.id.action_notifications:

                newIntent = new Intent(HomeActivityFull.this, NotificationsActivity.class);
                startActivity(newIntent);

                return true;

            case R.id.action_settings:

                newIntent = new Intent(HomeActivityFull.this, SettingsActivity.class);
                startActivity(newIntent);

                return true;

            case R.id.action_logout:

                newIntent = new Intent(HomeActivityFull.this, LoginActivity.class);
                startActivity(newIntent);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
