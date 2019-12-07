package com.pyjava.pattern.build;

/**
 * Created by wangheng on 16/7/4.
 * 指挥者的作用:
 * 客户端传递一个基层元素
 * 然后传递给创建类,然后创建就可以.
 * 结果返回给客户端
 */
public class HouseBuilderDicrector {


    public static void main(String[] args) {
        HourseMap hourseMap=new TwoFloorHouse();
        HouseBuilder houseBuilder=new HouseBuilder(hourseMap);
        houseBuilder.createHouse();

    }

}
