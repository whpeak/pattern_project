package com.pyjava.pattern.listener;

/**
 * Created by wangheng on 16/7/5.
 */
public class Event {

    private Object source;

    public Object getSource() {
        return this.source;
    }

    public Event(Object source) {
        this.source = source;
    }
}
