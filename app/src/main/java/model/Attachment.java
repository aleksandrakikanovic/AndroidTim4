package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Base64;
import java.util.Date;

public class Attachment implements Serializable {
    @SerializedName("attachment_id")
    private int attachment_id;

    @SerializedName("data")
    private String data;

    @SerializedName("mime_type")
    private String mime_type;

    @SerializedName("name")
    private String name;

    public Attachment(int attachment_id,String data,String mime_type,String name){
        this.attachment_id = attachment_id;
        this.data = data;
        this.mime_type = mime_type;
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAttachment_id() {
        return attachment_id;
    }

    public void setAttachment_id(int attachment_id) {
        this.attachment_id = attachment_id;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + attachment_id +
                ", data=" + data +
                ", type='" + mime_type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
