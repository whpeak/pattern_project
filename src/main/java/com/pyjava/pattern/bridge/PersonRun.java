package com.pyjava.pattern.bridge;

/**
 * Created by wangheng on 16/7/19.
 */
public class PersonRun implements AbstarctRun {
    @Override
    public void run() {
        System.out.println("person is running...");
    }
}
