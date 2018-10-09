package 行为型设计模式.中介者模式;

/**
 * @author torvalds on 2018/10/7 22:46.
 * @version 1.0
 */

/**
 * 中介者模式也是用来降低类类之间的耦合的，因为如果类类之间有依赖关系的话，不利于功能的拓展和维护，因为只要修改一个对象，
 * 其它关联的对象都得进行修改。如果使用中介者模式，只需关心和Mediator类的关系，具体类类之间的关系及调度交给Mediator就行，这有点像spring容器的作用。
 */
public class Mediator {
    User buyer;
    User seller;

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public void trade() {
        buyer.work();
        seller.work();
    }
}

class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        User buyer = new Buyer(mediator);
        User seller = new Seller(mediator);
        mediator.setBuyer(buyer);
        mediator.setSeller(seller);
        mediator.trade();
    }
}
