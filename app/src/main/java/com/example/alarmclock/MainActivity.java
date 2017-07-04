package com.example.alarmclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.activity_city_choose:
                Intent intent=new Intent(MainActivity.this,CityChooseActivity.class);
                startActivity(intent);
                break;
            case R.id.user_help_item:
                Intent intent_main_userhelp=new Intent(MainActivity.this,UserHelpActivity.class);
                startActivity(intent_main_userhelp);
                break;
            case R.id.about_item:
               Intent intent_main_about=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent_main_about);
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu,menu);
        return true;
    }
}
