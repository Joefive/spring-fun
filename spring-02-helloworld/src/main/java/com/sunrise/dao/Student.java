package com.sunrise.dao;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(String name,int age){
        System.out.println("姓名: "+name+" 年龄："+age);
    }
}
