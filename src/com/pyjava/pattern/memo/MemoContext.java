package com.pyjava.pattern.memo;

/**
 * Created by wangheng on 16/7/18.
 */
public class MemoContext {
    private GameStatusMemo gameStatusMemo=null;

    public GameStatusMemo getGameStatusMemo() {
        return gameStatusMemo;
    }

    public void setGameStatusMemo(GameStatusMemo gameStatusMemo) {
        this.gameStatusMemo = gameStatusMemo;
    }
}
