package com.hfad.juisinyourpocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class TeacherScheduleActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_schedule);


        pdfView= (PDFView) findViewById(R.id.pdfViewTeacher);
        pdfView.fromAsset("teachers.pdf").load();
    }
}
