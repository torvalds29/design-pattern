package 行为型设计模式.命令模式;

/**
 * @author torvalds on 2018/10/7 18:33.
 * @version 1.0
 */
public class CommonTest {
    public static void main(String[] args) {
        Commond commond = new TidyCommond(new Soldier());
        Commander commander = new Officer();
        commander.sendCommod(commond);
    }
}
