package 行为型设计模式.解释器模式;

/**
 * @author torvalds on 2018/10/7 23:22.
 * @version 1.0
 */
public class ExpressionTest {
    public static void main(String[] args) {
        int result = new Minus().interpret(new Context(10, new Plus().interpret(new Context(1, 1))));
        System.out.println("result = " + result);
    }
}
