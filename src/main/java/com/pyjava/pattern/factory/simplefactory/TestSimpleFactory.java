package pattern.factory.simplefactory;

/**
 * Created by wangheng on 16/7/1.
 */
public class TestSimpleFactory {
    public static void main(String args[])
    {
        //获取单例模式的工厂
        SimpleFactory simpleFactory =SimpleFactory.getInstance();

        //调用工厂的创建工具的方法,生产98号工具
        Add98Tool add98Tool= (Add98Tool) simpleFactory.createTool("add98");
        add98Tool.add98();

        //调用工厂的创建工具的方法,生产95号工具
        Add95Tool add95Tool= (Add95Tool) simpleFactory.createTool("add95");
        add95Tool.add95();


    }
}
