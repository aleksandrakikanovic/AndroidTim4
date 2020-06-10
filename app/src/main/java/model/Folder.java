package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Folder implements Serializable {

    @SerializedName("folder_id")
    private int folder_id;

    @SerializedName("folder_name")
    private String folder_name;

    @SerializedName("account")
    private String account;

    public Folder(int folder_id, String folder_name, String account) {
        this.folder_id = folder_id;
        this.folder_name = folder_name;
        this.account=account;
    }
    public Folder(String folder_name, String account){
        this.folder_name=folder_name;
        this.account=account;

    }

    public int getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(int folder_id) {
        this.folder_id = folder_id;
    }

    public String getFolder_name() {
        return folder_name;
    }

    public void setName(String folder_name) {
        this.folder_name = folder_name;
    }

    public void setFolder_name(String folder_name) {
        this.folder_name = folder_name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return
                folder_name
                ;
    }
}

