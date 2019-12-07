package com.pyjava.pattern.build;

/**
 * Created by wangheng on 16/7/4.
 * what
 * 只要指定具体的建造者，然后交给指挥者就可以了。
 * 不许关心建造过程中少某一部分，因为建造过程，是有指挥者去确定的。
 * 我认为，可以在指定生产者的时候，使用工厂模式
 * how
 * (1)抽象建造者 知道应该建造什么东西，比如建造门，窗 等等
 * (2)指挥者
 *    1) 规定具体的建造顺序，先做什么，后做什么。
 *    2) 隔离具体的建造者和需求方，需求方只要规定是那个建造者就可以，自作过程可以不用关心。
 * (3) 需求方
 *
 * why
 * 指挥者的作用:
 * 客户端传递一个基层元素
 * 然后传递给创建类,然后创建就可以.
 * 结果返回给客户端
 */
public class test {


    public static void main(String[] args) {
        HourseMap hourseMap=new TwoFloorHouse();//执行一个建造者
        HouseBuilder houseBuilder=new HouseBuilder(hourseMap);//可以建造了
        houseBuilder.createHouse();

    }

}
