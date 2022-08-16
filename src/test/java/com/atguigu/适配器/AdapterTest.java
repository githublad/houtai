package com.atguigu.适配器;

import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-02 16:25
 */
public class AdapterTest {
    @Test
    public void test1(){
        Phone phone = new Phone();
        phone.charging(new AdapterIVolatage());
    }

    /**
     * 对象适配器，将适配器的集成接口和src类，改为集成接口并持有src类
     */
    @Test
    public void test2(){
        Phone phone = new Phone();
        phone.charging(new VolatageAdapter(new IVolatage220V()));
    }
}
