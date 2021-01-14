package com.example.androidtim4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidtim4.adapters.ContactAdapter;
import com.example.androidtim4.adapters.EmailAdapter;
import com.example.androidtim4.adapters.FolderAdapter;
import com.example.androidtim4.service.ContactService;
import com.example.androidtim4.service.FolderService;
import com.example.androidtim4.service.MessageService;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;


public class EmailsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    public static RecyclerView recyclerView;
    public static EmailAdapter emailAdapter;
    public static Context context;

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
        FloatingActionButton fabe = (FloatingActionButton) findViewById(R.id.fabe);
        fabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(EmailsActivity.this, CreateEmailActivity.class);
                startActivity(intent);
            }
        });
        recyclerView = (RecyclerView)findViewById(R.id.view_emails);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        emailAdapter = new EmailAdapter(getApplicationContext(), MessageService.messages);
        recyclerView.setAdapter(emailAdapter);
        MessageService.getAllMessages("a");

       // registerReceiver(SplashActivity.receiver, SplashActivity.filter);
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
        }else if (id == R.id.logout){
            Intent intent = new Intent(EmailsActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        return false;
    }
}
