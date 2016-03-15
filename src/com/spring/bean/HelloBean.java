package com.spring.bean;

import java.io.Serializable;

/**
 * Created by AillsonWei on 2016/3/14.
 */
public class HelloBean implements Serializable{
    public HelloBean(){
        System.out.println("HelloBean's constructor...");
    }
    public String sayHello(String name){
        return "Hello " + name +"!";
    }
}
