package pattern.responsechain;

/**
 *
 * Created by wangheng on 16/7/19.
 */
public class DHander extends Hander {

    public DHander(String handerName) {
        super(handerName);
    }

    @Override
    public void doRequest(Request request) {
        int requestLevel = request.getRequestLevel();
        System.out.println(this.getClass().getSimpleName() + " say: current request level is " + requestLevel);
        if (requestLevel < 8 && requestLevel>=6) {
            System.out.println("hander this request");
            System.out.println("end");
        }
    }
}
