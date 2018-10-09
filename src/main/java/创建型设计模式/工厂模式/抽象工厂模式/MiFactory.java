package 创建型设计模式.工厂模式.抽象工厂模式;

/**
 * @author torvalds on 2018/10/6 20:55.
 * @version 1.0
 */
public class MiFactory implements ProductFactory {

    public TV produceTV() {
        return new MiTV();
    }

    public Controller productController() {
        return new MiController();
    }
}
