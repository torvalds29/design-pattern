package 行为型设计模式.迭代器模式;

/**
 * @author torvalds on 2018/10/7 17:22.
 * @version 1.0
 */

public class ArrayList implements Colletion {
    Object[] elements = new Object[16];
    int size = 0;

    public Iterator iterator() {
        return new Irt();
    }

    public void add(Object o) {
        elements[size++] = o;
    }

    public Object get(int index) {
        return elements[index];
    }

    public int size() {
        return size;
    }

    class Irt implements Iterator {
        private int pos = 0;

        public Irt() {
        }

        public Object previous() {
            if (size == 0) {
                return null;
            }
            if (pos > 0) {
                pos--;
            }
            return elements[pos];
        }

        public Object next() {
            if (size == 0) {
                return null;
            }
            int t = pos;
            if (pos < size - 1) {
                pos++;
            }
            return elements[t];
        }

        public Boolean hashNext() {
            return size > 0 && pos < size - 1;
        }

        public Object first() {
            if (size == 0) {
                return null;
            }
            Object element = elements[0];
            pos = 0;
            return element;
        }
    }
}


class ConlletionTest {
    public static void main(String[] args) {
        Colletion colletion = new ArrayList();
        colletion.add("this is a test element_one");
        colletion.add("this is a test element_two");
        colletion.add("this is a test element_three");
        colletion.add("this is a test element_four");

        Iterator iterator = colletion.iterator();
        while (iterator.hashNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

//        iterator.previous();
//        iterator.previous();
//        iterator.previous();
//        iterator.previous();
//        iterator.previous();
//        iterator.previous();
//        iterator.next();
//        iterator.next();
//        iterator.next();
//        iterator.next();
//        iterator.next();
//        iterator.next();
//        iterator.first();
    }
}