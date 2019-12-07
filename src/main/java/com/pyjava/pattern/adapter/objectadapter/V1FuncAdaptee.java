package com.pyjava.pattern.adapter.objectadapter;

/**
 * @ClassName V1FuncAdaptee
 * @Description TODO
 * @Author wangheng8
 * @Date 2019/12/7 19:56
 * @Version 1.0
 **/
public class V1FuncAdaptee  implements V2Func {

    private V1Func v1Func = V1Func.newInstance();
    @Override
    public void superFunc() {
        System.out.println("可以提供一个超级牛的功能。。。。。");
        System.out.println("但是还需要老功能完成一部分，开始调用了。。。。。");
        v1Func.oldFunc();
        System.out.println("老功能调用结束。。。。。");
    }
}
