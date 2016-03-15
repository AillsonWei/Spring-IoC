package com.spring.test;

import com.spring.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by AillsonWei on 2016/3/15.
 */
public class TestCase {
    @Test
    public void test1(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(ac);

        //通过容器获得bean实例

        //1.使用构造器来创建bean实例
        HelloBean helloBean = ac.getBean("helloBean", HelloBean.class);
        String message  = helloBean.sayHello("魏俊");
        System.out.println(message);
        Calendar cal1 = ac.getBean("cal1", Calendar.class);
        System.out.println("构造器:" + cal1);

        //2.使用静态工厂方法来创建bean实例
        Calendar cal2 = ac.getBean("cal2", Calendar.class);
        System.out.println("静态工厂:" + cal2);

        //3.使用实例工厂方法来创建bean实例
        Date date1 = ac.getBean("date1",Date.class);
        System.out.println("实例工厂:" + date1);
    }

    @Test
    //1.DI(依赖注入)  --  set方法注入
    public void test2(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        Student stu1 = ac.getBean("stu1",Student.class);
        System.out.println("stu1:" + stu1);
    }

    @Test
    //2.DI(依赖注入)  --  构造器注入
    public void test3(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        Student stu2 = ac.getBean("stu2",Student.class);
        System.out.println("stu2:" + stu2);
    }

    @Test
    //3.DI(依赖注入)  --  自动装配
    public void test4(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        Student stu3 = ac.getBean("stu3",Student.class);
        System.out.println("stu3:" + stu3);
    }

    @Test
    //4.DI(注解方式依赖注入)  -- 组件扫描
    public void test5(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        SomeBean someBean = ac.getBean("sb",SomeBean.class);
        System.out.println("组建扫描：" + someBean);
    }

    @Test
    //作用域
    public void test6(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        SomeBean someBean = ac.getBean("sb",SomeBean.class);
        SomeBean someBean2 = ac.getBean("sb",SomeBean.class);
        System.out.println(someBean == someBean2);
    }

    @Test
    //生命周期回调方法
    public void test7(){
        //启动spring容器
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        SomeBean sb = ac.getBean("sb",SomeBean.class);
        System.out.println(sb);
        ac.close();
    }

    @Test
    //注入集合
    public void test8(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        MessageBean mb1 = ac.getBean("mb1",MessageBean.class);
        mb1.showInfo();
    }

    @Test
    //注入集合(将集合当作一个bean来配置)
    public void test9(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        MessageBean mb2 = ac.getBean("mb2",MessageBean.class);
        mb2.showInfo();
    }

    @Test
    //使用spring表达式来注入相应的值
    public void test10(){
        //启动spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获得bean实例
        DemoBean demoBean = ac.getBean("demoBean",DemoBean.class);
        System.out.println(demoBean);
    }
}
