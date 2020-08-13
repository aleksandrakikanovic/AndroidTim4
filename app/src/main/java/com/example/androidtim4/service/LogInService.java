package com.example.androidtim4.service;

import android.util.Log;
import android.widget.Toast;

import com.example.androidtim4.RegisterActivity;
import com.example.androidtim4.serviceInterface.AccountInterface;
import com.example.androidtim4.serviceInterface.UserInterface;

import model.Account;
import model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogInService {

    public static UserInterface userIntefrace = ServiceUtil.getRetrofit().create(UserInterface.class);
    public static boolean isValid;
   //
    //
    // public static User user;

    public static boolean logIn(String username) {
        Call<User> call1 = userIntefrace.getUser(username);
        call1.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
               // user=response.body();
                isValid=true;
            }
            @Override
            public void onFailure(Call<User> call, Throwable t) {
                call.cancel();
                isValid=false;
            }
        });
        Log.d("TAG", "IS IT VALID = " + isValid);
        return isValid;
    }
}

