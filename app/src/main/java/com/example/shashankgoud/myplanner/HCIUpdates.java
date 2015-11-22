package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HCIUpdates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hciupdates);
    }

    public void gotoPiazza(View view) {
        Intent i=new Intent(HCIUpdates.this, PiazzaRedirect.class);
        startActivity(i);
        TextView textView = (TextView) findViewById(R.id.PiazzaUpdatesid1);
        textView.setTypeface(null, Typeface.NORMAL);
    }

    public void gotoMoodle(View view) {
        Intent i=new Intent(HCIUpdates.this, MoodleRedirect.class);
        startActivity(i);
    }

    public void gotoCourseWebsite(View view) {
        Intent i=new Intent(HCIUpdates.this, CourseWebsiteRedirect.class);
        startActivity(i);
    }

    public void gotoHome(View view) {
        Intent i=new Intent(HCIUpdates.this, HomeScreenActivity.class);
        startActivity(i);
    }
    public void onLogoutClick(View view) {
        Intent i=new Intent(HCIUpdates.this, MainActivity.class);
        startActivity(i);
    }
}
