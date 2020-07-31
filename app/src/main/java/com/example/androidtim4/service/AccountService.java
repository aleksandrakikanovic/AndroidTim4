package com.example.androidtim4.service;


import android.util.Log;
import android.widget.Toast;
import com.example.androidtim4.AddAccountActivity;
import com.example.androidtim4.ProfileActivity;
import com.example.androidtim4.serviceInterface.AccountInterface;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AccountService {

    public static AccountInterface accountInterface = ServiceUtil.getRetrofit().create(AccountInterface.class);
    public static List<Account> accounts = new ArrayList<Account>();
    public static boolean deleted = false;

    public static void addAccount(String user_username, String email, String username, String password) {
        Account account = new Account(user_username, email, username, password);
        Call<Account> call1 = accountInterface.createAccount(account);
        call1.enqueue(new Callback<Account>() {
            @Override
            public void onResponse(Call<Account> call, Response<Account> response) {
                Account account1 = response.body();
                Log.d("TAG", "Response = " + account1);
                Toast.makeText(AddAccountActivity.context, "Account created", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<Account> call, Throwable t) {
                call.cancel();
            }
        });
    }
    public static List<Account> getAllAccounts(){
        Call<List<Account>> call = accountInterface.getAccounts();
        call.enqueue(new Callback<List<Account>>() {
            @Override
            public void onResponse(Call<List<Account>> call, Response<List<Account>> response) {
                accounts = response.body();
                Log.d("TAG", "Response = " + accounts);
                ProfileActivity.recyclerView.setAdapter(ProfileActivity.accountAdapter);
                ProfileActivity.accountAdapter.setAccountList(accounts);
            }
            @Override
            public void onFailure(Call<List<Account>> call, Throwable t) {
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


