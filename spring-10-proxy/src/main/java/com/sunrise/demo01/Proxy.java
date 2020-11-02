package com.sunrise.demo01;

/**
 * 代理模式
 * 房客要租房子，不用找房东，直接找中介，中介代理了房东要出租房子的方法，另外增加一些中介私有操作
 * 1.接口；2.真实角色；3.代理角色；4.客户端访问代理角色
 */
public class Proxy implements Rent {
    //实例化房东
    Host host = new Host();
    //无参数构造器
    public Proxy() {
    }

    //有参构造器中直接将房东对象丢入
    public Proxy(Host host) {
        this.host = host;
    }

    //实现租房接口并增加自己私有方法
    public void rent() {
        seeHost();
        host.rent();
        contract();
        agencyFee();
    }

    //代理的私有操作，私有方法
    public void seeHost() {
        System.out.println("1.中介带你去看房");
    }

    public void contract() {
        System.out.println("2.与中介签订合同");
    }

    public void agencyFee() {
        System.out.println("3.中介收取中介费用");
    }
}
