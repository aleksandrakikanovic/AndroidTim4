package com.example.androidtim4.service;

import android.widget.Toast;

import com.example.androidtim4.CreateContactsActivity;
import com.example.androidtim4.RegisterActivity;
import com.example.androidtim4.serviceInterface.UserInterface;

import model.Contact;
import model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserService {

    public static UserInterface userInterface = ServiceUtil.getRetrofit().create(UserInterface.class);

    public static void addUser(String username, String password,String firstname,String lastname) {
        User user = new User(username, password, firstname, lastname);
        Call<User> call1 = userInterface.createUser(user);
        call1.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user1 = response.body();
                Toast.makeText(RegisterActivity.context, "User created", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                call.cancel();
            }
        });


    }
}
