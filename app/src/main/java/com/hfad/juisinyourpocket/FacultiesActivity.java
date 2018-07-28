package com.hfad.juisinyourpocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FacultiesActivity extends AppCompatActivity {

    Toolbar toolbar;

    String facultyNames[] = new String []{
            "Faculty of Arts & Humanities\n" +
                    "\tDean\n" +
                    "\tDr. Md. Muzammal Haque, Department of Archaeology",
            "Faculty of Mathematical & Physical Sciences\n" +
                    "\tDean\n" +
                    "\tDr. Ajit Kumar Majumder, Department of Statistics",
            "Faculty of Social Sciences\n" +
                    "\tDean\n" +
                    "\tDr. Rasheda Akhtar, Department of Anthropology",
            "Faculty of Biological Sciences\n" +
                    "\tDean\n" +
                    "\tProf. Abdul Jabber Hawlader, Department of Zoology",
            "Faculty of Business Studies\n" +
                    "\tDean\n" +
                    "\tNilanjan Kumar Saha, Department of Finance & Banking",
            "Faculty of Law\n" +
                    "\tDean\n" +
                    "\tBashir Ahmed, Department of Government & Politics"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculties);

        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Faculties and Deans");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ListView listView = (ListView) findViewById(R.id.listViewFaculties);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, facultyNames);

        listView.setAdapter(adapter);


    }
}
