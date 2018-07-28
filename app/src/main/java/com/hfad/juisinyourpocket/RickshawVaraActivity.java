package com.hfad.juisinyourpocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RickshawVaraActivity extends AppCompatActivity {

    private String one;
    private  String two;
    Spinner dropdownmenu1;
    Spinner dropdownmenu2;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rickshaw_vara);

        toolbar = findViewById(R.id.loginToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Rickshaw Vara");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        dropdownmenu1 = (Spinner)findViewById(R.id.spinnerRick1);
        dropdownmenu2 = (Spinner)findViewById(R.id.spinnerRick2);

        List<String> list = new ArrayList<>();

        list.add("Joy Bangla Gate");
        list.add("Bishmail/Quartar");
        list.add("Old Arts/ Al-Beruni Hall");
        list.add("VC Office/Bank");
        list.add("Physics/Chemistry");
        list.add("(SSB/Kamaluddin/Bhashani) Hall");
        list.add("Central Mosque Gate");
        list.add("Social Scienc/Cafe./Auditorium/TSC");
        list.add("MH Hall");
        list.add("(Pritilota/Jahanara Imam) Hall");
        list.add("(N.F./Khaleda Zia) Hall");
        list.add("JU School-College");
        list.add("Club/Bachelor's Quarter");
        list.add("Fazilatunnesa Hall/Medical/Transport");
        list.add("Biological Faculty/Gym./Science Research Center");
        list.add("BBH/New Geology Building");
        list.add("New Arts/Central Library");
        list.add("Generator House");
        list.add("Bishmail North Gate");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownmenu1.setAdapter(adapter);
        dropdownmenu2.setAdapter(adapter);

        dropdownmenu1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                one = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dropdownmenu2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                two = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onVaraShowingButton(View view) {
        TextView showVara = (TextView)findViewById(R.id.RickVara);

        String ans = "Rickshaw Vara(tk): ";

        if(one==two){
            ans = ans+"0";
        }

        //one

        else if((one=="Joy Bangla Gate"&& two=="Bishmail/Quartar")||(one=="Bishmail/Quartar" && two=="Joy Bangla Gate"))ans = ans+"8";
        else if((one=="Joy Bangla Gate"&& two=="Old Arts/ Al-Beruni Hall")||(one=="Old Arts/ Al-Beruni Hall" && two=="Joy Bangla Gate"))ans = ans+"7";
        else if((one=="Joy Bangla Gate"&& two=="VC Office/Bank")||(one=="VC Office/Bank" && two=="Joy Bangla Gate"))ans = ans+"7";
        else if((one=="Joy Bangla Gate"&& two=="Physics/Chemistry")||(one=="Physics/Chemistry" && two=="Joy Bangla Gate"))ans = ans+"8";
        else if((one=="Joy Bangla Gate"&& two=="(SSB/Kamaluddin/Bhashani) Hall")||(one=="(SSB/Kamaluddin/Bhashani) Hall" && two=="Joy Bangla Gate"))ans = ans+"10";
        else if((one=="Joy Bangla Gate"&& two=="Central Mosque Gate")||(one=="Central Mosque Gate" && two=="Joy Bangla Gate"))ans = ans+"7";
        else if((one=="Joy Bangla Gate"&& two=="Social Scienc/Cafe./Auditorium/TSC")||(one=="Social Scienc/Cafe./Auditorium/TSC" && two=="Joy Bangla Gate"))ans = ans+"7";
        else if((one=="Joy Bangla Gate"&& two=="MH Hall")||(one=="MH Hall" && two=="Joy Bangla Gate"))ans = ans+"10";
        else if((one=="Joy Bangla Gate"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall" && two=="Joy Bangla Gate"))ans = ans+"5";
        else if((one=="Joy Bangla Gate"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall" && two=="Joy Bangla Gate"))ans = ans+"5";
        else if((one=="Joy Bangla Gate"&& two=="JU School-College")||(one=="JU School-College" && two=="Joy Bangla Gate"))ans = ans+"5";
        else if((one=="Joy Bangla Gate"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter" && two=="Joy Bangla Gate"))ans = ans+"5";
        else if((one=="Joy Bangla Gate"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport" && two=="Joy Bangla Gate"))ans = ans+"7";
        else if((one=="Joy Bangla Gate"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center" && two=="Joy Bangla Gate"))ans = ans+"10";
        else if((one=="Joy Bangla Gate"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building" && two=="Joy Bangla Gate"))ans = ans+"10";
        else if((one=="Joy Bangla Gate"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library" && two=="Joy Bangla Gate"))ans = ans+"8";
        else if((one=="Joy Bangla Gate"&& two=="Generator House")||(one=="Generator House" && two=="Joy Bangla Gate"))ans = ans+"10";
        else if((one=="Joy Bangla Gate"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate" && two=="Joy Bangla Gate"))ans = ans+"8";


            //two

        else if((one=="Bishmail/Quartar"&& two=="Old Arts/ Al-Beruni Hall")||(one=="Old Arts/ Al-Beruni Hall"&& two=="Bishmail/Quartar" ))ans = ans+"7";
        else if((one=="Bishmail/Quartar"&& two=="VC Office/Bank")||(one=="VC Office/Bank"&& two=="Bishmail/Quartar" ))ans = ans+"8";
        else if((one=="Bishmail/Quartar"&& two=="Physics/Chemistry")||(one=="Physics/Chemistry"&& two=="Bishmail/Quartar" ))ans = ans+"10";
        else if((one=="Bishmail/Quartar"&& two=="(SSB/Kamaluddin/Bhashani) Hall")||(one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Bishmail/Quartar" ))ans = ans+"10";
        else if((one=="Bishmail/Quartar"&& two=="Central Mosque Gate")||(one=="Central Mosque Gate"&& two=="Bishmail/Quartar" ))ans = ans+"10";
        else if((one=="Bishmail/Quartar"&& two=="Social Scienc/Cafe./Auditorium/TSC")||(one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Bishmail/Quartar" ))ans = ans+"10";
        else if((one=="Bishmail/Quartar"&& two=="MH Hall")||(one=="MH Hall"&& two=="Bishmail/Quartar" ))ans = ans+"12";
        else if((one=="Bishmail/Quartar"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall"&& two=="Bishmail/Quartar" ))ans = ans+"8";
        else if((one=="Bishmail/Quartar"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="Bishmail/Quartar" ))ans = ans+"8";
        else if((one=="Bishmail/Quartar"&& two=="JU School-College")||(one=="JU School-College"&& two=="Bishmail/Quartar" ))ans = ans+"5";
        else if((one=="Bishmail/Quartar"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="Bishmail/Quartar" ))ans = ans+"7";
        else if((one=="Bishmail/Quartar"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Bishmail/Quartar" ))ans = ans+"8";
        else if((one=="Bishmail/Quartar"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="Bishmail/Quartar" ))ans = ans+"10";
        else if((one=="Bishmail/Quartar"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="Bishmail/Quartar" ))ans = ans+"10";
        else if((one=="Bishmail/Quartar"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="Bishmail/Quartar" ))ans = ans+"10";
        else if((one=="Bishmail/Quartar"&& two=="Generator House")||(one=="Generator House"&& two=="Bishmail/Quartar" ))ans = ans+"10";
        else if((one=="Bishmail/Quartar"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Bishmail/Quartar" ))ans = ans+"5";


            //three

        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="VC Office/Bank")||(one=="VC Office/Bank"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"6";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="Physics/Chemistry")||(one=="Physics/Chemistry"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"7";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="(SSB/Kamaluddin/Bhashani) Hall")||(one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"7";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="Central Mosque Gate")||(one=="Central Mosque Gate"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"8";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="Social Scienc/Cafe./Auditorium/TSC")||(one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"8";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="MH Hall")||(one=="MH Hall"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"10";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"7";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"6";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="JU School-College")||(one=="JU School-College"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"6";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"5";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"5";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"8";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"10";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"7";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="Generator House")||(one=="Generator House"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"8";
        else if((one=="Old Arts/ Al-Beruni Hall"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Old Arts/ Al-Beruni Hall" ))ans = ans+"8";


            //four

        else if((one=="VC Office/Bank"&& two=="Physics/Chemistry")||(one=="Physics/Chemistry"&& two=="VC Office/Bank" ))ans = ans+"5";
        else if((one=="VC Office/Bank"&& two=="(SSB/Kamaluddin/Bhashani) Hall")||(one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="VC Office/Bank" ))ans = ans+"7";
        else if((one=="VC Office/Bank"&& two=="Central Mosque Gate")||(one=="Central Mosque Gate"&& two=="VC Office/Bank" ))ans = ans+"6";
        else if((one=="VC Office/Bank"&& two=="Social Scienc/Cafe./Auditorium/TSC")||(one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="VC Office/Bank" ))ans = ans+"5";
        else if((one=="VC Office/Bank"&& two=="MH Hall")||(one=="MH Hall"&& two=="VC Office/Bank" ))ans = ans+"8";
        else if((one=="VC Office/Bank"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall"&& two=="VC Office/Bank" ))ans = ans+"7";
        else if((one=="VC Office/Bank"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="VC Office/Bank" ))ans = ans+"7";
        else if((one=="VC Office/Bank"&& two=="JU School-College")||(one=="JU School-College"&& two=="VC Office/Bank" ))ans = ans+"7";
        else if((one=="VC Office/Bank"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="VC Office/Bank" ))ans = ans+"6";
        else if((one=="VC Office/Bank"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="VC Office/Bank" ))ans = ans+"5";
        else if((one=="VC Office/Bank"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="VC Office/Bank" ))ans = ans+"7";
        else if((one=="VC Office/Bank"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="VC Office/Bank" ))ans = ans+"7";
        else if((one=="VC Office/Bank"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="VC Office/Bank" ))ans = ans+"5";
        else if((one=="VC Office/Bank"&& two=="Generator House")||(one=="Generator House"&& two=="VC Office/Bank" ))ans = ans+"7";
        else if((one=="VC Office/Bank"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="VC Office/Bank" ))ans = ans+"8";



            //five

        else if((one=="Physics/Chemistry"&& two=="(SSB/Kamaluddin/Bhashani) Hall")||(one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Physics/Chemistry" ))ans = ans+"5";
        else if((one=="Physics/Chemistry"&& two=="Central Mosque Gate")||(one=="Central Mosque Gate"&& two=="Physics/Chemistry" ))ans = ans+"6";
        else if((one=="Physics/Chemistry"&& two=="Social Scienc/Cafe./Auditorium/TSC")||(one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Physics/Chemistry" ))ans = ans+"5";
        else if((one=="Physics/Chemistry"&& two=="MH Hall")||(one=="MH Hall"&& two=="Physics/Chemistry" ))ans = ans+"6";
        else if((one=="Physics/Chemistry"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall"&& two=="Physics/Chemistry" ))ans = ans+"8";
        else if((one=="Physics/Chemistry"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="Physics/Chemistry" ))ans = ans+"8";
        else if((one=="Physics/Chemistry"&& two=="JU School-College")||(one=="JU School-College"&& two=="Physics/Chemistry" ))ans = ans+"8";
        else if((one=="Physics/Chemistry"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="Physics/Chemistry" ))ans = ans+"7";
        else if((one=="Physics/Chemistry"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Physics/Chemistry" ))ans = ans+"7";
        else if((one=="Physics/Chemistry"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="Physics/Chemistry" ))ans = ans+"5";
        else if((one=="Physics/Chemistry"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="Physics/Chemistry" ))ans = ans+"5";
        else if((one=="Physics/Chemistry"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="Physics/Chemistry" ))ans = ans+"5";
        else if((one=="Physics/Chemistry"&& two=="Generator House")||(one=="Generator House"&& two=="Physics/Chemistry" ))ans = ans+"7";
        else if((one=="Physics/Chemistry"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Physics/Chemistry" ))ans = ans+"10";



            //six

        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Central Mosque Gate")||(one=="Central Mosque Gate"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"7";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Social Scienc/Cafe./Auditorium/TSC")||(one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"7";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="MH Hall")||(one=="MH Hall"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"8";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"8";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"8";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="JU School-College")||(one=="JU School-College"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"8";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"7";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"7";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"8";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"5";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"5";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Generator House")||(one=="Generator House"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"5";
        else if((one=="(SSB/Kamaluddin/Bhashani) Hall"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="(SSB/Kamaluddin/Bhashani) Hall" ))ans = ans+"10";



            //seven

        else if((one=="Central Mosque Gate"&& two=="Social Scienc/Cafe./Auditorium/TSC")||(one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Central Mosque Gate" ))ans = ans+"5";
        else if((one=="Central Mosque Gate"&& two=="MH Hall")||(one=="MH Hall"&& two=="Central Mosque Gate" ))ans = ans+"7";
        else if((one=="Central Mosque Gate"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall"&& two=="Central Mosque Gate" ))ans = ans+"5";
        else if((one=="Central Mosque Gate"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="Central Mosque Gate" ))ans = ans+"7";
        else if((one=="Central Mosque Gate"&& two=="JU School-College")||(one=="JU School-College"&& two=="Central Mosque Gate" ))ans = ans+"8";
        else if((one=="Central Mosque Gate"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="Central Mosque Gate" ))ans = ans+"8";
        else if((one=="Central Mosque Gate"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Central Mosque Gate" ))ans = ans+"7";
        else if((one=="Central Mosque Gate"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="Central Mosque Gate" ))ans = ans+"8";
        else if((one=="Central Mosque Gate"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="Central Mosque Gate" ))ans = ans+"8";
        else if((one=="Central Mosque Gate"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="Central Mosque Gate" ))ans = ans+"5";
        else if((one=="Central Mosque Gate"&& two=="Generator House")||(one=="Generator House"&& two=="Central Mosque Gate" ))ans = ans+"8";
        else if((one=="Central Mosque Gate"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Central Mosque Gate" ))ans = ans+"10";


            //eight

        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="MH Hall")||(one=="MH Hall"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"5";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"6";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"7";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="JU School-College")||(one=="JU School-College"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"8";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"7";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"7";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"7";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"7";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"5";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Generator House")||(one=="Generator House"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"8";
        else if((one=="Social Scienc/Cafe./Auditorium/TSC"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Social Scienc/Cafe./Auditorium/TSC"))ans = ans+"10";



            //nine
        else if((one=="MH Hall"&& two=="(Pritilota/Jahanara Imam) Hall")||(one=="(Pritilota/Jahanara Imam) Hall"&& two=="MH Hall"))ans = ans+"8";
        else if((one=="MH Hall"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="MH Hall"))ans = ans+"8";
        else if((one=="MH Hall"&& two=="JU School-College")||(one=="JU School-College"&& two=="MH Hall"))ans = ans+"10";
        else if((one=="MH Hall"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="MH Hall"))ans = ans+"10";
        else if((one=="MH Hall"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="MH Hall"))ans = ans+"10";
        else if((one=="MH Hall"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="MH Hall"))ans = ans+"5";
        else if((one=="MH Hall"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="MH Hall"))ans = ans+"7";
        else if((one=="MH Hall"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="MH Hall"))ans = ans+"7";
        else if((one=="MH Hall"&& two=="Generator House")||(one=="Generator House"&& two=="MH Hall"))ans = ans+"10";
        else if((one=="MH Hall"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="MH Hall"))ans = ans+"12";


            //ten

        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="(N.F./Khaleda Zia) Hall")||(one=="(N.F./Khaleda Zia) Hall"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"5";
        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="JU School-College")||(one=="JU School-College"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"7";
        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"7";
        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"7";
        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"8";
        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"8";
        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"7";
        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="Generator House")||(one=="Generator House"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"10";
        else if((one=="(Pritilota/Jahanara Imam) Hall"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="(Pritilota/Jahanara Imam) Hall"))ans = ans+"10";


            //eleven

        else if((one=="(N.F./Khaleda Zia) Hall"&& two=="JU School-College")||(one=="JU School-College"&& two=="(N.F./Khaleda Zia) Hall"))ans = ans+"6";
        else if((one=="(N.F./Khaleda Zia) Hall"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="(N.F./Khaleda Zia) Hall"))ans = ans+"7";
        else if((one=="(N.F./Khaleda Zia) Hall"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="(N.F./Khaleda Zia) Hall"))ans = ans+"6";
        else if((one=="(N.F./Khaleda Zia) Hall"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="(N.F./Khaleda Zia) Hall"))ans = ans+"8";
        else if((one=="(N.F./Khaleda Zia) Hall"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="(N.F./Khaleda Zia) Hall"))ans = ans+"8";
        else if((one=="(N.F./Khaleda Zia) Hall"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="(N.F./Khaleda Zia) Hall"))ans = ans+"7";
        else if((one=="(N.F./Khaleda Zia) Hall"&& two=="Generator House")||(one=="Generator House"&& two=="(N.F./Khaleda Zia) Hall"))ans = ans+"8";
        else if((one=="(N.F./Khaleda Zia) Hall"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="(N.F./Khaleda Zia) Hall"))ans = ans+"8";


            //twelve

        else if((one=="JU School-College"&& two=="Club/Bachelor's Quarter")||(one=="Club/Bachelor's Quarter"&& two=="JU School-College"))ans = ans+"5";
        else if((one=="JU School-College"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="JU School-College"))ans = ans+"5";
        else if((one=="JU School-College"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="JU School-College"))ans = ans+"8";
        else if((one=="JU School-College"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="JU School-College"))ans = ans+"8";
        else if((one=="JU School-College"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="JU School-College"))ans = ans+"7";
        else if((one=="JU School-College"&& two=="Generator House")||(one=="Generator House"&& two=="JU School-College"))ans = ans+"8";
        else if((one=="JU School-College"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="JU School-College"))ans = ans+"6";


            //thirteen
        else if((one=="Club/Bachelor's Quarter"&& two=="Fazilatunnesa Hall/Medical/Transport")||(one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Club/Bachelor's Quarter"))ans = ans+"5";
        else if((one=="Club/Bachelor's Quarter"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="Club/Bachelor's Quarter"))ans = ans+"8";
        else if((one=="Club/Bachelor's Quarter"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="Club/Bachelor's Quarter"))ans = ans+"10";
        else if((one=="Club/Bachelor's Quarter"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="Club/Bachelor's Quarter"))ans = ans+"7";
        else if((one=="Club/Bachelor's Quarter"&& two=="Generator House")||(one=="Generator House"&& two=="Club/Bachelor's Quarter"))ans = ans+"8";
        else if((one=="Club/Bachelor's Quarter"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Club/Bachelor's Quarter"))ans = ans+"8";


            //fourteen

        else if((one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Biological Faculty/Gym./Science Research Center")||(one=="Biological Faculty/Gym./Science Research Center"&& two=="Fazilatunnesa Hall/Medical/Transport"))ans = ans+"8";
        else if((one=="Fazilatunnesa Hall/Medical/Transport"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="Fazilatunnesa Hall/Medical/Transport"))ans = ans+"8";
        else if((one=="Fazilatunnesa Hall/Medical/Transport"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="Fazilatunnesa Hall/Medical/Transport"))ans = ans+"7";
        else if((one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Generator House")||(one=="Generator House"&& two=="Fazilatunnesa Hall/Medical/Transport"))ans = ans+"7";
        else if((one=="Fazilatunnesa Hall/Medical/Transport"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Fazilatunnesa Hall/Medical/Transport"))ans = ans+"8";


            //fifteen
        else if((one=="Biological Faculty/Gym./Science Research Center"&& two=="BBH/New Geology Building")||(one=="BBH/New Geology Building"&& two=="Biological Faculty/Gym./Science Research Center"))ans = ans+"7";
        else if((one=="Biological Faculty/Gym./Science Research Center"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="Biological Faculty/Gym./Science Research Center"))ans = ans+"6";
        else if((one=="Biological Faculty/Gym./Science Research Center"&& two=="Generator House")||(one=="Generator House"&& two=="Biological Faculty/Gym./Science Research Center"))ans = ans+"8";
        else if((one=="Biological Faculty/Gym./Science Research Center"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Biological Faculty/Gym./Science Research Center"))ans = ans+"10";


            //sixteen
        else if((one=="BBH/New Geology Building"&& two=="New Arts/Central Library")||(one=="New Arts/Central Library"&& two=="BBH/New Geology Building"))ans = ans+"6";
        else if((one=="BBH/New Geology Building"&& two=="Generator House")||(one=="Generator House"&& two=="BBH/New Geology Building"))ans = ans+"8";
        else if((one=="BBH/New Geology Building"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="BBH/New Geology Building"))ans = ans+"10";


            //seventeen
        else if((one=="New Arts/Central Library"&& two=="Generator House")||(one=="Generator House"&& two=="New Arts/Central Library"))ans = ans+"7";
        else if((one=="New Arts/Central Library"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="New Arts/Central Library"))ans = ans+"10";

            //eightenn
        else if((one=="Generator House"&& two=="Bishmail North Gate")||(one=="Bishmail North Gate"&& two=="Generator House"))ans = ans+"10";






        showVara.setText(ans);


    }
}
