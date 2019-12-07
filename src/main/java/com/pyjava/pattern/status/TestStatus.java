package pattern.status;

/**
 * Created by wangheng on 16/7/13.
 */
public class TestStatus {


    public static void main(String[] args) {
        //首先,给上下文,提供一个初始值,也就是给一个初始状态.
        System.out.println("现在开始执行,并且设置初始状态");
        Context context =new Context(new StatusA());
        System.out.println();
        for (int i=1;i<5;i++)
        {
            System.out.println("执行第["+i+"]次");
            context.request();
        }
    }

}
