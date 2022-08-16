package com.atguigu.桥接模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-05 11:28
 */
public class Xiaomi implements Brand{
    @Override
    public void open() {
        System.out.println("xiaomi open");
    }

    @Override
    public void close() {
        System.out.println("xiaomi close");
    }

    @Override
    public void call() {
        System.out.println("xiaomi call");
    }
}
