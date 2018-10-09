package 结构型设计模式.桥接模式;

/**
 * @author torvalds on 2018/10/7 15:10.
 * @version 1.0
 */
public abstract class ConnationBrige {
    Connation connation;

    public ConnationBrige(Connation connation) {
        this.connation = connation;
    }

    public Connation getConnation() {
        return connation;
    }

    public void setConnation(Connation connation) {
        this.connation = connation;
    }

    public void query() {
    }

    public void update() {
    }
}
