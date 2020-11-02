package com.sunrise.config;

import com.sunrise.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类2，可以使用@Import注解进行融合
 */

//注册到容器中
@Configuration
//注册扫描包位置
@ComponentScan("com.sunrise.pojo")
public class UserConfig2 {
    //配置bean
    @Bean
    public User user2(){
        return new User();
    }
}
