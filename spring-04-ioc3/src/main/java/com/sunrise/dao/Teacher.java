package com.sunrise.dao;

public class Teacher {
    private String tcName;
    private int tcCode;
    private int tcAge;

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName;
    }

    public int getTcCode() {
        return tcCode;
    }

    public void setTcCode(int tcCode) {
        this.tcCode = tcCode;
    }

    public int getTcAge() {
        return tcAge;
    }

    public void setTcAge(int tcAge) {
        this.tcAge = tcAge;
    }

    public void show() {
        System.out.println("教师编号：" + tcCode + " 教师姓名：" + tcName + " 教师年龄：" + tcAge);
    }
}
