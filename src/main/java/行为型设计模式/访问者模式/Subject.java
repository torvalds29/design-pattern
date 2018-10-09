package 行为型设计模式.访问者模式;

/**
 * @author torvalds on 2018/10/7 22:09.
 * @version 1.0
 */
public interface Subject {
    public void access(Visitor visitor);

    public String getSubject();
}
