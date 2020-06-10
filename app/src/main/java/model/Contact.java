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

    public Contact(int contact_id, String firstname, String lastname, String displayname, String email, String format) {
        this.contact_id = contact_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.displayname = displayname;
        this.email = email;
        this.format = format;

    }

    public Contact(String firstname, String lastname, String displayname, String email, String format){
        this.firstname = firstname;
        this.lastname = lastname;
        this.displayname = displayname;
        this.email = email;
        this.format = format;
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

    @Override
    public String toString() {
        return
                displayname + "\n" +
                firstname +  lastname + "\n" +
                 "email: " + email
                ;
    }
}
