package com.atguigu.建造;

import com.atguigu.建造者.HighBuilder;
import com.atguigu.建造者.House;
import com.atguigu.建造者.HouseDirector;
import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-02 13:20
 */
public class BuilderTest {
    @Test
    public void test(){
        HouseDirector houseDirector = new HouseDirector(new HighBuilder());
        House house = houseDirector.constructHouse();

    }
}
