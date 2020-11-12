package com.example.basiclab;

import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.NavHostFragment;

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
                /*Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
                fragment.getView().setBackgroundColor(Color.WHITE);*/
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

            case R.id.goToFirst:
                goToFirst();
                return true;
            case R.id.goToSecond:
                gotToSecond();
                return true;
            case R.id.goToThird:
                gotToThird();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

        //return super.onOptionsItemSelected(item); //OG
    }

    public void goToFirst(){
        Snackbar.make(findViewById(R.id.id_content_main), "Welcome to the first fragment", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).navigate(R.id.action_to_FirstFragment);
    }
    public void gotToSecond(){
        Snackbar.make(findViewById(R.id.id_content_main), "Welcome to the second fragment", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).navigate(R.id.action_to_SecondFragment);
    }
    public void gotToThird(){
        Snackbar.make(findViewById(R.id.id_content_main), "Welcome to the second fragment", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).navigate(R.id.action_to_ThirdFragment);
    }
}