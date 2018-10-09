package 行为型设计模式.职责链模式;

/**
 * @author torvalds on 2018/10/7 18:10.
 * @version 1.0
 */
public class Student extends AbstractHandler {

    public void examine() {
        System.out.println("学生 " + name + " 提交请假 ");
        if (getNextHandler() != null) {
            getNextHandler().examine();
        }
    }
}
