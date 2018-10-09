package 行为型设计模式.访问者模式;

/**
 * @author torvalds on 2018/10/7 22:40.
 * @version 1.0
 */
public class OrderVisitor implements Visitor {
    public void visit(Subject subject) {
        System.out.println("访问数据 subject.getSubject() = " + subject.getSubject());
    }
}
