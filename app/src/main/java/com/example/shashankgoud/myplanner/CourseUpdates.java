package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CourseUpdates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Course Updates");
        setContentView(R.layout.activity_course_updates);
    }

    public void gotoPiazza(View view) {
        Intent i=new Intent(CourseUpdates.this, PiazzaRedirect.class);
        startActivity(i);
    }

    public void gotoMoodle(View view) {
        Intent i=new Intent(CourseUpdates.this, MoodleRedirect.class);
        startActivity(i);
    }

    public void gotoCourseWebsite(View view) {
        Intent i=new Intent(CourseUpdates.this, CourseWebsiteRedirect.class);
        startActivity(i);
    }

}
