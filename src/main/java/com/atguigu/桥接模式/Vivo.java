package com.atguigu.桥接模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-05 11:28
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo open");
    }

    @Override
    public void close() {
        System.out.println("vivo close");
    }

    @Override
    public void call() {
        System.out.println("vivo call");
    }
}
