package com.hfad.juisinyourpocket;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contacts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

   /* public void visitWebsite(View view) {
        String url = "www.juniv.edu";

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(Intent.createChooser(i, "Open using..."));
    }*/

    public void sendMail(View view) {

    Intent emailIntent = new Intent(Intent.ACTION_SEND);
    emailIntent.setData(Uri.parse("mailto:"));
    String[] to = {"registrarju@gmail.com", "registrar@juniv.edu"};
    emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
    emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
    emailIntent.setType("message/rfc822");
    startActivity(Intent.createChooser(emailIntent, "Choose email client...."));
    }
}
