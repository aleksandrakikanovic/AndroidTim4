package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtim4.service.LogInService;

import model.User;

public class LoginActivity extends AppCompatActivity {

    public static String loggedInUserUsername;
    TextView username;
    TextView password;
    public static Context context;
    public static User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register();
        logIn();
    }
    public void logIn(){
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        username = findViewById(R.id.login_Username);
        password = findViewById(R.id.login_Password);
        user = new User(username.getText().toString(),password.getText().toString() );
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (LogInService.logIn(username.getText().toString())){
                    Intent intent = new Intent(LoginActivity.this, UserAccountsActivity.class);
                    startActivity(intent);
                    loggedInUserUsername = username.getText().toString();
                }else{
                    Toast.makeText(LoginActivity.this, "Wrong username or password.Try again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void register(){
        Button register_btn = (Button) findViewById(R.id.register_btn_loginPage);
        register_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
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
