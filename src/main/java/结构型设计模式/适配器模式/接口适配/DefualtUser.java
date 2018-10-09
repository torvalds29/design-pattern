package 结构型设计模式.适配器模式.接口适配;

/**
 * @author torvalds on 2018/10/7 14:12.
 * @version 1.0
 */
public abstract class DefualtUser implements User {
    public void speak() {
        System.out.println(" do nothing ");
    }

    public void walk() {
        System.out.println(" do nothing ");
    }

    public void listen() {
        System.out.println(" do nothing ");
    }
}
