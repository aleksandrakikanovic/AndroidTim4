package com.example.androidtim4.serviceInterface;

import java.util.List;

import model.Account;
import model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AccountInterface {

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })

    @GET("/mail/accounts/{username}") //lista accounta
    Call<List<String>> getAccounts(@Path("username") String username);

//    @GET("/mail/accounts/{id}") //izabrani account
//    Call<Account> getAccount(@Path("id")int id);

    @POST("/mail/accounts") //kreiranje novog objekta
    Call<Account> createAccount(@Body Account account);

    @PUT("/mail/accounts") //izmena izabranog accounta
    Call<Account> editAccount(@Body Account account);

    @DELETE("/mail/accounts/{id}") //brisanje accounta
    Call<Boolean> deleteAccount(@Path("id") int id);

}
