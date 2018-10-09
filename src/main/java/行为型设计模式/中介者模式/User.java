package 行为型设计模式.中介者模式;

/**
 * @author torvalds on 2018/10/7 22:46.
 * @version 1.0
 */
public abstract class User {
    Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
