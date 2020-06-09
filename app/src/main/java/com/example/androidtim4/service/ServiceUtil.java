package com.example.androidtim4.service;

import com.example.androidtim4.serviceInterface.FolderInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceUtil {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://primer.com";

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    public static FolderInterface reviewerService = retrofit.create(FolderInterface.class);


}
