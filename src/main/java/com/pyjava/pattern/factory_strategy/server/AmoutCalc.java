package com.pyjava.pattern.factory_strategy.server;

import java.util.Map;
import java.util.HashMap;

/**
 * 服务端总价计算类(策略模式)
 * Created by wangheng on 16/7/1.
 */
public class AmoutCalc {


    private Map<String,ShoppingAmoutRule> shoppingRules = new HashMap<String,ShoppingAmoutRule>();

    private static AmoutCalc instance = new AmoutCalc();

    private AmoutCalc() {
    }

    public static AmoutCalc getInstance() {
        return AmoutCalc.instance;
    }

    public synchronized double getAmount(String ruleName, Object params)
    {
        ShoppingAmoutRule shoppingAmoutRule = null; //引进策略模式(目前没有具体的策略)
        try
        {
        shoppingAmoutRule=this.shoppingRules.get(ruleName);
        if(null==shoppingAmoutRule)
        {
            System.out.println(ruleName+" has no instachce");
            shoppingAmoutRule = ShoppingAmountRuleFactory.getInstance().createRule(ruleName);//创建具体的策略算法.
            this.shoppingRules.put(ruleName,shoppingAmoutRule);

        }
        else
        {
            System.out.println(ruleName+" has instachce");
        }
        }
        catch (IllegalAccessException e)
        {
                    e.printStackTrace();
        } catch (InstantiationException e)
        {
                    e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
                    e.printStackTrace();
        }

        return shoppingAmoutRule.getResult(params);
    }
}




