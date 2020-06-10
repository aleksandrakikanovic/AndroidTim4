package com.example.androidtim4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import org.w3c.dom.Text;

import model.Contact;

public class ContactActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        TextView displayText = findViewById(R.id.displayName);
        Bundle bundle = getIntent().getExtras();
        Contact contact = (Contact) bundle.getSerializable("Contact");
        displayText.setText(contact.getDisplayname());

        TextView firstnameText = findViewById(R.id.firstname_contact);
        firstnameText.setText(contact.getFirstname());

        TextView lastnameText = findViewById(R.id.lastName_contact);
        lastnameText.setText(contact.getLastname());

        TextView emailText = findViewById(R.id.email_contact);
        emailText.setText(contact.getEmail());
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
}
