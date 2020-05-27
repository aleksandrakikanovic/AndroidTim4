package com.example.androidtim4.serviceInterface;

import java.util.List;

import model.Message;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface MessageInterface {

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type: application/json"
    })

    @GET("/messages")
    Call<List<Message>> getMessages();

    @GET("/messages/{id}")
    Call<Message> getMessage(@Path("id") int id);

    @POST("/messages")
    Call<Message> createMessage(@Body Message message);

    @PUT("/messages")
    Call<Message> editMessage(@Body Message message);

    @DELETE("/messages/{id}")
    Call<Message> deleteMessage(@Path("id") int id);

}
