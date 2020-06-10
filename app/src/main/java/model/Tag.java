package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Tag implements Serializable {
    @SerializedName("tag_id")
    private int tag_id;
    @SerializedName("name")
    private String name;

    public Tag(int tag_id, String name) {
        this.tag_id = tag_id;
        this.name = name;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + tag_id +
                ", name='" + name + '\'' +
                '}';
    }
}
