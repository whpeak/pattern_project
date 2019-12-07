package pattern.status.demo;

/**
 * Created by wangheng on 16/7/13.
 */
public class Work17Status implements WorkStatus {
    @Override
    public void doWork(WorkContext workContext) {
        int currnetHour=workContext.getCurrentHour();
        if(currnetHour<22)
        {
            String tip="currentHour is : "+ currnetHour+" ,我要下午茶";
            System.out.println(tip);
        }
        else
        {
            WorkStatus work22Status =new Work22Status();
            workContext.setWorkStatus(work22Status);
            workContext.startWork();

        }

    }
}
