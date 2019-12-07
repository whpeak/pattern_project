package pattern.proxy.interface_proxy;

/**
 * Created by wangheng on 16/7/2.
 */

public class BaseCalc implements CalcInterface {
    @Override
    public int calc() {

        int result=(int)(1+Math.random()*(10-1+1));
        return result;
    }

    @Override
    public void sayHello() {
        System.out.println("hello everyone");
    }
}