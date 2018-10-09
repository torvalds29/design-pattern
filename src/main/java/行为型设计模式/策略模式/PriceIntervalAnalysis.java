package 行为型设计模式.策略模式;

/**
 * @author torvalds on 2018/10/7 16:35.
 * @version 1.0
 */
public class PriceIntervalAnalysis {
    public static CalPrice getCalPrice(Double amount) {
        for (CalPrice calPrice : CalPriceManager.getCalPrices()) {
            Interval interval = calPrice.getClass().getAnnotation(Interval.class);
            if (interval != null) {
                if (interval.minInterval() <= amount && interval.maxInterval() > amount) {
                    return calPrice;
                }
            }
        }
        return new OriginalCalPrice();
    }
}