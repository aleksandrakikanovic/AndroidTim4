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

    @GET("/contacts") //get za contact listu
    Call<List<Contact>> getContacts();

    @GET("/contacts/{id}") //get za izabrani contact
    Call<Contact> getContact(@Path("id")int id);

    @POST("/contacts") //pravljenje novog objekta
    Call<Contact> createContact(@Body Contact contact);

    @PUT("/contacts") //izmena postojeceg objekta contact
    Call<Contact> editContact(@Body Contact contact);

    @DELETE("/contacts/{id}") //brisanje izabranog objekta
    Call<Contact> deleteContact(@Path("id") int id);


}
