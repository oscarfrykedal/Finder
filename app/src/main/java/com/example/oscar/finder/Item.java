package com.example.oscar.finder;

/**
 * Created by oscar on 2018-03-19.
 */
public class Item {
    private String name;
    private int num;
    private String address;
    private String url;
    private String id;

    public Item() {
    }

    public Item(String name, int num, String address, String url, String id) {
        this.name = name;
        this.num = num;
        this.address = address;
        this.url = url;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
