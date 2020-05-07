package com.lvqz.classandobject.abstractdemo;

/**
 * @author: lvqz
 * @date: 2020/5/6
 * @time: 11:05
 */
public class Test {

    public static void main(String [] args){
        Son son = new Son();
        son.dosometing();
        Father father = new Son();
        father.dosometing();
        Father father1 = new Father() {
            @Override
            protected void dosometing() {
                super.dosometing();
            }
        };
        father1.dosometing();
    }
}
