package com.allifinance.classandobject.typecast;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 16:39
 * 向下转型
 */
public class Test {

    public static void main(String [] args){


        /**
         * h引用的引用类型是Hero, 对象类型是Hero  所以h引用指向Hero对象类型
         */
        Hero h  = new Hero();
        Hero h1 = new ADHero();
        /**
         * ad引用的引用类型是ADHero, 对象类型是ADHero  所以ad引用指向ADHero对象类型
         */
        ADHero ad = new ADHero();
        /**
         * s引用的引用类型是Support, 对象类型是Support  所以s引用指向Support对象类型
         */
        Support s = new Support();

        //这里是h引用指向ad引用， ad引用指向的是ADHero对象类型， 所以 h引用指向的也是ADHero对象类型
        h = ad ;
        //这里并不知道h引用类型指向的是什么对象类型，因为他有两个子类，所以，需要进行强制转换才可以（并且必须前面h的引用已经指向ADHero对象类型，否则会报类型转换异常）
        ad = (ADHero) h;
        ad.physicAttack();

        //如果Hero的引用直接指向ADHero的对象类型，那直接调用ADHero对象类型的方法也是需要进行强转的.
        ((ADHero) h1).physicAttack();


        //这里是h引用指向s引用， s引用指向的是Support对象类型， 所以 h引用指向的也是Support对象类型
        h = s;
        //这里进行强制类型转换，使得h的对象类型转换为ADHero 但是32行其实已经将h引用指向了Support对象类型，Support对象类型和ADHero对象类型不是相互继承状态，所以运行会报错
        s = (Support) h;
        s.heal();




    }
}
