package 行为型设计模式.解释器模式;

/**
 * @author torvalds on 2018/10/7 23:19.
 * @version 1.0
 */
public class Context {
    private int numOne;
    private int numTwo;

    public Context(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }
}
