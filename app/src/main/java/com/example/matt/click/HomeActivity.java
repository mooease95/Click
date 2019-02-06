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

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_empty);
        AppBarLayout toolbar = (AppBarLayout) findViewById(R.id.app_bar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(HomeActivity.this, NewSearchActivity.class);
                startActivity(newIntent);
                finish();
            }
        });

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

                newIntent = new Intent(HomeActivity.this, NotificationsActivity.class);
                startActivity(newIntent);

                return true;

            case R.id.action_settings:

                newIntent = new Intent(HomeActivity.this, SettingsActivity.class);
                startActivity(newIntent);

                return true;

            case R.id.action_logout:

                newIntent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(newIntent);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
