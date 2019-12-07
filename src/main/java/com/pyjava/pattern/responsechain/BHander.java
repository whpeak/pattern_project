package pattern.responsechain;

/**
 * Created by wangheng on 16/7/19.
 */
public class BHander extends Hander {

    public BHander(String handerName) {
        super(handerName);
    }
    @Override
    public void doRequest(Request request) {
        int requestLevel=request.getRequestLevel();
        System.out.println(this.getClass().getSimpleName()+" say: current request level is "+requestLevel);
        if(requestLevel<4&& requestLevel>=2)
        {
            System.out.println("hander this request");
            request.setRequestLevel(4);
        }
        else
        {
            System.out.println("do not hander this request");
        }

        nextHander.doRequest(request);

    }
}
