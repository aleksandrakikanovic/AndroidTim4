package com.example.androidtim4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import model.Contact;
import model.EnumFormat;

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
        createContacts();
    }

    public void createContacts(){
        final ArrayList<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(1,"Nina", "Markovic", "Nina", "nina@gmail.com", EnumFormat.html ));
        contactList.add(new Contact(2,"Jovana", "Subotic", "Jovana", "jovana@gmail.com", EnumFormat.html ));
        contactList.add(new Contact(3,"Aleksandra", "Kikanovic", "Aleksandra", "aleksandra@gmail.com", EnumFormat.html  ));
        final ListView list = findViewById(R.id.listview_contacts);
        ArrayAdapter<Contact> arrayAdapter = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1, contactList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact c = contactList.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Contact", c);
                Intent intent = new Intent(ContactsActivity.this, ContactActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
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
        }
        return false;
    }


}
