package com.spring.bean;

import java.io.Serializable;

/**
 * Created by AillsonWei on 2016/3/15.
 */
public class DemoBean implements Serializable {
    private String name;
    private String pageSize;
    private String score;
    private String language;

    @Override
    public String toString() {
        return "DemoBean{" +
                "name='" + name + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", score='" + score + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPageSize() {
        return pageSize;
    }
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}

