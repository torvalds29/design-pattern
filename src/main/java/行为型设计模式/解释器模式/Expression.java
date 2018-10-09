package 行为型设计模式.解释器模式;

/**
 * @author torvalds on 2018/10/7 23:18.
 * @version 1.0
 */

/**
 * 解释器模式（Interpreter），给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 * 函数式编程
 */
public interface Expression {
    public int interpret(Context context);
}
