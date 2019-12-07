package pattern.status;

/**
 * 这个上下文,共对外访问,内在的状态转换,是由各个状态实现类去内部调用(statusA去调用statusB)
 * 这是一个上下文,何种状态在执行的时候,都要有这个一样的上下文
 * 状态接口作为成员变量
 *
 *
 * (1)定义一个状态接口
 * (2)定义一个上下文类
 *    持有一个成员变量,类型为状态接口,提供set,get 方法
 *    该成员变量的作用是表明上下文当前的状态是那种
 *(3)提供一个做事的方法
 *   该方法,调用的是具体状态类的做事方法
 *   调用做事类(具状态类)的方法时候,要把this(context类)传递进去
 *   目的是让具体做事类,在做完之后,可以设定上下文应该处于的下一状态类是什么
 *   然后在下一次被起他调用的时候,执行下一个状态的方法.
 * Created by wangheng on 16/7/13.
 */
public class Context {
    private StatusInterf statusInterf;

    public StatusInterf getStatusInterf() {
        return statusInterf;
    }

    public void setStatusInterf(StatusInterf statusInterf)
    {
        this.statusInterf = statusInterf;
    }

    public Context(StatusInterf statusInterf) {
        this.statusInterf = statusInterf;
    }
    public  void request()
    {

        String runClassName=this.getClass().getSimpleName();
        String statusName=this.getStatusInterf().getClass().getSimpleName();
        String whoSay="["+runClassName+"] say: ";
        System.out.println(whoSay+"我被调用了");
        System.out.println(whoSay+"我现在是什么状态:["+statusName+"]");
        System.out.println(whoSay+"现在开始让状态:["+statusName+"] 做事了");
        this.statusInterf.handle(this);
    }
}
