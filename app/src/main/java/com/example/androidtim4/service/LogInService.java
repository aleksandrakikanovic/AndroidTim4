package com.example.androidtim4.service;

import android.widget.Toast;

import com.example.androidtim4.RegisterActivity;
import com.example.androidtim4.serviceInterface.AccountInterface;

import model.Account;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogInService {

    public static AccountInterface accountInterface = ServiceUtil.getRetrofit().create(AccountInterface.class);
    public static boolean isValid;

    public static boolean logIn(String username, String password) {
        Account account = new Account(username, password);
        Call<Boolean> call1 = accountInterface.logIn(account, username);
        call1.enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                isValid = response.body();
            }
            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                call.cancel();
                isValid=false;
            }
        });
        return isValid;
    }
}

