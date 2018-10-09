package 行为型设计模式.命令模式;

/**
 * @author torvalds on 2018/10/7 18:26.
 * @version 1.0
 */
public class TidyCommond implements Commond {
    Receiver receiver;

    public TidyCommond(Receiver receiver) {
        this.receiver = receiver;
    }

    public void exe() {
        receiver.action(this);
    }
}
