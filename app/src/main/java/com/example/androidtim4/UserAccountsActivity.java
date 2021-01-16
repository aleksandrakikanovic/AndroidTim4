package com.example.androidtim4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidtim4.adapters.EmailAdapter;
import com.example.androidtim4.adapters.UserAccountsAdapter;
import com.example.androidtim4.service.AccountService;
import com.example.androidtim4.service.MessageService;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import model.User;

public class UserAccountsActivity extends AppCompatActivity {
    public static Context context;
    public static String loggedInAccountName;
    Button addAccount;
    public static ListView list;
    public static ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_accounts);
        list = findViewById(R.id.view_user_accounts);
        addAccount = findViewById(R.id.addAccount);
        adapter();
    }

    public void adapter(){
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, AccountService.accounts);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                loggedInAccountName = AccountService.accounts.get(position);
                Log.d("tag", "this is acc name: " + loggedInAccountName);
                Intent intent = new Intent(UserAccountsActivity.this, FoldersActivity.class);
                startActivity(intent);
            }
        });
        addAccount.setVisibility(View.GONE);
        if(AccountService.accounts.isEmpty()){
            addAccount.setVisibility(View.VISIBLE);
            addAccount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(UserAccountsActivity.this, AddAccountActivity.class);
                    startActivity(intent);
                }
           });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}