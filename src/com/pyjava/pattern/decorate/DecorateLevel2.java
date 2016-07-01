package com.pyjava.pattern.decorate;

/**
 *装饰类实现和被装饰类的一样的接口
 * 然后实现接口中的所有的方法,
 * 实现过程就是被包装类,作为装饰类的成员变量
 * 不需要包装的每一个实现的接口的方法,都调用被包装类的原来的方法.
 * 需要包装的方法,就在实现的函数体内,修改函数实现体.
 *
 * 缺点:每开发一个包装类,都需要把接口中的方法实现一遍,不需要包装的就调用原来的实现
 * 需要包装的就修改函数体.
 *
 *
 * 从而引进了适配器模式,
 * 适配器就是实现被包装类的接口,然后将被包装类作为自己的成员变量,实现接口中所有的方法(这一步和包装模式一样.)
 * 接下来,不和包装模式一样,需要包装的函数,不在适配器类中修改.
 * 而是专门在写一个类,继承适配器类,这样,只需要重写需要修改的方法,不需要的修改的方法,已经被继承.
 *这样,只需要在适配器中,实现一次接口就可以了.
 *
 * 更高深的为代理.
 * Created by wangheng on 16/6/30.
 */
public class DecorateLevel2 implements Rule {
    private BaseClass2 baseClass2=null;

    public DecorateLevel2(BaseClass2 baseClass2)
    {
        this.baseClass2 = baseClass2;
    }

    @Override
    public void sayHello() {
        System.out.println("现在装饰一下baseClass2");
        System.out.println("decorate say: hello word");
    }

    @Override
    public void sayHelloWorld()
    {
        this.baseClass2.sayHelloWorld();
    }
}

class BaseClass2 implements Rule
{
    @Override
    public void sayHello()
    {
        System.out.println("hello");
    }

    @Override
    public void sayHelloWorld() {

    }
}

interface Rule
{
    public void sayHello();
    public void sayHelloWorld();
}
