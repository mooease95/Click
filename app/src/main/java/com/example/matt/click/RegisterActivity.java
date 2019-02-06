package com.example.matt.click;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button buttonConfirm = (Button) findViewById(R.id.submitRegisterButton);
        buttonConfirm.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newIntent = new Intent(RegisterActivity.this, HomeActivity.class);
                newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(newIntent);
            }
        });
    }
}