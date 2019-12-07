package com.pyjava.pattern.strategy;

/**
 * Created by wangheng on 16/7/1.
 */
public class TestStrategy {
    public static void main(String args[])
    {
        Strategy strategy1=new Strategy1();//具体的策略
        StrategyRun strategyRun=new StrategyRun();
        double result=strategyRun.getCashResult(strategy1);//具体的策略,作为参数,传递进去
        System.out.println(result);

    }
    }




