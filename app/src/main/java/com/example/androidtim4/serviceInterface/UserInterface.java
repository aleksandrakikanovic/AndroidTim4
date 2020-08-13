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

public interface UserInterface {
    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })

    @GET("/mail/users") //lista usera
    Call<List<User>> getUsers();

    @GET("/mail/users/{username}") //izabrani user
    Call<User> getUser(@Path("username")String username);

    @POST("/mail/users") //kreiranje novog objekta
    Call<User> createUser(@Body User user);

    @PUT("/mail/users") //izmena izabranog accounta
    Call<User> editUser(@Body User user);

    @DELETE("/mail/users/{id}") //brisanje usera
    Call<User> deleteUser(@Path("id") int id);

//    @POST("/mail/users/{username}") //login
//    Call<Boolean> logIn(@Body User user, @Path("username")String username);

}


