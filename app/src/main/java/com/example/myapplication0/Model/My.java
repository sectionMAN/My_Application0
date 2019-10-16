package com.example.myapplication0.Model;

public class My {
    private int id;
    private String url;
    private String photos;

    public My(String url, String photos) {
        this.url = url;
        this.photos = photos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getPhotos() {
        return photos;
    }

    public My() {
    }

    public My(int id, String url, String photos) {
        this.id = id;
        this.url = url;
        this.photos = photos;
    }
}
