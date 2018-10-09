package 行为型设计模式.状态模式;

/**
 * @author torvalds on 2018/10/7 21:00.
 * @version 1.0
 */
public class FullState implements State {

    public void handle() {
        System.out.println(" 有水状态，继续出水 ");
    }
}
