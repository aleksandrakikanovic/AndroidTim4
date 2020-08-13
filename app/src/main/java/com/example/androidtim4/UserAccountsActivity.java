package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.androidtim4.adapters.EmailAdapter;
import com.example.androidtim4.adapters.UserAccountsAdapter;
import com.example.androidtim4.service.AccountService;
import com.example.androidtim4.service.MessageService;

public class UserAccountsActivity extends AppCompatActivity {

    public static RecyclerView recyclerView;
    public static UserAccountsAdapter userAccountsAdapter;
    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_accounts);
        recyclerView = (RecyclerView)findViewById(R.id.view_user_accounts);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        userAccountsAdapter = new UserAccountsAdapter(getApplicationContext(), AccountService.accounts);
        recyclerView.setAdapter(userAccountsAdapter);
        AccountService.getAllAccounts(LoginActivity.loggedInUserUsername);
    }
}