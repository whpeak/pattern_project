package com.pyjava.pattern.adapter.classadapter;

/**
 * @ClassName V1FuncAdaptee
 * @Description TODO
 * @Author wangheng8
 * @Date 2019/12/7 19:56
 * @Version 1.0
 **/
public class V1FuncAdaptee extends V1Func implements V2Func {

    @Override
    public void superFunc() {
        System.out.println("可以提供一个超级牛的功能。。。。。");
        System.out.println("但是还需要老功能完成一部分，开始调用了。。。。。");
        super.oldFunc();
        System.out.println("老功能调用结束。。。。。");
    }
}
