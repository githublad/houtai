package com.atguigu.桥接模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-05 11:13
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);

    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠样式开");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠样式关");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠样式打电话");

    }
}
