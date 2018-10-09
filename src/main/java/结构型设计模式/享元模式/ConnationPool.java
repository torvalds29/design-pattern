package 结构型设计模式.享元模式;


import java.util.ArrayList;
import java.util.List;

/**
 * @author torvalds on 2018/10/7 15:57.
 * @version 1.0
 */

/**
 * 通过连接池的管理，实现了数据库连接的共享，不需要每一次都重新创建连接，节省了数据库重新创建的开销，提升了系统的性能！
 */
public class ConnationPool {
    List<Connation> connations = new ArrayList<Connation>();

    public ConnationPool() {
        for (int t = 0; t < 10; t++) {
            connations.add(new OracleConnation());
        }
    }

    public synchronized Connation getConnation() {
        return connations.remove(0);
    }

    public synchronized void releaseConnation(Connation connation) {
        connations.add(connation);
    }
}

class ConnationPoolTest {
    public static void main(String[] args) {
        ConnationPool connationPool = new ConnationPool();
        Connation connation = connationPool.getConnation();
        connation.query();
        connationPool.releaseConnation(connation);
    }
}
