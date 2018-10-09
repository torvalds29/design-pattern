package 创建型设计模式.工厂模式.抽象工厂模式;

/**
 * @author torvalds on 2018/10/6 20:54.
 * @version 1.0
 */
public class HaierFactory implements ProductFactory {
    public TV produceTV() {
        return new HaierTV();
    }

    public Controller productController() {
        return new HaierController();
    }
}
