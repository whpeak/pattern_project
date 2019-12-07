package pattern.bridge1.impl;

import pattern.bridge1.absExcute.Road;

/**
 * Created by wangheng on 2017/5/3.
 */
public class HuanxianRoad implements Road {
    @Override
    public String roadType() {
        return "环线";
    }
}
