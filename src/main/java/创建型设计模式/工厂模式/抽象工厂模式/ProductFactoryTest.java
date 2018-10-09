package 创建型设计模式.工厂模式.抽象工厂模式;

/**
 * @author torvalds on 2018/10/6 20:56.
 * @version 1.0
 */
public class ProductFactoryTest {
    public static void main(String[] args) {
        ProductFactory haierFactory = new HaierFactory();
        TV haierTV = haierFactory.produceTV();
        haierTV.showName();
        Controller haierController = haierFactory.productController();
        haierController.showName();

        ProductFactory miFactory = new MiFactory();
        TV miTv = miFactory.produceTV();
        miTv.showName();
        Controller miController = miFactory.productController();
        miController.showName();

    }
}
