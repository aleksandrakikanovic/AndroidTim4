package com.example.androidtim4.serviceInterface;

import java.util.List;

import model.Photo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PhotoInterface {

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type: application/json"
    })

    @GET("/photos")
    Call<List<Photo>> getPhotos();

    @GET("/photos/{id}")
    Call<Photo> getPhoto(@Path("id") int id);

    @POST("/photos")
    Call<Photo> createPhoto(@Body Photo photo);

    @PUT("/photos")
    Call<Photo> editPhoto(@Body Photo photo);

    @DELETE("/photos/{id}")
    Call<Photo> deletePhoto(@Path("id") int id);

}
