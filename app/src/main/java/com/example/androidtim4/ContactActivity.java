package com.example.androidtim4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtim4.service.ContactService;
import com.google.android.material.navigation.NavigationView;

import org.w3c.dom.Text;

import model.Contact;

public class ContactActivity extends AppCompatActivity {
    public static Context context;
    TextView displayText;
    TextView emailText;
    TextView firstnameText;
    TextView lastnameText;

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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.contact_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_contact:
              //  ContactService.addContact(displayText.getText().toString(), emailText.getText().toString(), firstnameText.getText().toString(), lastnameText.getText().toString());
                break;
            default:
                break;
        }
        return true;
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
