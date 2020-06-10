package model;

import java.io.Serializable;
import java.util.Date;
import com.google.gson.annotations.SerializedName;

public class Message implements Serializable {

    @SerializedName("message_id")
    private int message_id;

    @SerializedName("from")
    private String from;

    @SerializedName("to")
    private String to;

    @SerializedName("cc")
    private String cc;

    @SerializedName("bcc")
    private String bcc;

    @SerializedName("dateTime")
    private Date dateTime;

    @SerializedName("subject")
    private String subject;

    @SerializedName("content")
    private String content;

    public Message(int message_id,String from,String to,String cc,String bcc, Date dateTime, String subject,String content) {
        this.message_id = message_id;
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.dateTime = dateTime;
        this.subject = subject;
        this.content = content;
    }
    public Message(String from,String to,String cc,String bcc, String subject,String content) {
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.subject = subject;
        this.content = content;
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return
               "from: " + from + "\n" + dateTime + "\n" + "subject: " + subject  + "\n" +  "content: " + content;

    }


}

