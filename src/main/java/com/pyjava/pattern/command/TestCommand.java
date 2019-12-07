package pattern.command;

/**
 * Created by wangheng on 16/7/20.
 */
public class TestCommand {
    public static void main(String[] args) {
        ACommand aCommand=new ACommand();
        BCommand bCommand=new BCommand();
        CCommand cCommand=new CCommand();
        Shedule shedule=new Shedule();


        shedule.setcommand(aCommand);
        shedule.setcommand(bCommand);
        shedule.setcommand(cCommand);

        shedule.doCommand();
    }

}
