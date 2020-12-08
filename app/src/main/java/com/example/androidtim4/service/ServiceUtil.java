package com.example.androidtim4.service;

import com.example.androidtim4.serviceInterface.FolderInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceUtil {

    private static Retrofit retrofit = null;
    //Aleksandra 13,Nina 19 ili 24
    //Jovana : 192.168.0.107
//      private static final String BASE_URL = "http://192.168.0.24:8080/mail/";
    private static final String BASE_URL = "http://192.168.0.247:8080/mail/";
//    192.168.0.247
//192.168.0.247
    private static OkHttpClient getClient(){
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.MINUTES)
                .readTimeout(5,TimeUnit.MINUTES)
                .build();
        return client;
    }


    public static Retrofit getRetrofit() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm").create();
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(getClient())
                    .build();
        }
        return retrofit;
    }


}
