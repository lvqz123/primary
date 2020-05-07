package com.lvqz.classandobject.finaldemo;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 11:24
 * 关于final修饰符的作用
 */
public class Hero{

    //final用来修饰常量，常量是可以直接访问的、不可改变的值
    public static final int ITEMTOTALNUMBER = 6;//物品栏的数量

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

    public static void main(String [] args){

        final float hp; //被final修饰的变量，只能被赋值一次

        hp = 5;
        System.out.println("hp = " + hp);
        /*hp = 6;
        System.out.println("hp = " + hp);*/


        final Hero h ; //final修饰的引用，只有一次指向对象的机会
        h = new Hero();
//        h = new Hero();


    }



}
