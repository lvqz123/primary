package com.allifinance.classandobject.initialize;

/**
 * @author: lvqz
 * @date: 2019/7/26
 * @time: 14:52
 * ��֤һ�¸�����ʼ�����Ⱥ�˳��
 */
public class Hero {

    public String name = "some hero";  //3

/*    public Hero(){
        name = "one hero";  //1
    }*/
/*    {
        name = "the hero";  // ��̬��ʼ����  2
    }*/
    
    public static void main(String [] args){

        Hero hero = new Hero();
        System.out.println("hero.name = " + hero.name);

    }

}
