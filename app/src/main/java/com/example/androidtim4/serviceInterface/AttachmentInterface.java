package com.example.androidtim4.serviceInterface;

import java.util.List;

import model.Attachment;
import model.Contact;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AttachmentInterface {

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })

    @GET("/attachments") //lista attachmenta
    Call<List<Attachment>> getAttachments();

    @GET("/attachments/{id}") //get za izabrani attachment
    Call<Attachment> getAttachment(@Path("id")int id);

    @POST("/attachments") //kreira se novi attachment
    Call<Attachment> createAttachment(@Body Attachment attachment);

    @PUT("/attachments/{id}") //izmena postojeceg objekta attachment
    Call<Attachment> editAttachment(@Body Attachment attachment);

    @DELETE("/attachments/{id}") //brisanje izabranog objekta
    Call<Attachment> deleteAttachment(@Path("id") int id);

}
