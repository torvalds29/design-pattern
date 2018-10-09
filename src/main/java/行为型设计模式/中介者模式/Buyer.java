package 行为型设计模式.中介者模式;

/**
 * @author torvalds on 2018/10/7 23:01.
 * @version 1.0
 */
public class Buyer extends User {
    public Buyer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println(" 买家正在买东西 ");
    }
}
