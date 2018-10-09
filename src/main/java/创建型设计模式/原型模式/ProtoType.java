package 创建型设计模式.原型模式;

import java.io.*;

/**
 * @author torvalds on 2018/10/7 11:03.
 * @version 1.0
 */
public class ProtoType implements Cloneable,Serializable {
    private String name;
    Light light;

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 浅克隆
     *
     * @return
     */
    @Override
    public ProtoType clone() {
        try {
            return (ProtoType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ProtoType deepClone() {

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            byte[] objByte = byteArrayOutputStream.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(objByte);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (ProtoType) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

class CopyTest {


    public static void main(String[] args) {
        ProtoType protoType = new ProtoType();
        protoType.setName("test proto");
        Light light = new Light();
        light.setName("LDE light");
        protoType.setLight(light);
        ProtoType cloneProtoType = protoType.clone();

        System.out.println("cloneProtoType = " + cloneProtoType+",Light= "+light);
        System.out.println("cloneProtoType.getName() = " + cloneProtoType.getName());
        System.out.println("cloneProtoType.getLight() = " + cloneProtoType.getLight());

        ProtoType deepCloneProtoType = protoType.deepClone();
        System.out.println("deepCloneProtoType = " + deepCloneProtoType);
        System.out.println("deepCloneProtoType.getName() = " + deepCloneProtoType.getName());
        System.out.println("deepCloneProtoType.getLight() = " + deepCloneProtoType.getLight());

    }
}
