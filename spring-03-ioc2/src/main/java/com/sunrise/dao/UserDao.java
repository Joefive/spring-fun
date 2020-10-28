package com.sunrise.dao;

public class UserDao {
    private String name;

    /*public UserDao() {
        System.out.println("UserDao无参构造方法执行了...!");
    }*/

    public UserDao(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show() {
        System.out.println("show方法执行：" + name);
    }
}
