package com.pyjava.pattern.factory.factorymethod;

/**
 * 工厂方法模式  工厂模式leve2
 *[what]
 * 具体的工具由具体的工厂创建,保证工厂的单一性,专一性
 * [how]
 * 定义一个工厂接口,有创建工具的抽象方法.
 *每一个工具,都编写一个具体的工厂,该工厂实现创建工具的的方法,new 一个工具对象
 * 可以保证该工厂是单例模式的.
 * [why]
 * 权利下方,不再简单工厂中修改代码了,客户端制定具体的工厂,生产指定的工具.
 *
 *
 * 优点:保证工厂是可扩展的.
 * 缺点:每一个工具,都需要实现一个具体的工厂,造成对象的增长变大.
 * 每生产一个工具的时候,都需要配套一个工厂,造成资源浪费(内存中有多个工具对象和相对应的工厂对象)
 *
 *
 * Created by wangheng on 16/7/1.
 */
public class FactoryMethod
{

public static void main(String srgs[])
{
 Factory factory=Factory98Tool.getInstance();
    Add98tool add98tool= (Add98tool) factory.createTool();
    add98tool.add98();

}

}

//工厂协议
interface Factory
{
    public Object createTool();
}

//具体工厂实现类
class Factory98Tool implements  Factory

{
    private static Factory98Tool instance =new Factory98Tool();


    private Factory98Tool() {
    }

    public static Factory98Tool getInstance()
    {
        return Factory98Tool.instance;
    }

    @Override
    public Object createTool() {

        return new Add98tool();


    }
}
class Add98tool
{
    public void add98()
    {
        System.out.println("add 98");
    }
}
