package 创建型设计模式.工厂模式.工厂方法模式;

/**
 * @author torvalds on 2018/10/6 20:54.
 * @version 1.0
 */
public class ProductTVFactory implements ProductFactory {
    public Product produceProduct() {
        return new ProductTV();
    }
}
