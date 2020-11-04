package com.sunrise.diy;

/**
 * 方式二：自定义切面类来实现AOP
 */
public class Diy {
    public void before(){
        System.out.println("=========执行前==========");
    }

    public void after(){
        System.out.println("=========执行后==========");
    }
}
