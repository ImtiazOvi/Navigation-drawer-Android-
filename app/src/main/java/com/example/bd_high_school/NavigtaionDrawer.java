package com.example.bd_high_school;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class NavigtaionDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigtaion_drawer);

        drawerLayout = findViewById(R.id.navigationDrawerId);
        NavigationView navigationView = findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


        Intent intent;
        int id = menuItem.getItemId();

        if (id == R.id.nav_profile_id){
            intent = new Intent(this,Activity_Profile.class);
            startActivity(intent);

        }
        else if(id == R.id.nav_class_routine_id){
            intent = new Intent(this,Activity_Routine.class);
            startActivity(intent);

        }
        else if(id == R.id.nav_attendance_id){
            intent = new Intent(this,Activity_Attendance.class);
            startActivity(intent);

        }
        else if(id == R.id.nav_result_id){
            intent = new Intent(this,Activity_Result.class);
            startActivity(intent);

        }
        else if(id == R.id.nav_holydays_id){
            intent = new Intent(this,Activity_Holydays.class);
            startActivity(intent);

        }
        else if(id == R.id.nav_notice_id){
            intent = new Intent(this,Activity_Notice.class);
            startActivity(intent);

        }
        else if(id == R.id.nav_about_id){
            intent = new Intent(this,Activity_About.class);
            startActivity(intent);

        }
        else if(id == R.id.nav_contact_id){
            intent = new Intent(this,Activity_Contact.class);
            startActivity(intent);

        }


        return false;
    }
}
