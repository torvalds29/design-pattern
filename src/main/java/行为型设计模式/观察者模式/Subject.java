package 行为型设计模式.观察者模式;

/**
 * @author torvalds on 2018/10/6 22:02.
 * @version 1.0
 */
public interface Subject {
    public void add(Observer observer);

    public void del(Observer observer);

    public void revice(String message);

    public void notifyObservers(String message);
}
