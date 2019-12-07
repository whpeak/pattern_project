package com.pyjava.pattern.responsechain;

/**
 * what
 * 处理属于自己职责范围内的请求
 * 负责,交给上级
 * how
 * 定义一个抽象类
 * 维护上级对象的引用
 * 提供一个抽象请求的方法(类似一个人,有上级,也可以签字.只不过签字的权利不同)
 * why
 *
 * 职责链与状态模式的不同:
 * 状态模式是每一个状态共享context,不符合本身状态,就将其他状态,设置为上下文当前的状态,无顺序规定
 * 职责链只负责和自己的上级交互,有严格的先后顺序.因为明确自己的上级,因此当责任链确定时候,可以明确指定自己的上级.
 * 职责链的关键,在于每一个参与者,都引用上级,然后根据定义的一个确定的职责链顺序,去执行
 * 开发中,可以指定不同的职责链顺序,不影响每一个的参与者的工作.
 *
 * 应用场景的不同:
 *
 *
 * Created by wangheng on 16/7/19.
 */
abstract class Hander {
    protected Hander nextHander;
    protected String handerName;

    public Hander(String handerName) {
        this.handerName = handerName;
    }
    abstract public void doRequest(Request request);

    public Hander getNextHander() {
        return nextHander;
    }

    public void setNextHander(Hander nextHander) {
        this.nextHander = nextHander;
    }
}
