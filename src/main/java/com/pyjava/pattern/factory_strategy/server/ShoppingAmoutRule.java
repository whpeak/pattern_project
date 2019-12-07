package com.pyjava.pattern.factory_strategy.server;

/**
 * 购物总价算法
 * Created by wangheng on 16/7/1.
 */
public interface ShoppingAmoutRule {

    public double getResult(Object params);//规则,获取商品总价的优惠价格
}
//总价的八折
class ShoppingAmout8 implements ShoppingAmoutRule
{
    @Override
    public double getResult(Object params) {
        double amout= (double) params;
        double result=amout*0.8;
        return result;
    }
}


class ShoppingAmout100sub50_8 implements ShoppingAmoutRule
{
    @Override
    public double getResult(Object params) {
        double amonut= (double) params;
        if (amonut>100.0)
        {
            amonut=amonut-50;
        }
        double result=amonut*0.8;
        return result;
    }
}
