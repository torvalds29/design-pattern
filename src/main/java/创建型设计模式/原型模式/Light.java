package 创建型设计模式.原型模式;

import java.io.Serializable;

/**
 * @author torvalds on 2018/10/7 11:09.
 * @version 1.0
 */
public class Light implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
