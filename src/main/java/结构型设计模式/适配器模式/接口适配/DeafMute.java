package 结构型设计模式.适配器模式.接口适配;

/**
 * @author torvalds on 2018/10/7 14:13.
 * @version 1.0
 */

/**
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
public class DeafMute extends DefualtUser {
    @Override
    public void listen() {
        System.out.println(" I am a DeafMute, but I can listen ");
    }

    @Override
    public void walk() {
        System.out.println(" I am a DeafMute, but I can walk ");
    }
}

class DeafMuteTest {
    public static void main(String[] args) {
        User deafMute = new DeafMute();
        deafMute.speak();
        deafMute.walk();
        deafMute.listen();
    }
}

