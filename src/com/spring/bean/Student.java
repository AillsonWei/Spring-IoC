package com.spring.bean;

import java.io.Serializable;

/**
 * Created by AillsonWei on 2016/3/15.
 */
public class Student implements Serializable {

    private Computer computer;
    private MobilePhone phone;

    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public MobilePhone getPhone() {
        return phone;
    }
    public void setPhone(MobilePhone phone) {
        this.phone = phone;
    }
    public Student() {
    }
    public Student(Computer computer, MobilePhone phone) {
        this.computer = computer;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Student's info:"
                + computer + " " + phone;
    }

}
