package com.pyjava.pattern.decorate;

/**
 *被饰的类,作为装饰类的成员.
 * 然后重写被装饰的方法.
 * 这样,装饰类就装饰了原来类的功能.
 * Created by wangheng on 16/6/30.
 */
public class DecorateLevel1 {

    private BaseClass baseClass=null;

    public DecorateLevel1(BaseClass baseClass)
    {
        this.baseClass=baseClass;
    }
    public void sayHello()
    {
        baseClass.sayHello();
        System.out.println("现在装饰一下baseClass");
        System.out.println("decorate say: hello word");
    }


}
class BaseClass {
    public void sayHello()
    {
        System.out.println("baseClass say: hello");
    }

}
