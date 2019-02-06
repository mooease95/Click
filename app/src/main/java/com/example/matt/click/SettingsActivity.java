package com.example.matt.click;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        Button buttonDeleteAccount = (Button) findViewById(R.id.button_deleteAccount);
        buttonDeleteAccount.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(SettingsActivity.this);
                builder1.setMessage("Are you sure you want to delete your account?");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent newIntent = new Intent(SettingsActivity.this, LoginActivity.class);
                                startActivity(newIntent);
                                dialog.cancel();
                            }
                        });

                builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }
        });

        Button buttonSaveChanges = (Button) findViewById(R.id.button_saveChanges);
        buttonSaveChanges.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newIntent = new Intent(SettingsActivity.this, HomeActivity.class);
                startActivity(newIntent);

            }
        });
    }
}