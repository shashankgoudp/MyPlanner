package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyPackRedirect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("MyPack Redirect");
        setContentView(R.layout.activity_my_pack_redirect);
    }

    public void gotoHome(View view) {
        Intent i=new Intent(MyPackRedirect.this, HomeScreenActivity.class);
        startActivity(i);
    }
    public void onLogoutClick(View view) {
        Intent i=new Intent(MyPackRedirect.this, MainActivity.class);
        startActivity(i);
    }
}
