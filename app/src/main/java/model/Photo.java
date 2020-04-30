package model;

public class Photo {
    private int id;
    private String path;

    public Photo(int id,String path) {
        this.id = id;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;

    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", path='" + path + '\'' +
                '}';
    }
}

