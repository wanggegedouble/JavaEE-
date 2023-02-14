package com.wy;

import lombok.ToString;

@ToString
public class Student {
    private String name;
    private int num;

    public Student() {
    }

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
