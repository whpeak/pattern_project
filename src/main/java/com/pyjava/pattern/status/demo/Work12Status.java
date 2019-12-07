package pattern.status.demo;

/**
 * Created by wangheng on 16/7/13.
 */
public class Work12Status implements WorkStatus {
    @Override
    public void doWork(WorkContext workContext) {
        int currnetHour=workContext.getCurrentHour();
        if(currnetHour<17)
        {
            String tip="currentHour is : "+ currnetHour+" ,我要吃饭了";
            System.out.println(tip);
        }
        else
        {
            WorkStatus work17Status =new Work17Status();
            workContext.setWorkStatus(work17Status);
            workContext.startWork();

        }

    }
}
