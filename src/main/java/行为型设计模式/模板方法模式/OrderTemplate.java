package 行为型设计模式.模板方法模式;

import java.math.BigDecimal;

/**
 * @author torvalds on 2018/10/7 16:59.
 * @version 1.0
 */

/**
 * 解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，
 * 继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用，
 */
public abstract class OrderTemplate {
    public void createTempOrder() {
        getOrderGoods();
        BigDecimal shippinFee = getShippinghFee();
        assembleTempOrder();
    }

    protected abstract void assembleTempOrder();

    protected abstract void getOrderGoods();

    protected abstract BigDecimal getShippinghFee();
}
