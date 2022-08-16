package com.atguigu.建造者;

/**
 * @version 1.0
 * @author: lad
 *
 * @createTime:  2022-08-02 11:26
 */
public abstract class AbstractHouseBuilder {
    private House house = new House();
    public abstract AbstractHouseBuilder buildbase();
    public abstract AbstractHouseBuilder buildWall();
    public abstract AbstractHouseBuilder buildRoofed();
    public  House buildHouse(){
        return house;
    }
}
