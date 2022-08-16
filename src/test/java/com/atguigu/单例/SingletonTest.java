package com.atguigu.单例;

import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 11:18
 */
public class SingletonTest {

    @Test
    public void test1(){
        Singleton04 singleton04 = Singleton04.INSTANCE;
        singleton04.doSomethig();
    }
}
