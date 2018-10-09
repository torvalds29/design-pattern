package 行为型设计模式.备忘录模式;

/**
 * @author torvalds on 2018/10/7 20:11.
 * @version 1.0
 */
public class MementoTest {
    public static void main(String[] args) {
        Original original = new Original();
        original.setValue("original value");
        Memento memento = original.createMemento();
        Storage storage = new Storage(memento);
        System.out.println("original.getValue() = " + original.getValue());
        original.setValue("modify value");
        System.out.println("original.getValue() = " + original.getValue());
        original.setValue(storage.getMemento().getValue());
        System.out.println("original.getValue() = " + original.getValue());
    }
}
