package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Contact implements Serializable {

    @SerializedName("contact_id")
    private int contact_id;

    @SerializedName("firstname")
    private String firstname;

    @SerializedName("lastname")
    private String lastname;

    @SerializedName("displayname")
    private String displayname;

    @SerializedName("email")
    private String email;

    @SerializedName("format")
    private String format;

    @SerializedName("path")
    private String path;

    @SerializedName("user")
    private String user;

    @SerializedName("note")
    private String note;

    public Contact(int contact_id, String firstname, String lastname, String displayname, String email, String format, String path, String user,String note) {
        this.contact_id = contact_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.displayname = displayname;
        this.email = email;
        this.format = format;
        this.path = path;
        this.user = user;

    }

    public Contact(String displayname, String email, String firstname, String lastname, String note, String path, String user){
        this.displayname = displayname;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.note = note;
        this.path = path;
        this.user = user;


    }

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return
                displayname
                ;
    }
}
