package pattern.status.demo;

/**
 * Created by wangheng on 16/7/13.
 */
public class TestWorkStatus {
    public static void main(String[] args) {
        WorkContext workContext=new WorkContext();
        Work7Status work7Status=new Work7Status();
        workContext.setCurrentHour(22);
        workContext.setWorkStatus(work7Status);
        workContext.startWork();

    }
}
