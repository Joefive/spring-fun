package com.sunrise.service;

import com.sunrise.dao.UserDao;

/** 控制反转IOC
 * 用户需要通过service层来调用Dao层，解耦思想
 * 使用多态，new出一个新的Dao对象
 * 问题：如果需求变更(使用mysqlDao)，需要修改service层代码
 * 解决：利用set注入，需要什么类型Dao在set方法中传入类型即可
 */
public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();
    //private  UserDao userDao = new UserMysqlImpl();
    private UserDao userDao;
    //利用set方法进行注入来解决需求变更问题
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
