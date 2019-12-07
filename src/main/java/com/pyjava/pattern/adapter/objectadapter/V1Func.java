package com.pyjava.pattern.adapter.objectadapter;

/**
 * @ClassName V1Func
 * @Description
 * 类适配器模式
 * Adapter为一个需要被适配的类，用一些就有的功能
 *
 * @Author wangheng8
 * @Date 2019/12/7 19:49
 * @Version 1.0
 **/
public final class V1Func {
    private static V1Func v1Func = new V1Func();
    private V1Func(){}
    /**
     *
     */
    public static V1Func newInstance() {
        return v1Func;
    }
    public void oldFunc()
    {
        System.out.println("-------->我有一个特别古老的的功能。。。。。。");
    }
}
