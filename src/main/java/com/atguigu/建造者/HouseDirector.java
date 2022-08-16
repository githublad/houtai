package com.atguigu.建造者;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-02 11:23
 */
public class HouseDirector {
    private AbstractHouseBuilder builder;

    public void setBuilder(AbstractHouseBuilder builder) {
        this.builder = builder;
    }

    public HouseDirector(AbstractHouseBuilder builder) {
        this.builder = builder;
    }
    public House constructHouse(){
       return builder.buildbase().buildWall().buildRoofed().buildHouse();
    }

}
