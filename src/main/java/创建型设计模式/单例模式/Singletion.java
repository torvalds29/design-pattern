package 创建型设计模式.单例模式;

/**
 * @author torvalds on 2018/10/6 16:43.
 * @version 1.0
 */


public class Singletion {
    /**
     * 静态实例
     */
    private static Singletion singletion;

    /**
     * 私有化构造方法
     */
    private Singletion() {
    }

    /**
     * 获取实例，静态
     *
     * @return
     */
    public static Singletion getInstance() {
        if (singletion == null) {
            singletion = initInstance();
        }
        return singletion;
    }

    public static synchronized Singletion initInstance() {
        if (singletion == null) {
            singletion = new Singletion();
        }
        return singletion;
    }
}

class SingletionZero {
    private SingletionZero() {
    }

    public static SingletionZero getInstance() {
        return InnerSingletion.singletion;
    }

    static class InnerSingletion {
        private static SingletionZero singletion = new SingletionZero();
    }
}


class SingletionOne {
    private static SingletionOne singletion;

    private SingletionOne() {
    }

    public static SingletionOne getInstance() {
        if (singletion == null) {
            synchronized (SingletionOne.class) {
                if (singletion == null) {
                    singletion = new SingletionOne();
                }
            }
        }
        return singletion;
    }
}

class SingletionTest {
    public static void main(String[] args) {
        Singletion singletion = Singletion.getInstance();
        System.out.println("singletion = " + singletion);

        SingletionZero singletionZero = SingletionZero.getInstance();
        System.out.println("singletionZero = " + singletionZero);

        SingletionOne singletionOne = SingletionOne.getInstance();
        System.out.println("singletionOne = " + singletionOne);
    }
}

