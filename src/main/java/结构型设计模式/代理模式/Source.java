package 结构型设计模式.代理模式;

/**
 * @author torvalds on 2018/10/6 17:50.
 * @version 1.0
 */
public class Source implements Sourceable {
    public void make() {
        System.out.println(" the original method");
    }

    public void close() {
        System.out.println(" 关闭资源");
    }
}
