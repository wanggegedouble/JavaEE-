package com.wy;

public class App{
    public static void main(String[] args) {
        Ioc ioc = new Ioc();
        ioc.setStudent(new Student("wy",12));
        ioc.test01();
    }
}
