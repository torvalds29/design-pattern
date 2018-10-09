package 行为型设计模式.备忘录模式;

/**
 * @author torvalds on 2018/10/7 20:09.
 * @version 1.0
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
