package com.example.androidtim4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class ContactsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        mDrawerLayout = findViewById(R.id.contacts_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_contacts);
        navigationView.setNavigationItemSelectedListener(this);

    }
    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onRestart() {
        super.onRestart();
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
    }
    @Override
    public void onStop() {
        super.onStop();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        if(id == R.id.profile){
            Intent intent = new Intent(ContactsActivity.this, ProfileActivity.class);
            startActivity(intent);
        }else if (id == R.id.emails){
            Intent intent = new Intent(ContactsActivity.this, EmailsActivity.class);
            startActivity(intent);
        }else if (id == R.id.contacts){
            Toast.makeText(getApplicationContext(),"You are already in contacts",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.settings){
            Intent intent = new Intent(ContactsActivity.this, SettingsActivity.class);
            startActivity(intent);
        }else if (id == R.id.folders){
            Intent intent = new Intent(ContactsActivity.this, FoldersActivity.class);
            startActivity(intent);
        }
        return false;
    }
}
