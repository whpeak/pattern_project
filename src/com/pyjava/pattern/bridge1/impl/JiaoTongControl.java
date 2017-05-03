package com.pyjava.pattern.bridge1.impl;

import com.pyjava.pattern.bridge1.absExcute.Car;
import com.pyjava.pattern.bridge1.absExcute.Road;
import com.pyjava.pattern.bridge1.absExcute.Control;

/**
 * Created by wangheng on 2017/5/3.
 */
public class JiaoTongControl implements Control{
    private Road road;
    private Car car;

    public void setRoad(Road road) {
        this.road = road;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void run()
    {
        String roadType = this.road.roadType();
        String carType = this.car.carType();
        System.out.println("I drive "+carType +" running on "+roadType);
    }
}
