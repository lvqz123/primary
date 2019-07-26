package com.allifinance.classandobject.overloading;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 11:24
 * 英雄类
 */
public class Hero {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
