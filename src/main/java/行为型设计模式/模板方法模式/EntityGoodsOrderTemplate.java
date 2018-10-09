package 行为型设计模式.模板方法模式;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author torvalds on 2018/10/7 17:03.
 * @version 1.0
 */
public class EntityGoodsOrderTemplate extends OrderTemplate {
    @Override
    protected void assembleTempOrder() {
        System.out.println(" 组装临时订单");
    }

    @Override
    protected void getOrderGoods() {
        System.out.println(" 获取订单商品 ");
    }

    protected BigDecimal getShippinghFee() {
        System.out.println(" 获取订单运费");
        return new BigDecimal(Math.abs(new Random().nextDouble()));
    }
}



