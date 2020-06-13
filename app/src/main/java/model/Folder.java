package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Folder implements Serializable {

    @SerializedName("folder_id")
    private int folder_id;

    @SerializedName("foldername")
    private String foldername;

    @SerializedName("account")
    private String account;

    public Folder(int folder_id, String foldername, String account) {
        this.folder_id = folder_id;
        this.foldername = foldername;
        this.account=account;
    }
    public Folder(String foldername, String account){
        this.foldername=foldername;
        this.account=account;

    }

    public int getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(int folder_id) {
        this.folder_id = folder_id;
    }

    public String getFolder_name() {
        return foldername;
    }

    public void setName(String foldername) {
        this.foldername = foldername;
    }

    public void setFoldername(String foldername) {
        this.foldername = foldername;
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
                foldername
                ;
    }
}

