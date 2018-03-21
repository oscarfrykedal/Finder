package com.example.oscar.finder;

/**
 * Created by oscar on 2018-03-19.
 */
public class Item {
    private String name;
    private int num;
    private int address;

    public Item() {
    }

    public Item(String name, int num, int address) {
        this.name = name;
        this.num = num;
        this.address = address;
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

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
