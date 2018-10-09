package 行为型设计模式.职责链模式;

/**
 * @author torvalds on 2018/10/7 18:17.
 * @version 1.0
 */
public class HandleTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张明");
        Teacher teacher = new Teacher();
        teacher.setName("张霞");
        Director director = new Director();
        director.setName("陈东");
        student.setNextHandler(teacher);
        teacher.setNextHandler(director);
        student.examine();

    }
}
