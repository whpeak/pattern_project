package pattern.memo;

/**
 * Created by wangheng on 16/7/18.
 */
public class TestMemo {


    public static void main(String[] args) {

        GameRule gameRule=new GameRule();
        MemoContext memoContext=new MemoContext();
        memoContext.setGameStatusMemo(gameRule.createMemo());
        gameRule.displayStatus();
        gameRule.setxStatus(89);
        gameRule.setyStatus(12);
        gameRule.setzStatus(3);
        memoContext.setGameStatusMemo(gameRule.createMemo());
        gameRule.displayStatus();
        gameRule.resetStatus(memoContext.getGameStatusMemo());
        gameRule.displayStatus();

    }

}
