package 行为型设计模式.命令模式;

/**
 * @author torvalds on 2018/10/7 18:29.
 * @version 1.0
 */
public class Soldier implements Receiver {
    public void action(Commond commond) {
        System.out.println(" 士兵接收到命令 Commond=" + commond);

    }
}
