package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Customize_Updates extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Customize Updates");
        setContentView(R.layout.activity_customize__updates);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_customize__updates, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onMyPackClick(View view) {
        Intent i=new Intent(Customize_Updates.this, MyPack_Customization.class);
        startActivity(i);
    }


    public void onCourseCustomizeClick(View view) {
        Intent i=new Intent(Customize_Updates.this, CourseCustomization.class);
        startActivity(i);
    }

    public void gotoHome(View view) {
        Intent i=new Intent(Customize_Updates.this, HomeScreenActivity.class);
        startActivity(i);
    }
    public void onLogoutClick(View view) {
        Intent i=new Intent(Customize_Updates.this, MainActivity.class);
        startActivity(i);
    }
}
