package com.pyjava.pattern.proxy.interface_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wangheng on 16/7/2.
 */
public class ProxyFactory {
    private Object obj=null;
    private static ProxyFactory instance =new ProxyFactory();
    private ProxyFactory() {}
    public static ProxyFactory getInstance()
    {
        return ProxyFactory.instance;
    }

    public Object createProxy(String proxyType) throws Exception {
        System.out.println(proxyType);
        proxyType="com.pyjava.pattern.proxy.interface_proxy.invocationHandler.TypeBInvocationHandler";
        String interfaceClassName="com.pyjava.pattern.proxy.interface_proxy.CalcInterface";

        Class interfaceClass =Class.forName(interfaceClassName);
        InvocationHandler invocationHandler=(InvocationHandler)Class.forName(proxyType).newInstance();

        ClassLoader classLoader=interfaceClass.getClassLoader();
        Class []clazzArr=new Class[]{interfaceClass};

        if(this.obj==null)
        {
            System.out.println("给你一个代理对象");
            this.obj= Proxy.newProxyInstance(classLoader,clazzArr,invocationHandler);
        }
        else
        {
            System.out.println("已经给你一个代理对象");
        }

        return this.obj;

    }
}
