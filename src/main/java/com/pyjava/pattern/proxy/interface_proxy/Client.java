package pattern.proxy.interface_proxy;



/**
 * 一个代理,
 * 怎么代理别人
 * 怎么创建自己
 * 然后才是被别人调用
 * Created by wangheng on 16/7/2.
 */
public class Client

{

    public static void main(String args[]) throws Exception {

        for (int i=0;i<9;i++)
        {
            ProxyFactory proxyFactory=ProxyFactory.getInstance();
            System.out.println(proxyFactory.hashCode());
            Object obj= proxyFactory.createProxy("typeB");

            CalcInterface calcInterface=(CalcInterface) obj;
            int result=calcInterface.calc();
            System.out.println(result);
            calcInterface.sayHello();
        }

    }
}

