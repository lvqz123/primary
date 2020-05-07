package com.lvqz.classandobject.typecast;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 11:26
 */
public class Support extends Hero {

    public void heal(){
        System.out.println("辅助英雄进行了治疗");
    }

    public void heal(Hero hero){
        System.out.println(name + "治疗了" + hero.getName());
    }


    public void heal(Hero hero,int hp){
        System.out.println(name + "治疗了" + hero.getName() + hp + "点生命值");
    }

    public  void heal(Hero ...heroes){

        for (int i = 0; i < heroes.length; i++) {

            System.out.println(name + "治疗了" + heroes[i].getName());


        }

    }


    public static void main(String [] args){

        Support support = new Support();
        support.setName("众星之子");

        Hero hero = new Hero();
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();
        Hero hero3 = new Hero();
        Hero hero4 = new Hero();

        hero.setName("盖伦");
        hero1.setName("盖伦1");
        hero2.setName("盖伦2");
        hero3.setName("盖伦3");
        hero4.setName("盖伦4");

        support.heal(hero);

        support.heal(hero,10);

        support.heal(hero,hero1,hero2,hero3,hero4);


    }

}
