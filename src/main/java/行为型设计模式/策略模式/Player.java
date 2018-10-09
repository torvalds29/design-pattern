package 行为型设计模式.策略模式;

/**
 * @author torvalds on 2018/10/7 16:23.
 * @version 1.0
 */

/**
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 */
public class Player {
    public void buy(Double amount) {
        CalPrice calPrice = getCalPrice(amount);
        Double price = calPrice.calCalPrice(amount);
        System.out.println(" 玩家应付价格price = " + price);
    }

    private CalPrice getCalPrice(Double amount) {
        return PriceIntervalAnalysis.getCalPrice(amount);
    }
}

class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.buy(50D);
        player.buy(500D);
        player.buy(5000D);
        player.buy(50000D);
    }
}
