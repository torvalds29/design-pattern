package 行为型设计模式.职责链模式;

/**
 * @author torvalds on 2018/10/7 18:10.
 * @version 1.0
 */
public class Teacher extends AbstractHandler {

    public void examine() {
        System.out.println(name + " 老师审批申请 ");
        if (getNextHandler() != null) {
            getNextHandler().examine();
        }
    }
}
