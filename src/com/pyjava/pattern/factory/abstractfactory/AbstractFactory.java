package com.pyjava.pattern.factory.abstractfactory;

import java.util.HashMap;
import java.util.Map;

/**
 *抽象工厂模式 (工厂模式)leve3
 *
 * [what]
 * 通过反射,获取客户需要的工具对象实例
 * [how]
 * 获取对象的类名,反射出实例
 * [why]
 * 工厂模式的最高境界.
 *
 * Created by wangheng on 16/7/1.
 */
public class AbstractFactory {

    private static AbstractFactory instacnce=new AbstractFactory();
    private AbstractFactory() {}
    public static AbstractFactory getInstance()
    {
        return AbstractFactory.instacnce;
    }

    private static Map<String,String> toolMap=new HashMap<String,String>();

    static
    {
        toolMap.put("add98","com.pyjava.pattern.factory.abstractfactory.Add98Tool");
    }

    public Object createTool(String toolName) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String toolClassName=AbstractFactory.toolMap.get(toolName);
        Class clazz =Class.forName(toolClassName);
        Object obj=null;
        obj= clazz.newInstance();
        return obj;
    }




}

class Add98Tool
{
    public void add98()
    {
        System.out.println("add 98");
    }
}
