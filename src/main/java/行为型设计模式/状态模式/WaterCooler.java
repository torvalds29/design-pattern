package 行为型设计模式.状态模式;

/**
 * @author torvalds on 2018/10/7 21:35.
 * @version 1.0
 */

/**
 * 核心思想就是：当对象的状态改变时，同时改变其行为，很好理解！就拿QQ来说，有几种状态，在线、隐身、忙碌等，每个状态对应不同的操作，
 * 而且你的好友也能看到你的状态，所以，状态模式就两点：1、可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变化。
 */
public class WaterCooler {
    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void effluent() {
        state.handle();
    }

}

class WaterCoolerTest {
    public static void main(String[] args) {
        WaterCooler waterCooler = new WaterCooler();
        waterCooler.setState(new FullState());
        for (int t = 0; t < 100; t++) {
            if (t == 50) {
                waterCooler.setState(new NullState());
            }
            waterCooler.effluent();
        }
    }
}