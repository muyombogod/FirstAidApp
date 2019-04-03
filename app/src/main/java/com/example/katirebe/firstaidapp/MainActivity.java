package com.example.katirebe.firstaidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 NAME: MUYOMBO GODFREY
 REGNO: 2017BIT106PS
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.burns:
                this.startActivity(new Intent(this, Burns.class));
                return true;
            case R.id.cuts:
                this.startActivity(new Intent(this,Cuts.class));
                return true;
                default:
        return super.onOptionsItemSelected(item);
    }
}}
