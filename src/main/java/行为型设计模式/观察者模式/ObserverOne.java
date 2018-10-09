package 行为型设计模式.观察者模式;

/**
 * @author torvalds on 2018/10/6 22:19.
 * @version 1.0
 */
public class ObserverOne implements Observer {
    public void update(String message) {
        System.out.println(" I am  ObserverOne,I known subject recive" + message);
    }
}
