package 行为型设计模式.命令模式;

/**
 * @author torvalds on 2018/10/7 18:31.
 * @version 1.0
 */
public class Officer implements Commander {
    public void sendCommod(Commond commond) {
        System.out.println(" 指挥者发出命令 ");
        commond.exe();
    }
}
