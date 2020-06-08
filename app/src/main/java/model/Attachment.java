package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Base64;
import java.util.Date;

public class Attachment implements Serializable {
    @SerializedName("id")
    private int id;

    @SerializedName("data")
    private Base64 data;

    @SerializedName("type")
    private String type;

    @SerializedName("name")
    private String name;

    public Attachment(int id,Base64 data,String type,String name){
        this.id = id;
        this.data = data;
        this.type = type;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Base64 getData() {
        return data;
    }

    public void setData(Base64 data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + id +
                ", data=" + data +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
