package com.hfad.juisinyourpocket;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PlacesActivity extends AppCompatActivity {

    Toolbar toolbar;


    String placeNames[] = new String []{
            "Selim Al Din Mukto Moncho",
            "Shoptom Chhayamoncho",
            "Omor Ekushey",
            "Central Cafeteria",
            "Teachers-Student Center",
            "Wazed Miah Science Research Centre",
            "Butterfly Park And Research Centre",
            "JU Botanical Garden",
            "মনপুরা দ্বীপ, জাহাঙ্গীরনগর বিশ্ববিদ্যালয়",
            "Central Shaheed Minar",
            "Bot Tola",
            "Tarzan Point",
            "Migratory Bird Conservatory",
            "Munni Memorial",
            "মুক্তিযোদ্ধা চত্ত্বর, JU",
            "Jahangirnagar University Central Temple",
            "জাহাঙ্গীরনগর বিশ্ববিদ্যালয় কেন্দ্রীয় মাঠ",
            "Zahir Raihan Auditorium",
            "Migratory Bird Lake 2",



    };

    String googleMapLink[] = new String[]{
            "https://www.google.com/maps/place/Selim+Al+Din+Muktomoncho/@23.8787395,90.2709686,16.06z/data=!4m5!3m4!1s0x0:0xe846cd1d408114fd!8m2!3d23.87877!4d90.270835",
            "https://www.google.com/maps/place/Seventh+chayamanca/@23.8789444,90.2704723,18.69z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e999b7615755:0xc01d7b8e0827d61f!8m2!3d23.8783353!4d90.2700173",
            "https://www.google.com/maps/place/Omor+Ekushey/@23.8789444,90.2704723,18.69z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e99830f2d2ad:0xd7543fdbfebdcd13!8m2!3d23.8796824!4d90.270598",
            "https://www.google.com/maps/place/Jahangirnagar+University+Central+Cafeteria/@23.8790444,90.2705187,18.69z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e998315f6f01:0x872ae0c2e81a9344!8m2!3d23.8793722!4d90.2706718",
            "https://www.google.com/maps/place/Teacher-Student+Centre/@23.8790444,90.2705187,18.69z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e999b58ddcb7:0xfdd21f62f169d6e1!8m2!3d23.8788258!4d90.2703305",
            "https://www.google.com/maps/place/Wazed+Miah+Science+Research+Centre/@23.8759885,90.2684159,18z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e999642605df:0x77fc84a512ffb8b9!8m2!3d23.8765964!4d90.2681834",
            "https://www.google.com/maps/place/Butterfly+Park+And+Research+Centre+Jahangirnagar+University/@23.8759885,90.2684159,18z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e99bd831fe85:0x6eb3c281773004f0!8m2!3d23.8759262!4d90.2684221",
            "https://www.google.com/maps/place/JU+Botanical+Garden,+Savar+Union/@23.8730024,90.2681993,18z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e99b76bb1ff9:0xeef835177056c97f!8m2!3d23.8727426!4d90.2675792",
            "https://www.google.com/maps/place/%E0%A6%AE%E0%A6%A8%E0%A6%AA%E0%A7%81%E0%A6%B0%E0%A6%BE+%E0%A6%A6%E0%A7%8D%E0%A6%AC%E0%A7%80%E0%A6%AA,+%E0%A6%9C%E0%A6%BE%E0%A6%B9%E0%A6%BE%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A7%80%E0%A6%B0%E0%A6%A8%E0%A6%97%E0%A6%B0+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A7%9F%E0%A5%A4/@23.8717224,90.2636144,19.06z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e99d1bba9c37:0x4503bb631366a72a!8m2!3d23.8721374!4d90.2639488",
            "https://www.google.com/maps/place/Central+Shaheed+Minar/@23.8796119,90.2643777,16.68z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e998e58b8a9f:0x5b5393c998e2a7cb!8m2!3d23.8797824!4d90.2682531",
            "https://www.google.com/maps/place/Bot+Tola/@23.8796119,90.2643777,16.68z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e99f3d47ad23:0x65cc5539feacbe87!8m2!3d23.8799823!4d90.2654877",
            "https://www.google.com/maps/place/Tarzan+Point/@23.8796119,90.2643777,16.68z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x0:0x70559a81f8deb214!8m2!3d23.8815654!4d90.2714677",
            "https://www.google.com/maps/place/Migratory+Bird+Conservatory/@23.882856,90.2647392,16.68z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e9a21a90eb35:0xc408a6ae5c505052!8m2!3d23.8824103!4d90.2669924",
            "https://www.google.com/maps/place/Munni+Memorial/@23.885929,90.2665757,18.06z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e9a3c1a965b1:0x643eef2091c7377f!8m2!3d23.8863281!4d90.2677059",
            "https://www.google.com/maps/place/%E0%A6%AE%E0%A7%81%E0%A6%95%E0%A7%8D%E0%A6%A4%E0%A6%BF%E0%A6%AF%E0%A7%8B%E0%A6%A6%E0%A7%8D%E0%A6%A7%E0%A6%BE+%E0%A6%9A%E0%A6%A4%E0%A7%8D%E0%A6%A4%E0%A7%8D%E0%A6%AC%E0%A6%B0,+JU/@23.8791913,90.2710329,18.47z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e999cd1a7b73:0x74c825613cab78d!8m2!3d23.8789313!4d90.2706959",
            "https://www.google.com/maps/place/Jahangirnagar+University+Central+Temple/@23.8771854,90.2705227,18.21z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e99740f09f01:0xf7d6670d26e058b1!8m2!3d23.8773518!4d90.2724588",
            "https://www.google.com/maps/place/%E0%A6%9C%E0%A6%BE%E0%A6%B9%E0%A6%BE%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A7%80%E0%A6%B0%E0%A6%A8%E0%A6%97%E0%A6%B0+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A7%9F+%E0%A6%95%E0%A7%87%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A7%8D%E0%A6%B0%E0%A7%80%E0%A7%9F+%E0%A6%AE%E0%A6%BE%E0%A6%A0/@23.8786104,90.2705588,18.21z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e9508c9c4eb5:0x13c4464bca4340e0!8m2!3d23.8788602!4d90.2717842",
            "https://www.google.com/maps/place/Zahir+Raihan+Auditorium/@23.8788115,90.2694312,17.94z/data=!4m8!1m2!2m1!1ssoptom+chhayamoncho!3m4!1s0x3755e999ac84c771:0xf626d1b91da1274!8m2!3d23.8790429!4d90.2693682",
            "https://www.google.com/maps/place/Migratory+Bird+Lake+2/@23.8831153,90.2645516,16z/data=!3m1!4b1!4m5!3m4!1s0x3755e9a2622fd13b:0x1ba7b5399f4c91b3!8m2!3d23.8840798!4d90.2688999",


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        Intent intent = getIntent();


        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Famous Places");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ListView listView = (ListView) findViewById(R.id.listViewPlaces);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, placeNames);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String url = googleMapLink[position];

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });





    }

}

