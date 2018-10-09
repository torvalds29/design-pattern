package 行为型设计模式.备忘录模式;

/**
 * @author torvalds on 2018/10/7 20:07.
 * @version 1.0
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
