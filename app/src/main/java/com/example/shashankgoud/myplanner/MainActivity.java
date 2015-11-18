package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Home Screen");
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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



    public void buttonOnClick(View v) {


        EditText UserName = (EditText) findViewById(R.id.UnityIDBox);
        EditText password = (EditText) findViewById(R.id.PasswordBox);

        String username_text = UserName.getText().toString();
        String password_text = password.getText().toString();

        if (username_text.equals(password_text)) {
            Intent i = new Intent(MainActivity.this, HomeScreenActivity.class);
            startActivity(i);
        } else {

            Toast.makeText(MainActivity.this, "User Name and Password do not match. Try again", Toast.LENGTH_LONG).show();

        }
    }

    public void onClick(View v)
    {

        Intent i=new Intent(MainActivity.this, ForgotPassword.class);

        startActivity(i);

    }
}
