package com.lvqz.classandobject.objectdemo;

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

    public Hero(){

    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Hero){
            Hero hero = (Hero) obj;
            return this.hp == hero.hp;
        }
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("正在被回收。。。");
    }

    @Override
    public String toString() {
        return name + hp;
    }

    public static void main(String [] args){

        Hero h1 = new Hero("gailun",20);
        Hero h4 = new Hero("gailun",20);
        Hero h2 = new Hero("hanbing",10);
        Hero h3;


        System.out.println(h1.toString());
        System.out.println(h2.toString());

        for (int i = 0; i <1000000 ; i++) {
            h3 = new Hero();
        }

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h4));

    }
}
