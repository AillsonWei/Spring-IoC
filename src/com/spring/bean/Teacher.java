package com.spring.bean;

import java.io.Serializable;

/**
 * Created by AillsonWei on 2016/3/15.
 */
public class Teacher implements Serializable{
    private String name;
    private Cat cat;
    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
