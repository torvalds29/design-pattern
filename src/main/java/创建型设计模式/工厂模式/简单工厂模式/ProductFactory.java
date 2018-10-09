package 创建型设计模式.工厂模式.简单工厂模式;

/**
 * @author torvalds on 2018/10/6 20:33.
 * @version 1.0
 */
public class ProductFactory {
    public static Product produceProduct(String name) {
        if ("TV".equals(name)) {
            return new ProductTV();
        } else if ("controller".equals(name)) {
            return new ProductController();
        }
        return null;
    }
}

class FactoryTest {
    public static void main(String[] args) {
        Product tv = ProductFactory.produceProduct("TV");
        tv.showName();
        Product controller = ProductFactory.produceProduct("controller");
        controller.showName();
    }
}
