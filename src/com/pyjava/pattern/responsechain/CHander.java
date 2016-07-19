package com.pyjava.pattern.responsechain;

/**
 * Created by wangheng on 16/7/19.
 */
public class CHander extends Hander {

    public CHander(String handerName) {
        super(handerName);
    }
    @Override
    public void doRequest(Request request) {
        int requestLevel=request.getRequestLevel();
        if(requestLevel<6 && requestLevel>=4)
        {
            System.out.println(this.getClass().getSimpleName()+" say: current request level is "+requestLevel);
            System.out.println("hander this request");
            request.setRequestLevel(6);
        }
        else
        {
            System.out.println(this.getClass().getSimpleName()+" say: current request level is "+requestLevel);
            System.out.println("do not hander this request");
        }
        nextHander.doRequest(request);

    }
}
