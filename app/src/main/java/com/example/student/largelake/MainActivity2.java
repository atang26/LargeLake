package com.example.student.largelake;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button buttonErie = (Button) findViewById(R.id.buttonErie);
        Button buttonSuperior = (Button) findViewById(R.id.buttonSuperior);
        Button buttonHuron = (Button) findViewById(R.id.buttonHuron);
        Button buttonAthabasca = (Button) findViewById(R.id.buttonAthabasca);
        Button buttonDubawnt = (Button) findViewById(R.id.buttonDubawnt);
        Button buttonGreatBear = (Button) findViewById(R.id.buttonGreatBear);
        Button buttonGreatSlave = (Button) findViewById(R.id.buttonGreatSlave);
        Button buttonLakeWoods = (Button) findViewById(R.id.buttonLakeWoods);
        Button buttonManitoba = (Button) findViewById(R.id.buttonManitoba);
        Button buttonNettilling = (Button) findViewById(R.id.buttonNettilling);
        Button buttonNipigon = (Button) findViewById(R.id.buttonNipigon);
        Button buttonOntario = (Button) findViewById(R.id.buttonOntario);
        Button buttonReindeer = (Button) findViewById(R.id.buttonReindeer);
        Button buttonWinnipeg = (Button) findViewById(R.id.buttonWinnipeg);
        Button buttonWinnipegosis = (Button) findViewById(R.id.buttonWinnipegosis);
        buttonErie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityErie.class);
                startActivity(nextScreen);
            }
        });
        buttonSuperior.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivitySuperior.class);
                startActivity(nextScreen);
            }
        });
        buttonHuron.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityHuron.class);
                startActivity(nextScreen);
            }
        });
        buttonAthabasca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityAthabasca.class);
                startActivity(nextScreen);
            }
        });
        buttonDubawnt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityDubawnt.class);
                startActivity(nextScreen);
            }
        });
        buttonGreatBear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityGreatBear.class);
                startActivity(nextScreen);
            }
        });
        buttonGreatSlave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityGreatSlave.class);
                startActivity(nextScreen);
            }
        });
        buttonLakeWoods.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityLakeWoods.class);
                startActivity(nextScreen);
            }
        });
        buttonManitoba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityManitoba.class);
                startActivity(nextScreen);
            }
        });
        buttonNettilling.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityNettilling.class);
                startActivity(nextScreen);
            }
        });
        buttonNipigon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityNipigon.class);
                startActivity(nextScreen);
            }
        });
        buttonOntario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityOntario.class);
                startActivity(nextScreen);
            }
        });
        buttonReindeer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityReindeer.class);
                startActivity(nextScreen);
            }
        });
        buttonWinnipeg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityWinnipeg.class);
                startActivity(nextScreen);
            }
        });
        buttonWinnipegosis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivityWinnipegosis.class);
                startActivity(nextScreen);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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
}
