package com.example.matt.click;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class SecondaryIntActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_int);

        //final ArrayList<HomeCardData> homeCardDataList = (ArrayList<HomeCardData>) getIntent().getSerializableExtra("homeCardDataList");
        //final HomeCardData newData = (HomeCardData) getIntent().getSerializableExtra("newData");

        ImageButton buttonSecondaryIntHelp = (ImageButton) findViewById(R.id.secondaryIntHelpButton);
        buttonSecondaryIntHelp.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(SecondaryIntActivity.this);
                builder1.setMessage("Primary Interest\n\nOther things you are interested in. Adding these may help you get better matches.");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Intent newIntent = new Intent(SecondaryIntActivity.this, SecondaryIntActivity.class);
                                //startActivity(newIntent);
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }
        });

        Button buttonSubmitSearch = (Button) findViewById(R.id.submitNewSearchButton);
        buttonSubmitSearch.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Bundle b = new Bundle()

                //homeCardDataList.add(newData);

                Intent newIntent = new Intent(SecondaryIntActivity.this, HomeActivityFull.class);
                startActivity(newIntent);
                finish();

            }
        });

    }
}
