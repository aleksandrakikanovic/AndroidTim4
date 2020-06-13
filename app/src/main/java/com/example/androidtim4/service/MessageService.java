package com.example.androidtim4.service;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.androidtim4.CreateEmailActivity;
import com.example.androidtim4.EmailsActivity;
import com.example.androidtim4.serviceInterface.MessageInterface;

import java.util.ArrayList;
import java.util.List;

import model.Folder;
import model.Message;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MessageService {
    public static MessageInterface messageInterface = ServiceUtil.getRetrofit().create(MessageInterface.class);
    public static List<Message> messages = new ArrayList<>();


    public static void sendMail(String to, String cc, String bcc, String subject, String content){
        //dodati login account
        Message message = new Message("osa.test.aleksandra@gmail.com",to, cc, bcc,subject, content);
        Call<Message> call1 = messageInterface.createMessage(message);
        call1.enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                Message message1 = response.body();
                Toast.makeText(CreateEmailActivity.context,"Message sent", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<Message> call, Throwable t) {
               // Toast.makeText(CreateEmailActivity.context,"Something went wrong.Please try again", Toast.LENGTH_SHORT).show();
                call.cancel();
            }
        });
    }
    public static List<Message> getAllMessages() {
        Call<List<Message>> call = messageInterface.getMessages();
        call.enqueue(new Callback<List<Message>>() {
            @Override
            public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                messages = response.body();
                Log.d("TAG", "Response = " + messages);
                EmailsActivity.recyclerView.setAdapter(EmailsActivity.emailAdapter);
                EmailsActivity.emailAdapter.setMessageList(messages);
            }
            @Override
            public void onFailure(Call<List<Message>> call, Throwable t) {
                Log.d("TAG", "Response = " + t.toString());
            }
        });return messages;
    }

}
