package com.example.rzmorales.notification_app_hw_zaratemorales_robert;

public class ModelClass {
    private int picture;
    private String text;

    public ModelClass(int picture, String text) {
        this.picture = picture;
        this.text=text;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getPicture() {

        return picture;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

