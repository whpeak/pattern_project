package com.pyjava.pattern.singleton;

/**
 * Created by wangheng on 16/6/28.
 */
public class TestSingleton {
    public static void main(String args[])
    {
        Singleton instance1 =Singleton.getInstance();
        instance1.doThings(String.valueOf("instance1:"+instance1.hashCode()));
        Singleton instance2 =Singleton.getInstance();
        instance2.doThings(String.valueOf("instance2:"+instance2.hashCode()));
    }
}
