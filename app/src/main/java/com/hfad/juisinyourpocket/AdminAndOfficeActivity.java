package com.hfad.juisinyourpocket;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AdminAndOfficeActivity extends AppCompatActivity {

    Toolbar toolbar;

    String names[] = new String []{
            "Professor Dr. Farzana Islam \n" +
                    "\tVice Chancellor",
            "Professor Dr. Md. Amir Hussain\n" +
                    "\tPro Vice Chancellor",
            "Sheikh Md. Monzurul Huq \n" +
                    "\tTreasurer",
            "Rahima Kaneez \n" +
                    "\tRegistrar",
            "Proctor Office\n" +
                    "\tDirector\n" +
                    "\tSikder Md Zulkernine",
            "Comptroller Office\n" +
                    "\tDirector\n" +
                    "\tMd. Mosanul Kabir",
            "IQAC\n" +
                    "\tDirector\n" +
                    "\tDr. Ajit Kumar Majumder",
            "ICT Cell\n" +
                    "\tDirector\n" +
                    "\tDr. Mohammad Shorif Uddin",
            "Planning and Development Office\n" +
                    "\tDirector\n" +
                    "\tEngineer Md. Nasir Uddin",
            "Office of the Controller of Examinations\n" +
                    "\tDirector\n" +
                    "\tDr. Ashit Boron Pal",
            "Internal Audit Office\n" +
                    "\tHead of Office\n" +
                    "\tZahedul Haque",
            "University Library\n" +
                    "\tDirector\n" +
                    "\tDr. Ajit Kumar Majumder"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_and_office);

        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Administration & Offices");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        ListView listView = (ListView) findViewById(R.id.listViewAdmin);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        listView.setAdapter(adapter);


    }
}
