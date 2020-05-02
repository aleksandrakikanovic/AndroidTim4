package model;

import java.util.Date;

public class Attachment {
    private int id;
    private Date date;
    private String type;
    private String name;

    public Attachment(int id,Date date,String type,String name){
        this.id = id;
        this.date = date;
        this.type = type;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
                ", date=" + date +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
