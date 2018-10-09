package 行为型设计模式.职责链模式;

/**
 * @author torvalds on 2018/10/7 18:10.
 * @version 1.0
 */
public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;
    protected String name;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
