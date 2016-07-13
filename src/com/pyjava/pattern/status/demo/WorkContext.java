package com.pyjava.pattern.status.demo;

/**
 * Created by wangheng on 16/7/13.
 */
public class WorkContext {

    private int currentHour;
    private WorkStatus workStatus;

    public int getCurrentHour() {
        return currentHour;
    }

    public void setCurrentHour(int currentHour) {
        this.currentHour = currentHour;
    }

    public WorkStatus getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }

    public void startWork()
    {
        this.getWorkStatus().doWork(this);
    }
}
