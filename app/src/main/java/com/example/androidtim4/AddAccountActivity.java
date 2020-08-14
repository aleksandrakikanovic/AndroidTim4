package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.androidtim4.adapters.ContactAdapter;
import com.example.androidtim4.service.AccountService;



public class AddAccountActivity extends AppCompatActivity {
    public static RecyclerView recyclerView;
    public static ContactAdapter contactAdapter;
    public static Context context;
    TextView password;
    TextView usernameaccount;
    TextView emailAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
        password = findViewById(R.id.password);
        usernameaccount = findViewById(R.id.username);
        emailAcc = findViewById(R.id.emailadress);
        addAccount();
    }

    public void addAccount(){
        Button addAccount_btn = (Button) findViewById(R.id.addAccount_btn);
        addAccount_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AccountService.addAccount(LoginActivity.loggedInUserUsername,password.getText().toString(),usernameaccount.getText().toString(),emailAcc.getText().toString());
                Intent intent = new Intent(AddAccountActivity.this, LoginActivity.class);
                startActivity(intent);
                //servis, nazad na login
            }
        });
        Button register_AddAccountPage = (Button) findViewById(R.id.backtoLogin);
        register_AddAccountPage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AddAccountActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
   }