package com.spring.bean;

import java.io.Serializable;

/**
 * Created by AillsonWei on 2016/3/15.
 */
public class MobilePhone implements Serializable {
    private String name;    //型号
    private String cpu;     //CPU
    private String ram;     //内存
    private Double prize;   //价格

    //生成带参构造函数
    public MobilePhone(String name, String cpu, String ram, Double prize) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", prize='" + prize + '\'' +
                '}';
    }
}
