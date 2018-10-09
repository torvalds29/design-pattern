package 行为型设计模式.解释器模式;

/**
 * @author torvalds on 2018/10/7 23:20.
 * @version 1.0
 */
public class Plus implements Expression {
    public int interpret(Context context) {
        return context.getNumOne() + context.getNumTwo();
    }
}
