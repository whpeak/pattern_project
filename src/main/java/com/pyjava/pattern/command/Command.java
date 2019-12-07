package pattern.command;

/**
 * what
 * 将命令的执行者,和命令的下达者,进行分离,
 * 这样,方便命令的管理,减少耦合.
 * how
 * 定义命令接口,具体的命令,实现该接口.
 * 定义命令执行类(命令接口作为成员变量) 详见ExcuteCommand(该类可以弃掉)
 * 通过调度器,封装命令执行类list为成员变量,然后循环调用.
 *
 * why
 *
 * Created by wangheng on 16/7/20.
 */
abstract class Command
{
    abstract void excuteCommand();
}
