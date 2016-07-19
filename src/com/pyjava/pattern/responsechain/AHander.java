package com.pyjava.pattern.responsechain;

/**
 * a,b,c,d依次为四个职责
 * 都维护自己的上级
 * 实现抽象方法
 * 符合自己的权利,就去执行,
 * 否则,抛给上级
 * Created by wangheng on 16/7/19.
 */
public class AHander extends Hander {

    public AHander(String handerName) {
        super(handerName);
    }

    @Override
    public void doRequest(Request request) {
        int requestLevel=request.getRequestLevel();
        if(requestLevel<2 && requestLevel>=0)
        {
            System.out.println(this.getClass().getSimpleName()+" say: current request level is "+requestLevel);
            System.out.println("hander this request");
            request.setRequestLevel(2);
        }
        else
        {
            System.out.println(this.getClass().getSimpleName()+" say: current request level is "+requestLevel);
            System.out.println("do not hander this request");
        }
        nextHander.doRequest(request);

    }
}
