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

import java.util.zip.Inflater;

public class CreateContactsActivity extends AppCompatActivity {
    public static Context context;
    TextView firstname;
    TextView lastname;
    TextView displayname;
    TextView email;
    TextView format;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contacts);
        firstname = findViewById(R.id.firstname_contact_add);
        lastname = findViewById(R.id.lastName_contact_add);
        displayname = findViewById(R.id.displayName);
        email = findViewById(R.id.email_contact_add);
        format = findViewById(R.id.format);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.save_contact:
                ContactService.addContact(firstname.getText().toString(),lastname.getText().toString(),displayname.getText().toString(),email.getText().toString(),format.getText().toString() );
                break;
            case R.id.cancel_contact:
                Intent intent = new Intent(CreateContactsActivity.this, ContactsActivity.class);
                startActivity(intent);
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
