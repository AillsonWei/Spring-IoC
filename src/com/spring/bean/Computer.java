package com.spring.bean;

import java.io.Serializable;

/**
 * Created by AillsonWei on 2016/3/15.
 */
public class Computer implements Serializable{
    private String name;                     //型号
    private String mainboard;               //主板
    private String cpu;                      //CPU中央处理器
    private Double price;                   //价格

    //生成setter和getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", price=" + price +
                '}';
    }
}
