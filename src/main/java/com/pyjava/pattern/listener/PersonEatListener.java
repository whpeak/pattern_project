package pattern.listener;

/**
 * Created by wangheng on 16/7/5.
 */
public class PersonEatListener implements EatListener {
    @Override

    public void preEat(Event e)
    {
        System.out.println("要吃饭,就先洗手吧");
        Person person = (Person) e.getSource();
        //这里不能调用安装该监听器的方法,(会造成迭代调用) 比如,不能调用eat方法
        person.drink();
    }
}
