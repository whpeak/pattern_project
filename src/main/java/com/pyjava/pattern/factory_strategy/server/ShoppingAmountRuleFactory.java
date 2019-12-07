package pattern.factory_strategy.server;

import java.util.HashMap;
import java.util.Map;
/**
 * 购物总价算法工厂类
 * Created by wangheng on 16/7/1.
 */
public class ShoppingAmountRuleFactory {
    private static Map<String,String> ruleMap=new HashMap<String,String>();
    static
    {

        ruleMap.put("rule8","com.pyjava.pattern.factory_strategy.server.ShoppingAmout8");
        ruleMap.put("rule100sub50_8","com.pyjava.pattern.factory_strategy.server.ShoppingAmout100sub50_8");


    }

    private static ShoppingAmountRuleFactory instacnce=new ShoppingAmountRuleFactory();
    private ShoppingAmountRuleFactory(){}
    public static ShoppingAmountRuleFactory getInstance()
    {
        return ShoppingAmountRuleFactory.instacnce;
    }
    public ShoppingAmoutRule createRule(String ruleName) throws IllegalAccessException, InstantiationException, ClassNotFoundException
    {
        ShoppingAmoutRule shoppingAmoutRule=null;
        String className=ShoppingAmountRuleFactory.ruleMap.get(ruleName);
        Class shoppingAmoutRuleClazz = Class.forName(className);
        shoppingAmoutRule=(ShoppingAmoutRule)shoppingAmoutRuleClazz.newInstance();
        return shoppingAmoutRule;



    }
}
