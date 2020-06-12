package com.example.androidtim4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidtim4.service.UserService;

public class RegisterActivity extends AppCompatActivity {
    public static Context context;
    TextView username;
    TextView password;
    TextView firstname;
    TextView lastname;


    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_register);
        username = findViewById(R.id.username_Register);
        password = findViewById(R.id.password_Register);
        firstname = findViewById(R.id.firstname_Register);
        lastname = findViewById(R.id.lastname_Register);
        register();
    }

    public void register(){
        Button register_btn = (Button) findViewById(R.id.register_btn);
        register_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                UserService.addUser(username.getText().toString(),password.getText().toString(),firstname.getText().toString(),lastname.getText().toString());
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
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
}
