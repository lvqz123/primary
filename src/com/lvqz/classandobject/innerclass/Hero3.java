package com.lvqz.classandobject.innerclass;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 11:24
 *
 * 本地类可以理解为有名字的匿名类
 * 内部类与匿名类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。
 * 本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方
 */
public abstract class Hero3 {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public abstract void attack();

    public static void main(String [] args){

        //与匿名类区别的地方在于，本地类有自己自定义的类名
        class SomeHero extends Hero3{
            @Override
            public void attack() {
                System.out.println(name + "新的进攻手段");
            }
        }

        SomeHero someHero = new SomeHero();
        someHero.name = "瑞兹";
        someHero.attack();

    }





}
