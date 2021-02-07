package com.example.androidtim4.service;

import android.icu.text.CaseMap;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.androidtim4.CreateFolderActivity;
import com.example.androidtim4.EmailsActivity;
import com.example.androidtim4.FolderActivity;
import com.example.androidtim4.FoldersActivity;
import com.example.androidtim4.LoginActivity;
import com.example.androidtim4.UserAccountsActivity;
import com.example.androidtim4.serviceInterface.FolderInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import model.Folder;
import model.Message;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.androidtim4.service.MessageService.messages;

public class FolderService {

    public static FolderInterface folderInterface = ServiceUtil.getRetrofit().create(FolderInterface.class);
    public static List<Folder> folders = new ArrayList<Folder>();
    public static boolean deleted = false;
    public static int folderid;

    public static void addFolder(String name) {
        Folder folder = new Folder(name, LoginActivity.loggedInUserUsername);
        Call<Folder> call1 = folderInterface.createFolder(folder);
        call1.enqueue(new Callback<Folder>() {
            @Override
            public void onResponse(Call<Folder> call, Response<Folder> response) {
                Folder folder1 = response.body();
                Toast.makeText(CreateFolderActivity.context, "Folder created", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Folder> call, Throwable t) {
                call.cancel();
            }
        });
    }

    public static List<Folder> getAllFolders() {
        Call<List<Folder>> call = folderInterface.getFolders(UserAccountsActivity.loggedInAccountName);
        call.enqueue(new Callback<List<Folder>>() {
            @Override
            public void onResponse(Call<List<Folder>> call, Response<List<Folder>> response) {
                folders = response.body();
                Log.d("TAG", "Response = " + folders);
                FoldersActivity.recyclerView.setAdapter(FoldersActivity.folderAdapter);
                FoldersActivity.folderAdapter.setFolderList(folders);
            }

            @Override
            public void onFailure(Call<List<Folder>> call, Throwable t) {
                Log.d("TAG", "Response = " + t.toString());
            }
        });
        return folders;
    }

    public static List<Message> getFolderMess(int folder_id) {

        Call<List<Message>> call = folderInterface.getFolderMess(folder_id);
        call.enqueue(new Callback<List<Message>>() {
            @Override
            public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                messages = response.body();
                System.out.println("******** -> " + response.code());
                Log.d("TAG", "Response = " + messages);
                FolderActivity.recyclerView.setAdapter(FolderActivity.emailAdapter);
                FolderActivity.emailAdapter.setMessageList(messages);
            }

            @Override
            public void onFailure(Call<List<Message>> call, Throwable t) {
                Log.d("TAG", "Response = " + t.toString());
            }
        });
        return messages;
    }
        public static boolean deleteFolder (int id){
            Call<Boolean> call1 = folderInterface.deleteFolder(id);
            call1.enqueue(new Callback<Boolean>() {
                @Override
                public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                    deleted = response.body();
                    Toast.makeText(CreateFolderActivity.context, "Folder created", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<Boolean> call, Throwable t) {
                    call.cancel();
                }
            });
            return deleted;
        }


    }
