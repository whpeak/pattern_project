package pattern.command;

/**
 * Created by wangheng on 16/7/20.
 */
public class CCommand extends Command {
    @Override
    void excuteCommand() {
        System.out.println("command C doing...");
    }
}
