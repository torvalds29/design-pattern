package 结构型设计模式.桥接模式;

/**
 * @author torvalds on 2018/10/7 15:17.
 * @version 1.0
 */
public class OracleConnation implements Connation {
    public void query() {
        System.out.println(" OracleConnation query method");
    }

    public void update() {
        System.out.println(" OracleConnation update method ");
    }
}
