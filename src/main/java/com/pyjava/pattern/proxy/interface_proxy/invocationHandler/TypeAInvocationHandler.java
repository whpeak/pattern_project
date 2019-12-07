package com.pyjava.pattern.proxy.interface_proxy.invocationHandler;

import com.pyjava.pattern.proxy.interface_proxy.BaseCalc;
import com.pyjava.pattern.proxy.interface_proxy.CalcInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by wangheng on 16/7/2.
 */

public class TypeAInvocationHandler implements InvocationHandler
{
    private CalcInterface calcInterfance;//被代理的借口类

    public TypeAInvocationHandler() {
        this.calcInterfance = new BaseCalc();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        String methodName=method.getName();
        if(methodName.contains("sayHello"))
        {
            System.out.println("typeA now is: "+new Date());
        }
        Object obj= method.invoke(calcInterfance,args);
        return obj;
    }
}
