package com.example.androidtim4.service;


import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidtim4.AddAccountActivity;

import com.example.androidtim4.ProfileActivity;

import com.example.androidtim4.R;
import com.example.androidtim4.UserAccountsActivity;
import com.example.androidtim4.serviceInterface.AccountInterface;

import java.util.ArrayList;
import java.util.List;

import model.Account;


import model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AccountService {

    public static AccountInterface accountInterface = ServiceUtil.getRetrofit().create(AccountInterface.class);
    public static List<String> accounts = new ArrayList<String>();
    public static boolean deleted = false;

    public static void addAccount(String smtpAddress, String pop3, String username, String password) {
        Account account = new Account(smtpAddress, pop3, username, password);
        Call<Account> call1 = accountInterface.createAccount(account);
        call1.enqueue(new Callback<Account>() {
            @Override
            public void onResponse(Call<Account> call, Response<Account> response) {
                Account account1 = response.body();
               Toast.makeText(AddAccountActivity.context, "Account created", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<Account> call, Throwable t) {
                call.cancel();
            }
        });
    }
    public static List<String> getAllAccounts(String user_username){
        Call<List<String>> call = accountInterface.getAccounts(user_username);
        call.enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                accounts = response.body();
            }
            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {
                Log.d("TAG", "Response = " + t.toString());
            }
        });
        return accounts;
    }
    public static boolean deleteAccount(int id){
        Call<Boolean> call1 = accountInterface.deleteAccount(id);
        call1.enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                deleted = response.body();
                Toast.makeText(ProfileActivity.context,"Folder created", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                call.cancel();
            }
        });return deleted;
    }


    }


