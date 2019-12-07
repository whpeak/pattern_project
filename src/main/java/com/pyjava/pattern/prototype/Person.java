package com.pyjava.pattern.prototype;

/**
 *圆形模式
 * 继承Cloneable接口
 * 重写clone方法.
 * 设计到深copy和浅copy
 * java 的基础变量(包含String 为深copy)
 * 其他成员(数组,类等等,为💰copy 为地址的copy)
 *
 *
 *
 * ①为了获取对象的一份拷贝，我们可以利用Object类的clone()方法。
 * ②在派生类中覆盖基类的clone()方法，并声明为public。
 * ③在派生类的clone()方法中，调用super.clone()。
 * ④在派生类中实现Cloneable接口（一个标识性的接口）
 *
 *
 * Created by wangheng on 16/7/4.
 */
public class Person implements Cloneable{
    public Integer age=new Integer(2);
    public String name="test"; //测试深copy
    public String []phoneArr=new String[]{"11","22"}; //测试深copy

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getPhoneArr() {
        return phoneArr;
    }

    public void setPhoneArr(String[] phoneArr) {
        this.phoneArr = phoneArr;
    }
    /**
     * 这个是重点,重写clone方法.
     * @return
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
      return (Person) super.clone();
    }
}


