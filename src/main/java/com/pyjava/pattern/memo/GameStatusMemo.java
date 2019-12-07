package pattern.memo;

/**
 * 游戏状态的备忘录(纪录当前的游戏状态)
 * Created by wangheng on 16/7/18.
 */
public class GameStatusMemo {
    private int xStatus;
    private int yStatus;
    private int zStatus;



    public GameStatusMemo(int xStatus, int yStatus, int zStatus) {
        this.xStatus = xStatus;
        this.yStatus = yStatus;
        this.zStatus = zStatus;
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
