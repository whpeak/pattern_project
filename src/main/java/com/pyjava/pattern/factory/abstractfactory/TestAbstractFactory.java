package com.pyjava.pattern.factory.abstractfactory;

/**
 *
 * Created by wangheng on 16/7/1.
 */
public class TestAbstractFactory {
    public static void main(String args[]) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        AbstractFactory abstractFactory=AbstractFactory.getInstance();
        Add98Tool add98Tool= (Add98Tool) abstractFactory.createTool("add98");
        add98Tool.add98();
    }

}

