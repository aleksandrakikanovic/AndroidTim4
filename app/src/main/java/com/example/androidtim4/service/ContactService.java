package com.example.androidtim4.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import android.widget.Toolbar;


import com.example.androidtim4.ContactsActivity;
import com.example.androidtim4.CreateContactsActivity;
import com.example.androidtim4.serviceInterface.ContactInterface;

import java.util.ArrayList;
import java.util.List;

import model.Contact;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactService {

    public static ContactInterface contactInterface = ServiceUtil.getRetrofit().create(ContactInterface.class);
    public static List<Contact> contacts = new ArrayList<Contact>();
    public static boolean deleted = false;

    public static void addContact(String displayname, String email, String firstname, String lastname) {
        Contact contact = new Contact(displayname, email, firstname, lastname,"xxx", "xxx", "xxx");
        Call<Contact> call1 = contactInterface.createContact(contact);
        call1.enqueue(new Callback<Contact>() {
            @Override
            public void onResponse (Call<Contact> call, Response<Contact> response){
                Contact contact1 = response.body();
                Toast.makeText(CreateContactsActivity.context, "Contact created", Toast.LENGTH_SHORT).show();
            }
            @Override
                    public void onFailure(Call<Contact> call, Throwable t){
                call.cancel();}
        });


    }
    public static List<Contact> getAllContacts(){
        Call<List<Contact>> call = contactInterface.getContacts();
        call.enqueue(new Callback<List<Contact>>() {
            @Override
            public void onResponse(Call<List<Contact>> call, Response<List<Contact>> response) {
                contacts = response.body();
                Log.d("TAG", "Response = " + contacts);
                ContactsActivity.recyclerView.setAdapter(ContactsActivity.contactAdapter);
                ContactsActivity.contactAdapter.setContactList(contacts);
            }

            @Override
            public void onFailure(Call<List<Contact>> call, Throwable t) {
                Log.d("TAG", "Response = " + t.toString());
            }
        });
        return contacts;
    }

    public static boolean deleteContact(int id){
        Call<Boolean> call1 = contactInterface.deleteContact(id);
        call1.enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                deleted = response.body();
                Toast.makeText(CreateContactsActivity.context,"Contact deleted",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                call.cancel();
            }
        }); return  deleted;

    }
}
