package 行为型设计模式.状态模式;

/**
 * @author torvalds on 2018/10/7 21:01.
 * @version 1.0
 */
public class NullState implements State {

    public void handle() {
        System.out.println(" 无水空状态 ");
    }
}
