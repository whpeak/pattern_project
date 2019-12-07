package pattern.listener;

/**
 * 监听器模式
 * (1)定义一个监听器接口(然后实现该接口)
 * (2)成员变量接受一个监听器
 * (3)提高注释监听器的方法
 * (4)在调用方法的同时,调用监听器(并把本对象传递过去)(传输工具封装一个object父类对象)
 * 在监听器实现类中,可以执行各种操作,(禁止调用被监听的方法,防止无限循环)
 * Created by wangheng on 16/7/5.
 */
public class Person {
    private PersonEatListener personEatListener=null;
    public void eat()
    {
        if(null!=personEatListener)
        {
            personEatListener.preEat(new Event(this));
        }
        System.out.println("吃东西");
    }

    public void drink()
    {
        System.out.println("先喝点东西");
    }
    public void addPersonEatListener(PersonEatListener personEatListener)
    {
       this.personEatListener=personEatListener;
    }
}
