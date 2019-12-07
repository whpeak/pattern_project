package pattern.responsechain;

/**
 * Created by wangheng on 16/7/19.
 */
public class TestChain {
    public static void main(String[] args) {

        Request request =new Request(1);
        RequstChain requstChain =new RequstChain();
        requstChain.responseRequest(request);
        request.setRequestLevel(7);
        requstChain.responseRequest(request);



    }

}
