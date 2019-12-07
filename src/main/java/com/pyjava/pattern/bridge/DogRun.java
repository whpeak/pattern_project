package com.pyjava.pattern.bridge;

/**
 * Created by wangheng on 16/7/19.
 */
public class DogRun implements  AbstarctRun {
    @Override
    public void run() {
        System.out.println("dog is running...");
    }
}
