package com.pyjava.pattern.listener;

/**
 * Created by wangheng on 16/7/5.
 */
public class TestListener {
    public static void main(String[] args) {
        Person person =new Person();

        PersonEatListener personEatListener =new PersonEatListener();
        person.addPersonEatListener(personEatListener);
        person.eat();

    }
}
