package com.hfad.juisinyourpocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Info & Contacts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }



    public void adminAndOffices(View view) {
        Intent intent = new Intent(this, AdminAndOfficeActivity.class);
        startActivity(intent);
    }

    public void faculties(View view) {
        Intent intent = new Intent(this, FacultiesActivity.class);
        startActivity(intent);
    }

    public void accommodation(View view) {
        Intent intent = new Intent(this, AccommodationActivity.class);
        startActivity(intent);
    }

    public void contacts(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}
