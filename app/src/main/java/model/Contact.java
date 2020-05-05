package model;

import java.io.Serializable;

public class Contact implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String displayName;
    private String email;
    private EnumFormat format;

    public Contact(int id, String firstName, String lastName, String displayName, String email, EnumFormat format) {
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

    public EnumFormat getFormat() {
        return format;
    }

    public void setFormat(EnumFormat format) {
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
