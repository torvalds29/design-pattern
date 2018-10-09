package 行为型设计模式.访问者模式;

/**
 * @author torvalds on 2018/10/7 22:39.
 * @version 1.0
 */

/**
 * 该模式适用场景：如果我们想为一个现有的类增加新功能，不得不考虑几个事情：
 * 1、新功能会不会与现有功能出现兼容性问题？
 * 2、以后会不会再需要添加？
 * 3、如果类不允许修改代码怎么办？面对这些问题，最好的解决方法就是使用访问者模式，访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦，
 */
public class DataSubject implements Subject {
    public void access(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSubject() {
        return "love data";
    }
}

class SubjectTest {
    public static void main(String[] args) {
        Visitor visitor = new OrderVisitor();
        Subject subject = new DataSubject();
        subject.access(visitor);
    }
}