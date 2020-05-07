package com.lvqz.classandobject.construction;

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

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
        System.out.println("这是被调用的参数方法");
    }

    public Hero(String name, float hp, float armor, int moveSpeed) {

        this(name,hp);

        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;

        System.out.println("这是两个参数的构造方法");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String [] args){

        Hero hero = new Hero("gailun",10,20,30);
        Hero hero1 = new Hero("gailun",10);



    }

}
