package com.atguigu.原型模式;

import java.io.*;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 16:04
 */
public class DeepProType implements Serializable,Cloneable {
    private String name;
    private DeepClonableTarget target;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepClonableTarget getTarget() {
        return target;
    }

    public void setTarget(DeepClonableTarget target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "DeepProType{" +
                "name='" + name + '\'' +
                ", target=" + target +
                '}';
    }

    @Override
    public DeepProType clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        DeepProType deep = (DeepProType) clone;
        DeepClonableTarget clonableTarget = (DeepClonableTarget)target.deepClone();
        deep.target = clonableTarget;
        return  deep;

    }


    public Object deepClone(){
        ByteArrayInputStream byteArrayInputStream=null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream =null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            //反序列化
             byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object o = objectInputStream.readObject();
            return o;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
