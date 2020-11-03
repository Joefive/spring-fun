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

##常用设计模式
###1.静态代理
静态代理：再不修改原有Service层代码的基础上，新增一个Proxy代理类，也实现Service接口，并横向增加自己的私有业务；
优点：耦合性降低，业务变更方便管理；
缺点：代码量翻倍，代理一个业务就需要从新实现一遍，效率低；

###2.动态代理：
动态代理：代理的角色一样，代理类是动态生成的，不是直接写好的
三种方式：1.JAVA原生的；2.基于类库cglib；3.字节码方式实现。
需要了解2个类Proxy,invocationHandler(调用处理程序)
动态代理类实现invocationHandler接口：1.设置代理接口；2.生成Proxy代理类；3.代理类的invoke方法来实现代理类操作；

