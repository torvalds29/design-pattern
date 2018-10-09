package 行为型设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author torvalds on 2018/10/6 22:10.
 * @version 1.0
 */
public class MessageSubject implements Subject {
    List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void del(Observer observer) {
        observers.remove(observer);
    }

    public void revice(String message) {
        System.out.println("接收到消息 message = " + message);
        notifyObservers(message);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
