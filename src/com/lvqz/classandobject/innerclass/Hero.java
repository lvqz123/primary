package com.lvqz.classandobject.innerclass;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 11:24
 * 非静态内部类，非静态内部类可以直接在一个类里面定义
 * 比如：
 *    战斗成绩只有在一个英雄对象存在的时候才有意义
 *    所以实例化BattleScore的时候，必须建立一个存在的英雄的基础上
 *    语法：new 外部类().new 内部类()
 *    作为Hero的非静态内部类，是可以直接访问外部类的private实例属性name的
 */
public class Hero {

     private String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    class BattleScore{

        int kill;
        int die;
        int assit;

        public void legendary(){

            if(kill >= 8){
                System.out.println(name + "超神");
            }else {
                System.out.println(name+"还未超神，加加劲啊");
            }

        }

    }

    public static void main(String [] args){

        Hero garden = new Hero();
        garden.name = "盖伦";
        //实例化内部类
        //BattleScore对象只有在一个英雄对象存在的时候才有意义
        //所以其实例化必须建立在一个外部类对象的基础之上
        BattleScore battleScore = garden.new BattleScore();
        battleScore.kill = 9;
        battleScore.legendary();


    }





}
