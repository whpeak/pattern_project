package com.pyjava.pattern.responsechain;

/**
 * Created by wangheng on 16/7/19.
 */
public class RequstChain {

    /**
     * 组装整个职责连
     * 在职责链中的每一个角色,
     * 设定好上级
     * @param request
     */
    public void responseRequest(Request request)
    {
        AHander aHander=new AHander("a");
        BHander bHander=new BHander("b");
        CHander cHander=new CHander("c");
        DHander dHander=new DHander("d");
        aHander.setNextHander(bHander);
        bHander.setNextHander(cHander);
        cHander.setNextHander(dHander);
        aHander.doRequest(request);
    }
}
