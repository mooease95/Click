package com.example.matt.click;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GroupSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences settings = this.getPreferences(MODE_PRIVATE);
        //String chatName = settings.getString("ChatName", "Football Chat");
        String eventDate = settings.getString("EventDate", "");
        String eventLoc = settings.getString("EventLocation", "None");
        final SharedPreferences.Editor editor = settings.edit();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_settings);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        //setSupportActionBar(toolbar);
        //getActionBar().setTitle(chatName);
        //TextView title = (TextView)  findViewById(R.id.GroupChatName);
        //title.setText(chatName.toCharArray(), 0, chatName.length());

        final EditText dateField = (EditText) findViewById(R.id.editDate);
        dateField.setText(eventDate.toCharArray(), 0, eventDate.length());
        final EditText locationField = (EditText) findViewById(R.id.location);
        locationField.setText(eventLoc.toCharArray(), 0, eventLoc.length());

        final Button saveEvent = (Button) findViewById(R.id.SaveEvent);
        saveEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";
                saveEvent.setText(text.toCharArray(), 0, text.length());
                editor.putString("EventDate", dateField.getText().toString());
                editor.putString("EventLocation", locationField.getText().toString());
                boolean success = editor.commit();
                if (success) {
                    text = "Saved!";
                    saveEvent.setText(text.toCharArray(), 0, text.length());
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        //No one cares
                    }
                    text = "Save";
                    saveEvent.setText(text.toCharArray(), 0, text.length());
                } else {
                    text = "Failed!";
                    saveEvent.setText(text.toCharArray(), 0, text.length());
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        //No one cares
                    }
                    text = "Save";
                    saveEvent.setText(text.toCharArray(), 0, text.length());
                }
            }
        });

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
