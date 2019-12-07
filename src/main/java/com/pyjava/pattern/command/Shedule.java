package pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangheng on 16/7/20.
 */
public class Shedule {

    private List<ExcuteCommand> commands=new ArrayList<ExcuteCommand>();
    public void setcommand(Command command)
    {
        commands.add(new ExcuteCommand(command));
    }
    public void doCommand()
    {
        for (ExcuteCommand excuteCommand : this.commands)
        {
            excuteCommand.doCommand();
        }
    }
}
