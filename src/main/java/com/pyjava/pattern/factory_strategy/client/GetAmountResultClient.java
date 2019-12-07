package pattern.factory_strategy.client;

import pattern.factory_strategy.server.AmoutCalc;

/**
 * Created by wangheng on 16/7/1.
 */
public class GetAmountResultClient {

    public static void main (String args[])
    {
        AmoutCalc amoutCalc =AmoutCalc.getInstance();
        double result;
        String ruleName="rule8";
        Object params =100.0;
        result=amoutCalc.getAmount(ruleName,params);
        System.out.println(result);
        result=amoutCalc.getAmount(ruleName,200.0);
        System.out.println(result);
        String ruleName2="rule100sub50_8";
        Object params2 =200.0;
        result=amoutCalc.getAmount(ruleName2,params2);
        System.out.println(result);
        result=amoutCalc.getAmount(ruleName2,100.0);
        System.out.println(result);



    }
}
