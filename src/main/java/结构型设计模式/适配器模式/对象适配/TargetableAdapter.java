package 结构型设计模式.适配器模式.对象适配;


/**
 * @author torvalds on 2018/10/7 14:04.
 * @version 1.0
 */

/**
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 */
public class TargetableAdapter implements Targetable {
    Source source;

    public TargetableAdapter(Source source) {
        this.source = source;
    }

    public void make() {
        source.make();
    }

    public void create() {
        System.out.println(" TargetableAdapter create method ");
    }
}


class TargetableAdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new TargetableAdapter(new Source());
        targetable.make();
        targetable.create();
    }
}