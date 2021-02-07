package com.example.androidtim4.serviceInterface;

import java.util.List;
import model.Folder;
import model.Message;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FolderInterface {

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type: application/json"
    })

    @GET("/mail/folders/{account_name}")
    Call<List<Folder>> getFolders(@Path("account_name") String account_name);

  //  @GET("/mail/folders/{account_name}/{message_id}")
   // Call<Message> getFolderMess(@Path("account_name") String account_name, @Path("message_id") int id);

    @GET("/mail/folders/getMessages/{folder_id}")
    Call<List<Message>> getFolderMess(@Path("folder_id") int id);

    @GET("/mail/folders/{id}")
    Call<Folder> getFolder(@Path("id") int id);

    @POST("/mail/folders")
    Call<Folder> createFolder(@Body Folder folder);

    @PUT("/mail/folders")
    Call<Folder> editFolder(@Body Folder folder);

    @DELETE("/mail/folders/{id}")
    Call<Boolean> deleteFolder(@Path("id") int id);


}
