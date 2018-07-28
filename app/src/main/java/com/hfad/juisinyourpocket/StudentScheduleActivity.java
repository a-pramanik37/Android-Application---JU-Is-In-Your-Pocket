package com.hfad.juisinyourpocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class StudentScheduleActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_schedule);


        pdfView= (PDFView) findViewById(R.id.pdfViewStudent);
        pdfView.fromAsset("students.pdf").load();
    }
}
