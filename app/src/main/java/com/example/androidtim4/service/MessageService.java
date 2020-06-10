package com.example.androidtim4.service;

import android.content.Context;
import android.widget.Toast;

import com.example.androidtim4.CreateEmailActivity;
import com.example.androidtim4.serviceInterface.MessageInterface;
import model.Message;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MessageService {

    public static MessageInterface messageInterface = ServiceUtil.getRetrofit().create(MessageInterface.class);

    public static void sendMail(String to, String cc, String bcc, String subject, String content){
        //dodati login account
        Message message = new Message("osa.test.aleksandra@gmail.com",to, cc, bcc,subject, content );
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
}
