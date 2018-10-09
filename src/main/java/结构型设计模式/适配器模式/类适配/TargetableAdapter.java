package 结构型设计模式.适配器模式.类适配;

/**
 * @author torvalds on 2018/10/7 13:56.
 * @version 1.0
 */

/**
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 */
public class TargetableAdapter extends Source implements Targetable {
    public void create() {
        System.out.println(" TargetableAdapter create method ");
    }
}

class TargetableAdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new TargetableAdapter();
        targetable.make();
        targetable.create();
    }
}

