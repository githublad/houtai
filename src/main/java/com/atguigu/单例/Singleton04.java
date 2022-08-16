package com.atguigu.单例;

/**
 * 枚举类实现
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 11:14
 */
public enum Singleton04 {
    INSTANCE;
    public void doSomethig(){
        System.out.println("业务方法");
    }
}
