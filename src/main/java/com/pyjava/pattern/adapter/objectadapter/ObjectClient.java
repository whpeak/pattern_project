package com.pyjava.pattern.adapter.objectadapter;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wangheng8
 * @Date 2019/12/7 19:59
 * @Version 1.0
 **/
public class ObjectClient {

    public static void main(String[] args) {

        //使用老旧的V1，使其能够适配新的需求，并且是类级别的适配，重点就是继承过来
        V2Func v2Func = new V1FuncAdaptee();
        v2Func.superFunc();
    }
}
