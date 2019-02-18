package com.example.b00356825.taxitalk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Profile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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
                intent = new Intent(Profile_Activity.this, Profile_Activity.class);
                startActivity(intent);
                break;

            case  R.id.action_map:
                intent = new Intent(Profile_Activity.this, MapActivity.class);
                startActivity(intent);
                break;

            case R.id.contact:
                intent = new Intent(Profile_Activity.this, Contact_Activity.class);
                startActivity(intent);
                break;

            case R.id.logOut:
                intent = new Intent(Profile_Activity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
