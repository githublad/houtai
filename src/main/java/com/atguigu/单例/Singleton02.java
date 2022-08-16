package com.atguigu.单例;

/**
 * 双重检查
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 11:04
 */
public class Singleton02 {
    private volatile static Singleton02 single02;
    private Singleton02(){
    }

    public static Singleton02 getInstance(){
        if(single02==null){
            synchronized (Singleton02.class){
                if (single02==null){
                    single02 = new Singleton02();
                }
            }
        }
        return single02;
    }
}
