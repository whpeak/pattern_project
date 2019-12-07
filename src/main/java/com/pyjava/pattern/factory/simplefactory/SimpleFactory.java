package com.pyjava.pattern.factory.simplefactory;

/**
 * 简单工厂模式(静态工厂) 工厂模式level1
 * [what]
 * 是一个工厂,创建一个实例对象,并返回.
 * 工厂最好是单例模式(一个工厂去创建就可以)
 * [how]
 * (1)客户端调用工厂的创建方法,制定创建的工具的名称.
 * (2)工厂new 一个工具,并且返回.
 * [why]
 *降低客户端与工具的耦合.避免用户与工具的直接交流,引进一个中介.
 * 当工具的实现类变了,不影响客户的使用.(不改变客户的代码)
 *(电视剧,发电厂,用插座隔离,不用关心发电的方式和电视的型号,修改一方,不影响另一方)
 * 低耦合.
 *
 * so:
 * 需要相互的依赖的两个对象,中间使用中介去协调,避免相互的影响.
 *
 *
 *
 * 优点:降低客户段与工具的低耦合.
 * 缺点:工厂内部耦合太高,需要修改代码.有各种逻辑的if语句 和new .
 * 每增加一个工具,就需要添加一个if判断.
 *
 *tip:
 * 工具因为没有接口,所以使用object去接收,需要强转.
 * 可以定义一个接口,然后统一工具的行为.(本代码中,tool 没有定义接口)
 *
 *
 *
 * Created by wangheng on 16/7/1.
 */
public class SimpleFactory {
    private static SimpleFactory instance =new SimpleFactory();

    private SimpleFactory() {
    }
    public static SimpleFactory getInstance()
    {
        return SimpleFactory.instance;
    }

    public Object createTool(String toolName)
    {
        Object obj=null;
        if("add98".equals(toolName))
        {
            obj =new Add98Tool();
        }
        else if ("add95".equals(toolName))
        {
            obj =new Add95Tool();
        }
        return obj;
    }

}



class Add98Tool
{
    public  void add98()
    {
        System.out.println("加98号汽油");
    }
}
class Add95Tool
{
    public  void add95()
    {
        System.out.println("加95号汽油");
    }
}