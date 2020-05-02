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

public class EmailsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emails);
        mDrawerLayout = findViewById(R.id.emails_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_emails);
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
            Intent intent = new Intent(EmailsActivity.this, ProfileActivity.class);
            startActivity(intent);
        }else if (id == R.id.emails){
            Toast.makeText(getApplicationContext(),"You are already in emails",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.contacts){
            Intent intent = new Intent(EmailsActivity.this, ContactsActivity.class);
            startActivity(intent);
        }else if (id == R.id.settings){
            Intent intent = new Intent(EmailsActivity.this, SettingsActivity.class);
            startActivity(intent);
        }else if (id == R.id.folders){
            Intent intent = new Intent(EmailsActivity.this, FoldersActivity.class);
            startActivity(intent);
        }
        return false;
    }
}
