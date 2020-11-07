package com.example.basiclab;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu); //OG
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //int id = item.getItemId();   /OG

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;                        //OG
        }*/

        switch (item.getItemId()){

            case R.id.hello_item:
                hello();
                return true;
            case R.id.whoMadeMe:
                whoMadeMe();
                return true;
            case R.id.info:
                info();
                return true;
            case R.id.action_settings:
                settings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

        //return super.onOptionsItemSelected(item); //OG
    }

    public void hello(){
        Snackbar.make(findViewById(R.id.id_content_main), "Hello there", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    public void whoMadeMe(){
        Snackbar.make(findViewById(R.id.id_content_main), "Bartłomiej Wieleba made me", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    public void info(){
        Snackbar.make(findViewById(R.id.id_content_main), "I'm just a simple app", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
    public void settings(){
        Snackbar.make(findViewById(R.id.id_content_main), "This menu item will be changed later", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}