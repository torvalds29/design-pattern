package 创建型设计模式.工厂模式.工厂方法模式;

/**
 * @author torvalds on 2018/10/6 20:55.
 * @version 1.0
 */
public class ProductControllerFactory implements ProductFactory {
    public Product produceProduct() {
        return new ProductController();
    }
}
