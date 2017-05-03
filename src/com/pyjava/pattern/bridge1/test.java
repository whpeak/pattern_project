package com.pyjava.pattern.bridge1;

import com.pyjava.pattern.bridge1.absExcute.Control;
import com.pyjava.pattern.bridge1.absExcute.Road;
import com.pyjava.pattern.bridge1.absExcute.Car;
import com.pyjava.pattern.bridge1.impl.AoDiCar;
import com.pyjava.pattern.bridge1.impl.HuanxianRoad;
import com.pyjava.pattern.bridge1.impl.JiaoTongControl;

/**
 * Created by wangheng on 2017/5/3.
 */
public class test {
    public static void main(String[] args) {

        Control  control =new JiaoTongControl();
        Car car = new AoDiCar();
        Road road = new HuanxianRoad();

        control.setCar(car);
        control.setRoad(road);
        test.run(control);
    }

    public static void run(Control control)
    {
        control.run();
    }
}
