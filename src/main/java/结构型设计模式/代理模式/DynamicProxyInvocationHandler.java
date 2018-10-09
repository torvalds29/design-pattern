package 结构型设计模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author torvalds on 2018/10/6 18:35.
 * @version 1.0
 */

/**
 * jdk动态代理
 */
public class DynamicProxyInvocationHandler implements InvocationHandler {
    Source source;

    public DynamicProxyInvocationHandler(Source source) {
        this.source = source;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" dynamic proxy before method");
        Object result = method.invoke(source, args);
        System.out.println(" dynamic proxy after method");
        return result;
    }

    public Sourceable getProxy() {
        return (Sourceable) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Sourceable.class}, this);
    }
}

class DynamicProxyTest {
    public static void main(String[] args) {
        DynamicProxyInvocationHandler dynamicProxyInvocationHandler = new DynamicProxyInvocationHandler(new Source());
        Sourceable proxy = dynamicProxyInvocationHandler.getProxy();
//        proxy.make();
        proxy.close();
    }
}
