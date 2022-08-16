package com.atguigu.原型;

import com.atguigu.原型模式.DeepClonableTarget;
import com.atguigu.原型模式.DeepProType;
import com.atguigu.原型模式.Sheep;
import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 15:35
 */
public class SheepTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("1号",1,"实验室1");
        Sheep sheep2 = new Sheep("2号",1,"实验室2");
        sheep1.setFriend(sheep2);
        Sheep clone =(Sheep) sheep1.clone();
        System.out.println(clone.getAddress()==sheep1.getAddress());
        System.out.println(clone);
    }

    @Test
    public void test2() throws CloneNotSupportedException {
        DeepClonableTarget deepClonableTarget = new DeepClonableTarget("涨幅达","实验室",2);
        DeepProType deepProType = new DeepProType();
        deepProType.setName("李大夫");
        deepProType.setTarget(deepClonableTarget);

        DeepProType deepProType1 =(DeepProType) deepProType.clone();
//        DeepProType deepProType1 =(DeepProType) deepProType.deepClone();
        System.out.println(deepProType1.getTarget() == deepClonableTarget);
        System.out.println(deepProType1.getTarget().getAddress() == deepClonableTarget.getAddress());
    }
}
