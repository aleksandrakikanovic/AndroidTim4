package com.example.androidtim4.serviceInterface;

import java.util.List;
import model.Folder;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface FolderInterface {

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type: application/json"
    })

    @GET("/folders")
    Call<List<Folder>> getFolders();

    @GET("/folders/{id}")
    Call<Folder> getFolder(@Path("id") int id);

    @POST("/folders")
    Call<Folder> createFolder(@Body Folder folder);

    @PUT("/folders")
    Call<Folder> editFolder(@Body Folder folder);

    @DELETE("/folders/{id}")
    Call<Folder> deleteFolder(@Path("id") int id);


}
