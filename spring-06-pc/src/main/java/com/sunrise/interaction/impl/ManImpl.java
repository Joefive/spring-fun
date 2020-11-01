package com.sunrise.interaction.impl;

import com.sunrise.applogic.ManAo;
import com.sunrise.interaction.ManIA;

public class ManImpl implements ManIA {

    //实例化Ao业务实现类对象
    private ManAo manAo;

    //增加get与set注入方法
    public ManAo getManAo() {
        return manAo;
    }

    public void setManAo(ManAo manAo) {
        this.manAo = manAo;
    }

    public void say() {
        manAo.say();
    }

    public void make() {
        manAo.make();
    }

}
