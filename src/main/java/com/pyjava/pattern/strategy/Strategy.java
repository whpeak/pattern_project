package pattern.strategy;

/**
 *[what]
 * 在主流程中,使用不同的策略(接口实现类)完成响应的计算.
 * [how]
 * 定义策略接口,然后在主流程中的方法中,参数为接口
 * 具体使用的时候,传递进去具体算法实现类就可以了.
 *
 * [why]
 * 在主流程中,需要某一种决策,但是不知道该抉择的具体实现
 * 那么,就将该决策定义为一个接口,
 * 日后谁使用,肯定知道具体的策略,那么,告诉我就可以
 * Created by wangheng on 16/7/1.
 */

class StrategyRun
{
    //这里是重点,使用接口,策略怎么实现,是你的问题,能获取结果就可以了.
    public  double getCashResult(Strategy Strategy)//目前为接口,谁使用,就传递具体的策略
    {
        double result=Strategy.getCashResult();
        return result;
    }
}
 interface Strategy {

    public double getCashResult();//最好不要有参数
}


class  Strategy1 implements Strategy
{
    @Override
    public double getCashResult() {
        return 8;
    }
}




