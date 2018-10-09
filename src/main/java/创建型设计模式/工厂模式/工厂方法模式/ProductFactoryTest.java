package 创建型设计模式.工厂模式.工厂方法模式;

/**
 * @author torvalds on 2018/10/6 20:56.
 * @version 1.0
 */
public class ProductFactoryTest {
    public static void main(String[] args) {
        ProductFactory productTVFactory = new ProductTVFactory();
        Product tv = productTVFactory.produceProduct();
        tv.showName();
        ProductFactory productControllerFactory = new ProductControllerFactory();
        Product productController = productControllerFactory.produceProduct();
        productController.showName();
    }
}
