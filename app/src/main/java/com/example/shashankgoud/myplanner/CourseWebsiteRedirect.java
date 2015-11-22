package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CourseWebsiteRedirect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_website_redirect);
        setTitle("Course Website Redirect");
    }
    public void gotoHome(View view) {
        Intent i=new Intent(CourseWebsiteRedirect.this, HomeScreenActivity.class);
        startActivity(i);
    }

    public void onLogoutClick(View view) {
        Intent i=new Intent(CourseWebsiteRedirect.this, MainActivity.class);
        startActivity(i);
    }
}
