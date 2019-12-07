package pattern.status.demo;

/**
 * 是我的职责,就去处理,
 * 负责,跳转到下一个职责,然后触动状态(上下文,是公共的)
 * Created by wangheng on 16/7/13.
 */
public class Work7Status implements WorkStatus {


    @Override
    public void doWork(WorkContext workContext)
    {
        int currnetHour=workContext.getCurrentHour();
        if(currnetHour<12)
        {
            String tip="currentHour is : "+ currnetHour+" ,精神特别好";
            System.out.println(tip);
        }
        else
        {
            WorkStatus work12Status =new Work12Status();
            workContext.setWorkStatus(work12Status);
            workContext.startWork();
        }

    }
}
