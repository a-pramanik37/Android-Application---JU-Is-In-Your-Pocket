package com.hfad.juisinyourpocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BusScheduleActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_schedule);
        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("Bus Schedules");
    }

    public void StudentSchedule(View view) {
        Intent intent = new Intent(this, StudentScheduleActivity.class);
        startActivity(intent);
    }

    public void TeachersAndStaffs(View view) {

        Intent intent = new Intent(this, TeacherScheduleActivity.class);
        startActivity(intent);
    }
}
