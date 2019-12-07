package pattern.status;

/**
 *  再让我做事之前,需要给我上下文
 *  我做完事,告诉上下文下一个状态是谁
 * Created by wangheng on 16/7/13.
 */
public class StatusA implements StatusInterf {
    @Override
    public void handle(Context context) {
        String runClassName=this.getClass().getSimpleName();
        String whoSay="["+runClassName+"] say: ";
        System.out.println(whoSay+"我是状态A,我做完了,下一个是状态B");
        context.setStatusInterf(new StatusB());
    }
}
