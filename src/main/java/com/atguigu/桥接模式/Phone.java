package com.atguigu.桥接模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-05 11:14
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }
    protected void open(){
        brand.open();
    }
    protected void close(){
        brand.close();
    }
    protected void call(){
        brand.call();
    }
}
