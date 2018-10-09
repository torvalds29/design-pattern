package 行为型设计模式.备忘录模式;

/**
 * @author torvalds on 2018/10/7 20:06.
 * @version 1.0
 */
public class Original {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        return new Memento(value);
    }
}
