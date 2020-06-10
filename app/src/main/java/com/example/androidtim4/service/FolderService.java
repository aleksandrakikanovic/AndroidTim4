package com.example.androidtim4.service;

import android.widget.Toast;

import com.example.androidtim4.CreateFolderActivity;
import com.example.androidtim4.serviceInterface.FolderInterface;

import model.Folder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FolderService {

    public static FolderInterface folderInterface = ServiceUtil.getRetrofit().create(FolderInterface.class);

    public static void addFolder(String name){ //dodati logged in account name
        Folder folder = new Folder(name, "osa.test.aleksandra@gmail.com");
        Call<Folder> call1 = folderInterface.createFolder(folder);
        call1.enqueue(new Callback<Folder>() {
            @Override
            public void onResponse(Call<Folder> call, Response<Folder> response) {
                Folder folder1 = response.body();
                Toast.makeText(CreateFolderActivity.context,"Folder created", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<Folder> call, Throwable t) {
                call.cancel();
            }
        });
    }

}
