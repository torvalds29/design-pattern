package 结构型设计模式.代理模式;

/**
 * @author torvalds on 2018/10/6 17:51.
 * @version 1.0
 * <p>
 * 代理模式的应用场景：
 * <p>
 * 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
 * <p>
 * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
 * <p>
 * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
 * <p>
 * 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 */

/**
 * 静态代理
 */
public class SourceProxy implements Sourceable {
    Source source;

    public SourceProxy() {
        source = new Source();
    }

    public void make() {
        before();
        source.make();
        after();
    }

    public void close() {
        System.out.println("不是真正关闭，归还连接池");
    }

    public void before() {
        System.out.println(" before method");
    }

    public void after() {
        System.out.println(" after method ");
    }
}

class SourceProxyTest {
    public static void main(String[] args) {
        SourceProxy sourceProxy = new SourceProxy();
        sourceProxy.make();
        sourceProxy.close();
    }
}


