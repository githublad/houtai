package com.atguigu.工厂;

import com.atguigu.工厂模式.*;
import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 13:20
 */
public class FactoryTest {

    @Test
    public void simpleFactoryTest(){
        SimpleFactory simpleFactory = new SimpleFactory();
        RouJiaMo mo = simpleFactory.getRoujiamo("普通");
        mo.order();

    }

    @Test
    public void putongfacotry(){
        AbstractFactory factory = new FeiShouFactory();
      /*  LiangCai liangCai = factory.customerChiType();
        RouJiaMo rouJiaMo = factory.customerType();
        liangCai.order();
        rouJiaMo.order();*/
        factory.cooike();

    }

}
