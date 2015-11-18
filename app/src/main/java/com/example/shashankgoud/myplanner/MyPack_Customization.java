package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;


public class MyPack_Customization extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("MyPack Customization");
        setContentView(R.layout.activity_my_pack__customization);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_pack__customization, menu);
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

    public void saveMyPackOnClick(View view) {
        Intent i=new Intent(MyPack_Customization.this, Customize_Updates.class);
        startActivity(i);
    }

    public void clearMyPackOnClick(View view) {
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

        if (checkBox1.isChecked()) {
            checkBox1.setChecked(false);
        }
        if (checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }

    }
}
