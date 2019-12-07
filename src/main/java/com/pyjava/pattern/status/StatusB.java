package com.pyjava.pattern.status;

/**
 * Created by wangheng on 16/7/13.
 */
public class StatusB implements StatusInterf {
    @Override
    public void handle(Context context) {
        String runClassName=this.getClass().getSimpleName();
        String whoSay="["+runClassName+"] say: ";
        System.out.println(whoSay+"我是状态B,我做完了,下一个是状态A");
        context.setStatusInterf(new StatusA());

    }

}
