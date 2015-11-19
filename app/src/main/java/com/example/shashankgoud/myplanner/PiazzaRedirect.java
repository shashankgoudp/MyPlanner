package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PiazzaRedirect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Piazza Redirect");
        setContentView(R.layout.activity_piazza_redirect);
    }

    public void gotoHome(View view) {
        Intent i=new Intent(PiazzaRedirect.this, HomeScreenActivity.class);
        startActivity(i);
    }
}
