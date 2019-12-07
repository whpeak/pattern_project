package pattern.bridge;

/**
 * 将抽象部分与实现部分分离，使它们都可以独立的变化
 * 这是一个抽象控制类
 * 面向接口编程
 * 调用具接口中的方法
 * what
 * 将接口和具体实现分离.
 * 业务逻辑定义好.具体的实现,分离.在运行时,注入具体实现类
 * 类似一个桥,对接
 *
 * how
 * (1)接口作为成员变量
 * (2)提供接口实现类的注入方法
 * 提供调用接口方法的对外接口
 * (3)
 * why
 * Created by wangheng on 16/7/19.
 */
public class Control {

    private AbstarctRun abstarctRun;

    public AbstarctRun getAbstarctRun() {
        return abstarctRun;
    }

    public void setAbstarctRun(AbstarctRun abstarctRun) {
        this.abstarctRun = abstarctRun;
    }
    public void doRun()
    {
        this.abstarctRun.run();
    }
}
