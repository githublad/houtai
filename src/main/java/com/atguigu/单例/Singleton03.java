package com.atguigu.单例;

/**
 * 静态内部类
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 11:08
 */
public class Singleton03 {
    private Singleton03(){
    }
    private static class innerClass{
        public static final Singleton03 singleton03 =new Singleton03();
    }
    public static Singleton03 getInstance(){
        return innerClass.singleton03;
    }

}
