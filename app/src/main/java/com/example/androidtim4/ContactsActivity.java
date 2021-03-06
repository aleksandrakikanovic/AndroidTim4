package com.example.androidtim4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidtim4.adapters.ContactAdapter;
import com.example.androidtim4.adapters.FolderAdapter;
import com.example.androidtim4.service.ContactService;
import com.example.androidtim4.service.FolderService;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import model.Contact;
import model.EnumFormat;

public class ContactsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,ContactAdapter.OnNoteListener{

    private static final String TAG = "ContactsActivity";
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    public static RecyclerView recyclerView;
    public static ContactAdapter contactAdapter;
    List<Contact> contactList;
    public static Context context;

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

        recyclerView = (RecyclerView)findViewById(R.id.view_contacts);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        if(UserAccountsActivity.loggedInAccountName!="" || UserAccountsActivity.loggedInAccountName!= null){
            contactAdapter = new ContactAdapter(getApplicationContext(), ContactService.contacts, this);
            recyclerView.setAdapter(contactAdapter);
            ContactService.getAllContacts();
        }else {
            Toast.makeText(getApplicationContext(), "Please log in to continue", Toast.LENGTH_SHORT).show();
        }
        FloatingActionButton fabc = (FloatingActionButton) findViewById(R.id.fabc);
        fabc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ContactsActivity.this, CreateContactsActivity.class);
                startActivity(intent);
            }
        });

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
        }else if (id == R.id.logout) {
            UserAccountsActivity.loggedInAccountName = "";
            Intent intent = new Intent(ContactsActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        return false;
    }
    //ovde treba vrv neki atribut zbog bundle
    @Override
    public void onNoteClick(int position) {



        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);

    }


}
