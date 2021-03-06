package com.example.b00356825.taxitalk;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;


public class FindPost_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_post);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button findTrip = findViewById(R.id.findTripBtn);
        Button postTrip = findViewById(R.id.postTripBtn);

        findTrip.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FindPost_Activity.this, Trip_List_Activity.class);
                startActivity(intent);
            }
        });

        postTrip.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FindPost_Activity.this, Trip_Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Intent intent;
        switch (id){
            case R.id.profile:
                intent = new Intent(FindPost_Activity.this, Profile_Activity.class);
                startActivity(intent);
                break;
            case  R.id.action_map:
                intent = new Intent(FindPost_Activity.this, MapActivity.class);
                startActivity(intent);
                break;
            case R.id.logOut:
                intent = new Intent(FindPost_Activity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.contact:
                intent = new Intent(FindPost_Activity.this, Contact_Activity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
