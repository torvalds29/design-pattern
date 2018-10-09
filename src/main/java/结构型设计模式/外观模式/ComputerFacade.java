package 结构型设计模式.外观模式;

/**
 * @author torvalds on 2018/10/7 14:56.
 * @version 1.0
 */

/**
 * 如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，产生关系，这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，
 * 这不是我们想要看到的，有了Computer类，他们之间的关系被放在了Computer类里，这样就起到了解耦的作用，这，就是外观模式！
 */
public class ComputerFacade {
    CPU cpu;
    Memory memory;
    Disk disk;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup() {
        System.out.println(" computer startuping ");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println(" computer startup finish ");
    }

    public void shutdown() {
        System.out.println(" computer shutdowning");
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        System.out.println("computer shutdown finish");
    }
}

class ComputerTest {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startup();
        computer.shutdown();
    }
}
