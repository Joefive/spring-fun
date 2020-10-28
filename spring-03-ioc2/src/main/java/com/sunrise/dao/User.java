package com.sunrise.dao;

/**
 * 测试spring加载的时候，配置文件中的bean是否被实例化
 */
public class User {
    public User() {
        System.out.println("User构造器执行，User已被实例化");
    }
}
