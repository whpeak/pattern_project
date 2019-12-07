package com.pyjava.pattern.decorate;

/**
 * Created by wangheng on 16/6/30.
 */
public class TestDecorate {
    public static void main(String args[])
    {
        DecorateLevel1 decorate =new DecorateLevel1(new BaseClass());
        decorate.sayHello();
        System.out.println("-------------------------------------");
        DecorateLevel2 decorateLevel2=new DecorateLevel2(new BaseClass2());
        decorateLevel2.sayHello();
        decorateLevel2.sayHelloWorld();

    }
}
