package pattern.bridge;

/**
 * 桥接模式运行入口
 *
 * what
 *将抽象部分与实现部分分离，使它们都可以独立的变化.
 * 包含三种角色：
 * 流程控制器类
 * 抽象执行者接口
 * 具体执行者实现类
 * how
 *  (1) 定义一个整体的控制器：Control类
 *      a、在Control类中包含一个抽象出来的执行者接口，任何具体执行者，都需要实现这个接口
 *      b、提供一个setter方法，方便具体执行者注入
 *      c、提供一个调用执行者接口中的执行方法的对外接口，也就是说对执行者接口的抽象方法进行封装
 *  (2) 定义一个执行者抽象接口
 *  (3) 具体执行者类
 *
 * why
 * Bridge的目的是让底层实现和上层接口可以分别演化,而策略模式的目的是将复杂的算法封装起来，从而便于替换不同的算法。
 * Strategy的目的是将复杂的算法封装起来，从而便于替换不同的算法。
 * 也就是说，整个业务逻辑，都要抽象为一个接口，然后包含好多种业务方法，但是策略模式仅仅是某一个特定的方法，
 * 进行运行时的具体化。
 * 桥接和适配器都是让两个东西配合工作，但是，适配器是让两个不同的接口相和融合。也就是说会修改函数内的逻辑代码
 * 桥接是分离抽象化和实现，使两者的接口可以不同，目的是分离。
 * jdbc是桥接模式
 * 数据源中的close是适配器模式
 * 计算具体的价格是策略模式。
 * Created by wangheng on 16/7/19.
 */
public class Test {
    public static void main(String[] args) {


        PersonRun personRun =new PersonRun();
        DogRun dogRun=new DogRun();
        Control control=new Control();

        control.setAbstarctRun(personRun);
        control.doRun();

        control.setAbstarctRun(dogRun);
        control.doRun();
    }
}
