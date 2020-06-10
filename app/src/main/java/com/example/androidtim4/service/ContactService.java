package com.example.androidtim4.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;


import com.example.androidtim4.CreateContactsActivity;
import com.example.androidtim4.serviceInterface.ContactInterface;

import model.Contact;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactService {

    public static ContactInterface contactInterface = ServiceUtil.getRetrofit().create(ContactInterface.class);

    public static void addContact(String firstname,String lastname, String displayname,String email, String format) {
        Contact contact = new Contact(firstname,lastname,displayname,email,format);
        Call<Contact> call1 = contactInterface.createContact(contact);
        call1.enqueue(new Callback<Contact>() {
            @Override
            public void onResponse (Call<Contact> call, Response <Contact> response){
                Contact contact1 = response.body();
                Toast.makeText(CreateContactsActivity.context, "Contact created", Toast.LENGTH_SHORT).show();
            }
            @Override
                    public void onFailure(Call<Contact> call, Throwable t){
                call.cancel();}
        });


    }
}
