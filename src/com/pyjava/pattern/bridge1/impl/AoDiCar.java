package com.pyjava.pattern.bridge1.impl;

import com.pyjava.pattern.bridge1.absExcute.Car;

/**
 * Created by wangheng on 2017/5/3.
 */
public class AoDiCar implements Car {
    @Override
    public String carType() {
        return "奥迪";
    }
}
