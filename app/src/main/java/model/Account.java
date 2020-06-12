package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Account implements Serializable {

    @SerializedName("account_id")
    private int account_id;

    @SerializedName("smtpAddress")
    private String smtpAddress;

    @SerializedName("pop3")
    private String pop3;

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    public Account(int account_id,String smtpAddress,String pop3,String username,String password){
        this.account_id = account_id;
        this.smtpAddress = smtpAddress;
        this.pop3 = pop3;
        this.username = username;
        this.password = password;
    }
    public Account(String smtpAddress,String pop3,String username,String password){
        this.account_id = account_id;
        this.smtpAddress = smtpAddress;
        this.pop3 = pop3;
        this.username = username;
        this.password = password;
    }
    public Account(String username, String password){
        this.password=password;
        this.username=username;
    }
    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getSmtpAddress() {
        return smtpAddress;
    }

    public void setSmtpAddress(String smtpAddress) {
        this.smtpAddress = smtpAddress;
    }

    public String getPop3() {
        return pop3;
    }

    public void setPop3(String pop3) {
        this.pop3 = pop3;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                ", smtp='" + smtpAddress + '\'' +
                ", pop3='" + pop3 + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
