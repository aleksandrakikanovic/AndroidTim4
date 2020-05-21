package com.example.androidtim4.serviceInterface;

import java.util.List;

import model.Account;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AccountInterface {

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })

    @GET("/accounts") //lista accounta
    Call<List<Account>> getAccounts();

    @GET("/accounts/{id}") //izabrani account
    Call<Account> getAccount(@Path("id")int id);

    @POST("/accounts") //kreiranje novog objekta
    Call<Account> createAccount(@Body Account account);

    @PUT("/accounts") //izmena izabranog accounta
    Call<Account> editAccount(@Body Account account);

    @DELETE("/accounts/{id}") //brisanje accounta
    Call<Account> deleteAccount(@Path("id") int id);

}
