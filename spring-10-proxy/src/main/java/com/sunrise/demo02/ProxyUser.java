package com.sunrise.demo02;

/**
 * 静态代理
 */
public class ProxyUser implements UserService {
    private UserServiceImpl userService;
    //使用set方法将Impl对象注入
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void insert() {
        log("insert");
        userService.insert();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void select() {
        log("select");
        userService.select();
    }

    /**
     * 增加日志方法
     */
    public void log(String msg){
        System.out.println("[LOG：] 调用了"+msg+"方法打印了日志***");
    }
}
