package pattern.proxy.interface_proxy.invocationHandler;

import pattern.proxy.interface_proxy.BaseCalc;
import pattern.proxy.interface_proxy.CalcInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by wangheng on 16/7/2.
 */

public class TypeBInvocationHandler implements InvocationHandler
{
    private CalcInterface calcInterfance;//被代理的借口类

    public TypeBInvocationHandler() {
        this.calcInterfance = new BaseCalc();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        String methodName=method.getName();
        if(methodName.contains("sayHello"))
        {
            System.out.println("typeB now is: "+new Date());

        }
        Object obj= method.invoke(calcInterfance,args);
        if(methodName.contains("calc"))
        {
            int result =(int) obj;
            if(result>=5)
                System.out.println("计算的很好");
            else
            {
                System.out.println("计算的一般");
            }
        }


        return obj;
    }
}
