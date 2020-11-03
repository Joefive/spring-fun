package com.sunrise.demo02;

/**
 * 业务实现类
 */
public class UserServiceImpl implements UserService {
    public void insert() {
        System.out.println("1.插入了一条数据！");
    }

    public void delete() {
        System.out.println("2.删除了一条数据！");
    }

    public void update() {
        System.out.println("3.修改了一条数据！");
    }

    public void select() {
        System.out.println("4.查询了一条数据！");
    }
}
