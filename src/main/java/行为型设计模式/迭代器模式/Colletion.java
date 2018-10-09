package 行为型设计模式.迭代器模式;

/**
 * @author torvalds on 2018/10/7 17:17.
 * @version 1.0
 */
public interface Colletion {
    public Iterator iterator();

    public void add(Object o);

    public Object get(int o);

    public int size();

}
