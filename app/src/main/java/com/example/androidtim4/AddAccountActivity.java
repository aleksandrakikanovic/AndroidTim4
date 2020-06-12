package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
        addAccount();
    }

    public void addAccount(){
        Button addAccount_btn = (Button) findViewById(R.id.addAccount_btn);
        addAccount_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //servis, nazad na login
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