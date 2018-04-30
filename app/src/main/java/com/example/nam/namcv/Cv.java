package com.example.nam.namcv;

import java.io.Serializable;

public class Cv implements Serializable{

    private String title;
    private int imgs;

    public Cv(String title, int imgs) {
        this.title = title;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgs() {
        return imgs;
    }

    public void setImgs(int imgs) {
        this.imgs = imgs;
    }
}
