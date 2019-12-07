package com.pyjava.pattern.command;

/**
 * Created by wangheng on 16/7/20.
 */
public class ACommand extends Command {
    @Override
    void excuteCommand() {
        System.out.println("command A doing...");
    }
}
