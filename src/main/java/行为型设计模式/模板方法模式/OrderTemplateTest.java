package 行为型设计模式.模板方法模式;

public class OrderTemplateTest {
    public static void main(String[] args) {
        OrderTemplate orderTemplate = new EntityGoodsOrderTemplate();
        orderTemplate.createTempOrder();
    }
}