package com.pyjava.pattern.singleton;

/**
 * 单例模式
 * 内存中只有一份实例(工具类,配置文件读取,等共享资源的代码)
 *(1) 加载的时候,自己new一份实例,并且私有化
 *(2) 构造函授私有
 *(3) 提供公共的访问接口.
 * Created by wangheng on 16/6/28.
 */
public class Singleton {
    //自己new一份
    private static Singleton Singleton= new Singleton();
    //构造函授私有
    private Singleton() {}
    //公共访问接口
    public static Singleton getInstance()
    {
        return Singleton.Singleton;
    }
    //对外提供的方法
    public void doThings(String tips)
    {
        System.out.println(tips);
    }


public static void main(String args[])
{
    Singleton instance1 =Singleton.getInstance();
    instance1.doThings(String.valueOf("instance1:"+instance1.hashCode()));
    Singleton instance2 =Singleton.getInstance();
    instance2.doThings(String.valueOf("instance2:"+instance2.hashCode()));

}
}

