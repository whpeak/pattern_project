package com.pyjava.pattern.template;

/**
 * 模版模式
 * 不知道某一步骤如何实现
 * 但是知道整个结构.
 * 那么,不知道的地方,就写成抽象方法,(可以使用委托模式)
 * 这样,只要继承该模版,就可以获取相同的部分,实现自己特殊的部分
 * 这样就可以保证相同的都一致
 *
 * Created by wangheng on 16/7/4.
 */
public abstract  class CalcTemplate
{

    public void sayTip()
    {
        System.out.println("获取你的答案中......");
    }

    public abstract int input();
    public void sayResult()
    {
        int choose=this.input();

        System.out.println("你输入的答案为:"+choose);

        System.out.println("评判结果如下:");

        switch (choose)
        {
            case 1:
                System.out.println("you are 1");break;

            case 2:
                System.out.println("you are 2");break;

            case 3:
                System.out.println("you are 3");break;

        }
    }
    public void run()
    {
        this.sayTip();
        this.sayResult();
    }

}
