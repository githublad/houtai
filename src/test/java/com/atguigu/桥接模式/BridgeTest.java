package com.atguigu.桥接模式;

import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-05 13:02
 */
public class BridgeTest {

    @Test
    public void test1(){
        Brand brand = new Xiaomi();
        Phone phone = new FoldedPhone(brand);
        phone.call();

    }
}
