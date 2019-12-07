package pattern.status.demo;

/**
 * Created by wangheng on 16/7/13.
 */
public class Work22Status implements WorkStatus {
    @Override
    public void doWork(WorkContext workContext) {
        int currnetHour=workContext.getCurrentHour();
        if(currnetHour<24)
        {
            String tip="currentHour is : "+ currnetHour+" ,我下班了";
            System.out.println(tip);
        }

    }
}
