package pattern.singleton;

/**
 * 模式名称:单例模式(饿汉式)
 * 应用场景:内存中只有一份实例(工具类,配置文件读取,等共享资源的代码)
 * 模式结构:
 *(1) jvm加载的时候,new一份类实例,并且私有化 然后赋值给类变量
 *(2) 构造函授私有
 *(3) 提供公共的访问接口.
 * 建议使用饿汉式
 * Created by wangheng on 16/6/28.
 */
public class Singleton {
    //(1)自己持有一份类实例,并赋值给类变量
    private static Singleton Singleton= new Singleton();
    //(2)构造函授私有
    private Singleton() {}
    //(3)提供公共访问接口
    public static Singleton getInstance()
    {
        return Singleton.Singleton;
    }
    //对外提供的方法
    public void doThings(String tips)
    {
        System.out.println(tips);
    }
}

