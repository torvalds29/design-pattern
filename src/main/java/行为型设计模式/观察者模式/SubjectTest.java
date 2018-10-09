package 行为型设计模式.观察者模式;

/**
 * @author torvalds on 2018/10/6 22:21.
 * @version 1.0
 */
public class SubjectTest {
    public static void main(String[] args) {
        MessageSubject messageSubject=new MessageSubject();
        ObserverOne observerOne = new ObserverOne();
        messageSubject.add(observerOne);
        ObserverTwo observerTwo = new ObserverTwo();
        messageSubject.add(observerTwo);
        messageSubject.revice(" this is a test message");
    }
}
