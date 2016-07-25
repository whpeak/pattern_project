package com.pyjava.pattern.command;

/**
 * Created by wangheng on 16/7/20.
 */
public class ExcuteCommand {
private Command command;

    public ExcuteCommand(Command command) {
        this.command = command;
    }

    public void doCommand()
    {
        this.command.excuteCommand();
    }
}
