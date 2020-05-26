package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Contact implements Serializable {

    @SerializedName("id")
    private int id;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("displayName")
    private String displayName;

    @SerializedName("email")
    private String email;

    @SerializedName("format")
    private String format;

    public Contact(int id, String firstName, String lastName, String displayName, String email, String format) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.email = email;
        this.format = format;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
                displayName + "\n" +
                firstName +  lastName + "\n" +
                 "email: " + email
                ;
    }
}
