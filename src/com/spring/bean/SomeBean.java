package com.spring.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

/**
 * Created by AillsonWei on 2016/3/15.
 */
@Component("sb")
@Scope("singleton")
@Lazy(true)
public class SomeBean implements Serializable {

    //构造方法
    public SomeBean() {
        System.out.println("SomeBean's constructor...");
    }

    @PostConstruct
    //初始化方法
    public void init(){
        System.out.println("SomeBean's init...");
    }

    @PreDestroy
    //销毁方法
    public void destroy(){
        System.out.println("SomeBean's destroy...");
    }

}
