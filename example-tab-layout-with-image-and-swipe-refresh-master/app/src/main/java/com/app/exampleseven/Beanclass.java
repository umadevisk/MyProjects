package com.app.exampleseven;

/**
 * Created by umadevi.sk on 7/17/2017.
 */
public class Beanclass {

    private int image;
    private String title;
    private String desc;
    private  String date;


    public Beanclass(int image,String title, String desc, String date) {
        this.title = title;
        this.image = image;
        this.desc = desc;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
