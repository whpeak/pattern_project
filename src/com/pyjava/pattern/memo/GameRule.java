package com.pyjava.pattern.memo;

/**
 * what:
 * 保存运行的某种状态到备忘录中,运行中,可以使用备忘录恢复
 * how
 * (1)定义一个备忘录类(GameStatusMemo)
 * (2)定义一个备忘录持有类(备忘录作为其成员变量)
 * (3)提供创建备忘录和恢复备忘录的方法
 *
 * why
 * 在状态多次发生变化的时候,可以随时保存
 * 备忘录持有类可以设计为map的形式
 * 适用于功能比较复杂,需要维护或纪录历史信息的类
 * Created by wangheng on 16/7/18.
 */
public class GameRule {

    private int xStatus;
    private int yStatus;
    private int zStatus;

    public GameRule() {

        this.xStatus=100;
        this.yStatus=100;
        this.zStatus=100;
    }

    /**
     * 创建一个备忘录
     * 纪录当前的状态
     * @return
     */
    public GameStatusMemo createMemo()
    {
        return new GameStatusMemo(this.xStatus,this.yStatus,this.zStatus);
    }

    /**
     * 将纪录的状态
     * 进行恢复
     * @param gameStatusMemo
     */
    public void resetStatus(GameStatusMemo gameStatusMemo)
    {
        this.xStatus=gameStatusMemo.getxStatus();
        this.yStatus=gameStatusMemo.getyStatus();
        this.zStatus=gameStatusMemo.getzStatus();
    }

    public void displayStatus()
    {
        System.out.println("xSTatus: "+this.xStatus);
        System.out.println("ySTatus: "+this.yStatus);
        System.out.println("zSTatus: "+this.zStatus);
    }

    public int getxStatus() {
        return xStatus;
    }

    public void setxStatus(int xStatus) {
        this.xStatus = xStatus;
    }

    public int getyStatus() {
        return yStatus;
    }

    public void setyStatus(int yStatus) {
        this.yStatus = yStatus;
    }

    public int getzStatus() {
        return zStatus;
    }

    public void setzStatus(int zStatus) {
        this.zStatus = zStatus;
    }
}
