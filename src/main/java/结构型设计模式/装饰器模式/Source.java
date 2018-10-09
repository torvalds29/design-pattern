package 结构型设计模式.装饰器模式;

/**
 * @author torvalds on 2018/10/7 14:28.
 * @version 1.0
 */
public class Source implements Sourceable {
    public void make() {
        System.out.println(" Source make method" );
    }
}
