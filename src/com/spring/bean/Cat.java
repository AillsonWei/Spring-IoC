package com.spring.bean;

import java.io.Serializable;

/**
 * Created by AillsonWei on 2016/3/15.
 */
public class Cat implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
