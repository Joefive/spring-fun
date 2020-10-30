package com.sunrise.applogic;

/**
 * c标签测试类，测试构造器
 */
public class User {
    private String name;

    public User() {
        System.out.println("无参构造器执行成功。");
    }

    public User(String name) {
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
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
