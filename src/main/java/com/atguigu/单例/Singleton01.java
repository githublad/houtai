package com.atguigu.单例;

/**
 * 饿汉模式
 *类注释
 * 类加载时即会 创建对象
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 10:57
 */
public class Singleton01 {
    //饿汉模式
    //设计模式1
    private Singleton01(){
    }
    private static  Singleton01 Singleton01 = new Singleton01();
    public static Singleton01 getInstance(){
        return Singleton01;
    }
}
