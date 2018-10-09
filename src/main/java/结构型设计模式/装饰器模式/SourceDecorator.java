package 结构型设计模式.装饰器模式;

/**
 * @author torvalds on 2018/10/7 14:29.
 * @version 1.0
 */

/**
 * 装饰器模式的应用场景：
 * <p>
 * 1、需要扩展一个类的功能。
 * <p>
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * <p>
 * 缺点：产生过多相似的对象，不易排错！
 */
public class SourceDecorator implements Sourceable {
    Source source;

    public SourceDecorator(Source source) {
        this.source = source;
    }

    public void make() {
        System.out.println(" before make method ");
        source.make();
        System.out.println(" after make method ");
    }
}

class SourceDecoratorTest {
    public static void main(String[] args) {
        Sourceable sourceable = new SourceDecorator(new Source());
        sourceable.make();

    }
}
