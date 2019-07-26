package com.allifinance.classandobject.conceal;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 16:37
 */
public class ADHero extends Hero {

    public void physicAttack(){

        System.out.println("发动物理攻击");
    }

    /**
     * 和重写了类似，但是是类方法，没有重写的注解。 所以称之为隐藏
     */
    public static void battleWin(){
        System.out.println("子类的方法");
    }

    public static void main(String [] args){

        Hero.battleWin();

        ADHero.battleWin();

    }
}
