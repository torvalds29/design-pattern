package 行为型设计模式.策略模式;

/**
 * @author torvalds on 2018/10/7 16:25.
 * @version 1.0
 */
@Interval(minInterval = 0, maxInterval = 100)
public class OriginalCalPrice implements CalPrice {
    public Double calCalPrice(Double originalPrice) {
        return originalPrice;
    }
}
