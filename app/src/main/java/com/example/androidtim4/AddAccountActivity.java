package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.androidtim4.adapters.ContactAdapter;
import com.example.androidtim4.service.AccountService;



public class AddAccountActivity extends AppCompatActivity {
    public static Context context;
    TextView user_username;
    TextView email;
    TextView password;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
        user_username = findViewById(R.id.register_username_account);
        password = findViewById(R.id.editTextTextPassword);
        username = findViewById(R.id.editTextTextPersonName3);
        email = findViewById(R.id.editTextTextEmailAddress);
        addAccount();
    }

    public void addAccount(){
        Button addAccount_btn = (Button) findViewById(R.id.addAccount_btn);
        addAccount_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AccountService.addAccount(user_username.getText().toString(), email.getText().toString(),
                       username.getText().toString(), password.getText().toString());
                Intent intent = new Intent(AddAccountActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        Button register_AddAccountPage = (Button) findViewById(R.id.register_AddAccountPage);
        register_AddAccountPage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AddAccountActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
   }