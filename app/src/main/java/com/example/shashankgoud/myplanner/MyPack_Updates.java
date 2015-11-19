package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MyPack_Updates extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("MyPack Updates");
        setContentView(R.layout.activity_my_pack__updates);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_pack__updates, menu);
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
    public void ebill_gotoMyPack(View view) {
        TextView textView = (TextView) findViewById(R.id.eBill);

        Intent i=new Intent(MyPack_Updates.this, MyPackRedirect.class);
        startActivity(i);
        textView.setTypeface(null, Typeface.NORMAL);
    }

    public void etd_gotoMyPack(View view) {
        TextView textView = (TextView) findViewById(R.id.ETDDeadline);

        Intent i=new Intent(MyPack_Updates.this, MyPackRedirect.class);
        startActivity(i);
        textView.setTypeface(null, Typeface.NORMAL);
    }

    public void gotoMyPack(View view) {
        Intent i=new Intent(MyPack_Updates.this, MyPackRedirect.class);
        startActivity(i);
    }

    public void gotoHome(View view) {
        Intent i=new Intent(MyPack_Updates.this, HomeScreenActivity.class);
        startActivity(i);
    }
}
