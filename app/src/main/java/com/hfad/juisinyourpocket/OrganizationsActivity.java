package com.hfad.juisinyourpocket;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.net.Uri;

import java.util.ArrayList;

public class OrganizationsActivity extends AppCompatActivity {


    String organizationNames[] = new String []{
            "Badhan JU Zone",
            "Jahangirnagar University Information and Technology Society (JUITS)",
            "JU Computer Club",
            "Jahangirnagar University Career Club(JUCC)",
            "Jahangirnagar University Science Club (JUSC)",
            "Jahangirnagar University Martial Art Club (JUMAC)",
            "Jahangirnagar University Debate Organization (JUDO)",
            "Jahangirnagar University Model United Nations Association (JUMUNA)",
            "Jahangirnagar University Physics Club (JUPC)",
            "Jahangirnagar University Photographic Society (JUPS)",
            "Jahangirnagar University English Language Club (JUELC)",
            "Jahangirnagar University Journalists' Association (JUJA)",
            "Dikkha",
            "Tori School in JU",
            "DHWONI-ধ্বনি",
            "Jahangirnagar Cycling Club",
            "E-Commerce & Entrepreneurship Club, Jahangirnagar University (EECJU)",
            "Rotaract Club of Jahangirnagar",
            "জাহাঙ্গীরনগর বিশ্ববিদ্যালয় প্রেস ক্লাব",
            "জাহাঙ্গীরনগর সাংস্কৃতিক জোট"
    };

    String fbLink[] = new String[]{
            "https://www.facebook.com/BadhanJUzone/",
            "https://www.facebook.com/juitsbd/",
            "https://www.facebook.com/jucomputerclub",
            "https://www.facebook.com/JahangirnagarUniversityCareerClub/",
            "https://www.facebook.com/juscbd/",
            "https://www.facebook.com/jahangirnagaruniversitymartialartclub/",
            "https://www.facebook.com/judo2005/",
            "https://www.facebook.com/JUMUNA/",
            "https://www.facebook.com/juphysicsclub/",
            "https://www.facebook.com/jups.ju/",
            "https://www.facebook.com/Jahangirnagar-University-English-Language-Club-JUELC-650178805090175/?ref=br_rs",
            "https://www.facebook.com/officejuja/",
            "https://www.facebook.com/Dikkha/",
            "https://www.facebook.com/torischoolju/",
            "https://www.facebook.com/%E0%A6%A7%E0%A7%8D%E0%A6%AC%E0%A6%A8%E0%A6%BF-200152196734257/",
            "https://www.facebook.com/jahangirnagarcyclingclub/",
            "https://www.facebook.com/EECJU",
            "https://www.facebook.com/Rotaract-Club-of-Jahangirnagar-267670323416671/",
            "https://www.facebook.com/jupressclub/",
            "https://www.facebook.com/%E0%A6%9C%E0%A6%BE%E0%A6%B9%E0%A6%BE%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A7%80%E0%A6%B0%E0%A6%A8%E0%A6%97%E0%A6%B0-%E0%A6%B8%E0%A6%BE%E0%A6%82%E0%A6%B8%E0%A7%8D%E0%A6%95%E0%A7%83%E0%A6%A4%E0%A6%BF%E0%A6%95-%E0%A6%9C%E0%A7%8B%E0%A6%9F-584851651709125/"
    };

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizations);
        Intent intent = getIntent();

        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Organizations");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ListView listView = (ListView) findViewById(R.id.listViewOrg);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, organizationNames);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String url = fbLink[position];

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
    }
}
