package com.sunrise.pojo;


import com.sunrise.config.UserConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User extends UserConfig {
    private String name;


    public String getName() {
        return name;
    }
    @Value("张三")
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
