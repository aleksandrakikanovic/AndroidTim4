package com.example.androidtim4.service;

import android.widget.Toast;

import com.example.androidtim4.RegisterActivity;
import com.example.androidtim4.serviceInterface.AccountInterface;

import model.Account;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AccountService {

    public static AccountInterface accountInterface = ServiceUtil.getRetrofit().create(AccountInterface.class);

    public static void addAccount(String smtpAddress, String pop3, String username, String password) {
        Account account = new Account(smtpAddress, pop3, username, password);
        Call<Account> call1 = accountInterface.createAccount(account);
        call1.enqueue(new Callback<Account>() {
            @Override
            public void onResponse(Call<Account> call, Response<Account> response) {
                Account account1 = response.body();
               // Toast.makeText(RegisterActivity.context, "Account created", Toast.LENGTH_SHORT).show();
                ;
            }

            @Override
            public void onFailure(Call<Account> call, Throwable t) {
                call.cancel();
            }
        });
    }

}