package com.sunrise.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/** 实现自动装配的三种方法：【第二种最常用】
 * 1.在bean.xml中注入对象增加autowired属性来自动注入byName，byType两种方式
 * 2.可使用Autowired可以进行自动注入，使用byType方式，可省略set方法，@nullable可以让该属性为空，required设置为空
 * 如果配置文件中有多个相同类型的对象，需要使用Qualifier注解来制定bean.xml中的唯一对象
 * 3.可以使用java自带注解@Resource来进行注解，可以先通过名字，如果找不到自动通过类型
 */
public class People {
    @Autowired(required = false)
    @Qualifier(value = "dog11")
    private Dog dog;
    @Autowired
    private Cat cat;
    private String name;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog2=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
