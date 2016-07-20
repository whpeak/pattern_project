package com.pyjava.pattern.bridge;

/**
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
