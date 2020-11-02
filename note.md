##常用依赖
```xml
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.9.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
```
##Spring官方配置文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <!--开启自动注解支持-->
    <context:annotation-config/>

</beans>
```
##Spring配置文件管理的最佳实践
1.xml来管理bean。
2.注解来管理注入属性。

##常用注解
@Autowired：自动装配，默认使用byType方式进行注入(先通过类型再使用名字)，可以配合@Qualifier注解来制定bean.xml中的唯一对象比较常用；

@Resource：Java自带注解，默认使用byName方式注入(先通过名字再通过类型)，可以用使用name属性来指定，也可以实现自动装配，但是效率稍微差一点点；

@Component：组件注解，增加后说明该类已被Spring管理，变成了bean，相当于配置文件中配置；@Value注解可以来设置对应属性值；@Scope可以来配置作用域，singleton单例模式、原形模式prototype；

@ComponentScan("com.sunrise.pojo")，注册扫描包的位置；

@Import(UserConfig2.class)，合并配置文件；

@Bean相当于再xml中配置bean，使用注解方式；

