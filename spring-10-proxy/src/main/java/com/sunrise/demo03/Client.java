package com.sunrise.demo03;

public class Client {
    public static void main(String[] args) {
        //真是角色
        Host host = new Host();
        //代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //1.设置代理对象
        pih.setRent(host);
        //2.动态生成代理类
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
