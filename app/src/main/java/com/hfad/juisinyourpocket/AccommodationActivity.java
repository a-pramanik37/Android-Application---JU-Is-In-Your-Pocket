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

public class AccommodationActivity extends AppCompatActivity {

    Toolbar toolbar;

    String hallNames[] = new String []{
       "Mir Mosharraf Hossain Hall\n" +
               "\tProvost\n" +
               "\tDr. Shafi Mohammad Tareq\n" +
               "\tDepartment of Environmental Sciences",

            "Shaheed Salam-Barkat Hall\n" +
                    "\tProvost\n" +
                    "\tDr. Ali Azam Talukder\n" +
                    "\tDepartment of Microbiology",

            "Bangabandhu Sheikh Mujibur Rahman Hall\n" +
                    "\tProvost\n" +
                    "\tFarid Ahmed\n" +
                    "\tDepartment of Philosophy",

            "Al Beruni Hall\n" +
                    "\tProvost\n" +
                    "\tMohammad Amzad Hossain\n" +
                    "\tDepartment of Economics",

            "Shaheed Rafiq-Jabbar Hall\n" +
                    "\tProvost\n" +
                    "\tDr. Sohel Ahmed\n" +
                    "\tDepartment of Biochemistry & Molecular Biology",

            "A F M Kamaluddin Hall\n" +
                    "\tProvost\n" +
                    "\tSikder Md Zulkernine\n" +
                    "\tDepartment of Archaeology",

            "Mowlana Bhashani Hall\n" +
                    "\tProvost\n" +
                    "\tMr. Najmul Hasan Talukder\n" +
                    "\tDepartment of Bangla",

            "Bishwakabi Rabindranath Tagore Hall\n" +
                    "\tProvost\n" +
                    "\tDr.Abdullah Hel Kafi\n" +
                    "\tDepartment of International Relations",

            "Jahanara Imam Hall\n" +
                    "\tProvost\n" +
                    "\tDr. Jugal Krishna Das, B.Sc(Donetsk), MSc.(Donetsk), PhD(Kiev)\n" +
                    "\tDepartment of Computer Science and Engineering",

            "Nawab Faizunnesa Hall\n" +
                    "\tProvost\n" +
                    "\tNigar Sultana\n" +
                    "\tDepartment of Marketing",

            "Pritilata Hall",

            "Fazilatunnesa Hall\n" +
                    "\tProvost\n" +
                    "\tDr. A.T.M. Atiqur Rahman\n" +
                    "\tDepartment of History",

            "Begum Khaleda Zia Hall\n" +
                    "\tProvost\n" +
                    "\tHosne Ara\n" +
                    "\tDepartment of History",

            "Sheikh Hasina Hall\n" +
                    "\tProvost\n" +
                    "\tBashir Ahmed\n" +
                    "\tDepartment of Government & Politics",

            "Bangamata Begum Fazilatunnessa Mujib Hall\n" +
                    "\tProvost\n" +
                    "\tDr. M.Mazibar Rahman\n" +
                    "\tDepartment of Statistics",

            "Begum Sufia Kamal Hall\n" +
                    "\tProvost\n" +
                    "\tDr. Md. Motaher Hossain\n" +
                    "\tInstitute of Business Administration"


    };

    String mapLink[] = new String[]{
            "https://www.google.com/maps/place/Mir+Mosharraf+Hossain+Hall/@23.8747139,90.2712263,18.64z/data=!4m5!3m4!1s0x0:0x1bb1537c168a0f9c!8m2!3d23.8748305!4d90.2714567",
            "https://www.google.com/maps/place/Shaheed+Salam+Barkat+Hall/@23.8819837,90.2632159,17.58z/data=!4m12!1m6!3m5!1s0x0:0x1bb1537c168a0f9c!2sMir+Mosharraf+Hossain+Hall!8m2!3d23.8748305!4d90.2714567!3m4!1s0x3755e9a02cf2ae03:0xf313813700cacb68!8m2!3d23.8825096!4d90.2642392",
            "https://www.google.com/maps/place/Bangabandhu+Sheikh+Mujibur+Rahman+Hall/@23.8778391,90.264111,17.58z/data=!4m12!1m6!3m5!1s0x0:0x1bb1537c168a0f9c!2sMir+Mosharraf+Hossain+Hall!8m2!3d23.8748305!4d90.2714567!3m4!1s0x3755e99ef38a4e6d:0x2ce190a05c802319!8m2!3d23.8779527!4d90.2646448",
            "https://www.google.com/maps/place/Al+Beruni+Hall/@23.8852051,90.2642757,17.58z/data=!4m12!1m6!3m5!1s0x0:0x1bb1537c168a0f9c!2sMir+Mosharraf+Hossain+Hall!8m2!3d23.8748305!4d90.2714567!3m4!1s0x3755e9a1ebf6ae81:0xa103942249675d94!8m2!3d23.8858524!4d90.2651585",
            "https://www.google.com/maps/place/Shaheed+Rafiq-Jabbar+Hall/@23.8799867,90.2607026,17.58z/data=!4m12!1m6!3m5!1s0x0:0x1bb1537c168a0f9c!2sMir+Mosharraf+Hossain+Hall!8m2!3d23.8748305!4d90.2714567!3m4!1s0x3755e99fc1774f47:0xa8940140805475c9!8m2!3d23.8803747!4d90.2615643",
            "https://www.google.com/maps/place/A.+F.+M.+Kamaluddin+Hall/@23.8802474,90.2633305,17.06z/data=!4m12!1m6!3m5!1s0x0:0x1bb1537c168a0f9c!2sMir+Mosharraf+Hossain+Hall!8m2!3d23.8748305!4d90.2714567!3m4!1s0x3755e99f7060a7f3:0xc05906a763febaec!8m2!3d23.8811724!4d90.2649982",
            "https://www.google.com/maps/place/Mowlana+Bhasani+Hall/@23.8805212,90.2638426,19.85z/data=!4m12!1m6!3m5!1s0x3755e9bcca9e8a09:0x9767003464a0acf0!2sSheikh+Hasina+Hall!8m2!3d23.8861682!4d90.2712156!3m4!1s0x3755e99fa2fc6775:0xc6887f38a27946e5!8m2!3d23.8803882!4d90.2638858",
            "https://www.google.com/maps/place/Bishwa+Kobi+Rabindranath+Tagore+Hall/@23.8785901,90.2608644,18z/data=!3m1!4b1!4m5!3m4!1s0x3755e975964f48eb:0xb07d1737bc892a5f!8m2!3d23.8785888!4d90.2614554",
            "https://www.google.com/maps/place/Jahanara+Imam+Hall/@23.8847108,90.2671797,17.85z/data=!4m12!1m6!3m5!1s0x0:0x1bb1537c168a0f9c!2sMir+Mosharraf+Hossain+Hall!8m2!3d23.8748305!4d90.2714567!3m4!1s0x3755e9a31a036f13:0xe6ac91643432dd3c!8m2!3d23.8856581!4d90.2700005",
            "https://www.google.com/maps/place/Nawab+Faizunnesa+Hall/@23.8872028,90.269273,17.85z/data=!4m12!1m6!3m5!1s0x0:0x1bb1537c168a0f9c!2sMir+Mosharraf+Hossain+Hall!8m2!3d23.8748305!4d90.2714567!3m4!1s0x3755e9a4a819cc51:0xb26af66d20e66ab1!8m2!3d23.8880725!4d90.2713209",
            "https://www.google.com/maps/place/Preetilata+Hall/@23.8845172,90.2695379,17.74z/data=!4m5!3m4!1s0x3755e9a2dc63d167:0xeb6018b5442517fb!8m2!3d23.884449!4d90.2703673",
            "https://www.google.com/maps/place/Fazilatunnesa+Hall/@23.8852397,90.2665655,17.85z/data=!4m12!1m6!3m5!1s0x0:0x1bb1537c168a0f9c!2sMir+Mosharraf+Hossain+Hall!8m2!3d23.8748305!4d90.2714567!3m4!1s0x3755e9a22f3bd82d:0x55f7c9a4fd17993d!8m2!3d23.8845483!4d90.2666257",
            "https://www.google.com/maps/place/Begum+Khaleda+Zia+Hall/@23.8873917,90.2703382,18.9z/data=!4m5!3m4!1s0x3755e9a3508b420b:0xb9f4d7d295d0f19a!8m2!3d23.8874416!4d90.2708763",
            "https://www.google.com/maps/place/Sheikh+Hasina+Hall/@23.8864525,90.2706509,18.9z/data=!4m5!3m4!1s0x3755e9bcca9e8a09:0x9767003464a0acf0!8m2!3d23.8861682!4d90.2712156",
            "https://www.google.com/maps/place/Bongomata+Begum+Fazilatunnesa+Muzib+Hall,JU/@23.884237,90.2711825,18z/data=!3m1!4b1!4m12!1m6!3m5!1s0x3755e9bcca9e8a09:0x9767003464a0acf0!2sSheikh+Hasina+Hall!8m2!3d23.8861682!4d90.2712156!3m4!1s0x3755e9bd31d1516d:0xe9487370b93697c6!8m2!3d23.8842356!4d90.2718147",
            "https://www.google.com/maps/place/Begum+Sufia+Kamal+Hall/@23.8848877,90.2713202,19.58z/data=!4m12!1m6!3m5!1s0x3755e9bcca9e8a09:0x9767003464a0acf0!2sSheikh+Hasina+Hall!8m2!3d23.8861682!4d90.2712156!3m4!1s0x3755e9bd30419a89:0x7d3d82a68956b9b4!8m2!3d23.8849033!4d90.2717292"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation);


        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Halls of JU");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        ListView listView = (ListView) findViewById(R.id.listViewAccommodation);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hallNames);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String url = mapLink[position];

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

    }
}
