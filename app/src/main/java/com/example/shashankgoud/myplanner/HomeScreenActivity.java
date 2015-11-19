package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class HomeScreenActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Home Screen");
        setContentView(R.layout.activity_home_screen);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
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

    public void customizeClick(View view) {
        Intent i=new Intent(HomeScreenActivity.this, Customize_Updates.class);
        startActivity(i);
    }

    public void onClick(View view) {
        Intent i=new Intent(HomeScreenActivity.this, CourseUpdates.class);
        startActivity(i);
    }

    public void hci_onClick(View view) {
        Intent i=new Intent(HomeScreenActivity.this, HCIUpdates.class);
        startActivity(i);
        TextView textView = (TextView) findViewById(R.id.hci);
        textView.setText("Human Computer Interaction");
        textView.setTextColor(Color.BLACK);
    }

    public void onMyPackUpdatesClick(View view) {
        TextView textView = (TextView) findViewById(R.id.MyPack);
        Intent i=new Intent(HomeScreenActivity.this, MyPack_Updates.class);
        startActivity(i);
        textView.setText("MyPack Notifications");
        textView.setTextColor(Color.BLACK);
    }

    public void gotoHome(View view) {
        Intent i=new Intent(HomeScreenActivity.this, HomeScreenActivity.class);
        startActivity(i);
    }
}
