package com.example.androidtim4.serviceInterface;

import java.util.List;


import model.Tag;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface TagInterface{
    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })
    @GET("/tags") //lista tag
    Call<List<Tag>> getTags();

    @GET("/tags/{id}") //izabrani tag
    Call<Tag> getTag(@Path("id")int id);

    @POST("/tags") //kreiranje novog objekta
    Call<Tag> createTag(@Body Tag tag);

    @PUT("/tags") //izmena izabranog tag
    Call<Tag> edittag(@Body Tag tag);

    @DELETE("/tags/{id}") //brisanje tag
    Call<Tag> deleteTag(@Path("id") int id);
}
