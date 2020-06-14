package com.example.androidtim4.serviceInterface;

import java.util.List;

import model.Contact;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ContactInterface {
    //proba implementacije zahteva
    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })

    @GET("/mail/contacts")
    Call<List<Contact>> getContacts();

    @GET("/mail/contacts/{id}")
    Call<Contact> getContact(@Path("id")int id);

    @POST("/mail/contacts")
    Call<Contact> createContact(@Body Contact contact);

    @PUT("/mail/contacts")
    Call<Contact> editContact(@Body Contact contact);

    @DELETE("/mail/contacts/{id}")
    Call<Boolean> deleteContact(@Path("id") int id);


}
