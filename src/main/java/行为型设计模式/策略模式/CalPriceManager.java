package 行为型设计模式.策略模式;

import java.util.Arrays;
import java.util.List;

/**
 * @author torvalds on 2018/10/7 16:29.
 * @version 1.0
 */
public class CalPriceManager {
    private static List<CalPrice> calPrices = Arrays.asList(new OriginalCalPrice(), new VIP(), new SuperVIP());

    public static List<CalPrice> getCalPrices() {
        return calPrices;
    }
}
