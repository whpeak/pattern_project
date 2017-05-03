package com.pyjava.pattern.bridge1.absExcute;

/**
 * Created by wangheng on 2017/5/3.
 */
public interface Control {
     Road road=null;
     Car car=null;

    void run();
    void setRoad(Road road);
    void setCar(Car car);
}
