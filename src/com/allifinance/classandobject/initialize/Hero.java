package com.allifinance.classandobject.initialize;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 14:52
 * 验证一下各个初始化的先后顺序
 */
public class Hero {

    public String name = "some hero";  //3

/*    public Hero(){
        name = "one hero";  //1
    }*/
/*    {
        name = "the hero";  // 静态初始化块  2
    }*/
    
    public static void main(String [] args){

        Hero hero = new Hero();
        System.out.println("hero.name = " + hero.name);

    }

}
