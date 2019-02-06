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

public class NewSearchActivity extends AppCompatActivity {

    //private ArrayList<HomeCardData> homeCardDataList;
    private HomeCardData newData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_search);

        //homeCardDataList = (ArrayList<HomeCardData>) getIntent().getSerializableExtra("homeCards");

        newData = new HomeCardData();

        //homeCardDataList.add(new HomeCardData());

        ImageButton buttonPrimaryInterestHelp = (ImageButton) findViewById(R.id.primaryInterestHelpButton);
        buttonPrimaryInterestHelp.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(NewSearchActivity.this);
                builder1.setMessage("Primary Interest\n\nThe main activity you want to meet people over.");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Intent newIntent = new Intent(NewSearchActivity.this, NewSearchActivity.class);
                                //startActivity(newIntent);
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }
        });

        ImageButton buttonDesiredGroupSizeHelp = (ImageButton) findViewById(R.id.desiredGroupSizeHelpButton);
        buttonDesiredGroupSizeHelp.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(NewSearchActivity.this);
                builder1.setMessage("Desired Group Size\n\nAn estimate of how many people you want to carry out the activity with.");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Intent newIntent = new Intent(NewSearchActivity.this, NewSearchActivity.class);
                                //startActivity(newIntent);
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }
        });


        Button nextButton = (Button) findViewById(R.id.nextNewSearchButton);
        nextButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newIntent = new Intent(NewSearchActivity.this, SecondaryIntActivity.class);
                //newIntent.putExtra("newData", newData);
                //newIntent.putExtra("homeCardDataList", homeCardDataList);

                startActivity(newIntent);
                finish();

            }
        });
    }

}
