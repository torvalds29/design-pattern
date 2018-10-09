package 结构型设计模式.桥接模式;

/**
 * @author torvalds on 2018/10/7 15:19.
 * @version 1.0
 */
public class ConnationBrigeImpl extends ConnationBrige {
    public ConnationBrigeImpl(Connation connation) {
        super(connation);
    }

    public void query() {
        getConnation().query();
    }

    public void update() {
        getConnation().update();
    }
}
class ConnationBrigeTest{
    public static void main(String[] args) {
        ConnationBrige oracleConationBrige=new ConnationBrigeImpl(new OracleConnation());
        oracleConationBrige.query();
        oracleConationBrige.update();
        ConnationBrige mysqlConnationBrige=new ConnationBrigeImpl(new MysqlConnation());
        mysqlConnationBrige.query();
        mysqlConnationBrige.update();
    }
}