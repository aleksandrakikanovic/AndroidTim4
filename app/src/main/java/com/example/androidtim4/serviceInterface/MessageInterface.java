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

    @GET("/mail/messages/all/{username}")
    Call<List<Message>> getMessages(@Path("username") String username);

    @GET("/mail/messages/{id}")
    Call<Message> getMessage(@Path("id") int id);

    @POST("/mail/messages")
    Call<Message> createMessage(@Body Message message);

    @PUT("/mail/messages")
    Call<Message> editMessage(@Body Message message);

    @GET("/mail/messages/{id}/{folder_id}")
    Call<Boolean> addMessageToFolder(@Path("id") int id, @Path("folder_id")int folder_id);

    @DELETE("/mail/messages/{id}")
    Call<Boolean> deleteMessage(@Path("id") int id);

}
