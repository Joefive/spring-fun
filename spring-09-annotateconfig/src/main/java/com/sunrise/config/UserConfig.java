package com.sunrise.config;

import com.sunrise.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 完全脱离配置文件
 */

//注册到容器中
@Configuration
//注册扫描包位置
@ComponentScan("com.sunrise.pojo")
//由于bean可以能有多个，可以使用该注解进行融合
@Import(UserConfig2.class)
public class UserConfig {
    //配置bean
    @Bean
    public User user(){
        return new User();
    }
}
