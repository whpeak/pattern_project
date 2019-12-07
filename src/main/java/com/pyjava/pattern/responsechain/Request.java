package pattern.responsechain;

/**
 * Created by wangheng on 16/7/19.
 */
public class Request {

    public int requestLevel=0;

    public int getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(int requestLevel) {
        this.requestLevel = requestLevel;
    }

    public Request(int requestLevel)
    {
        this.requestLevel = requestLevel;
    }

}
