package 行为型设计模式.策略模式;

/**
 * @author torvalds on 2018/10/7 16:28.
 * @version 1.0
 */
@Interval(minInterval = 1000, maxInterval = 99999999)
public class SuperVIP implements CalPrice {
    public Double calCalPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }
}
