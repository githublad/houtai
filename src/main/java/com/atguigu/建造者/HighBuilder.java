package com.atguigu.建造者;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-02 11:28
 */
public class HighBuilder extends AbstractHouseBuilder{
    @Override
    public HighBuilder buildbase() {
        System.out.println("打高楼地基");
        return this;
    }

    @Override
    public HighBuilder buildWall() {
        System.out.println("建高楼墙");
        return this;
    }

    @Override
    public HighBuilder buildRoofed() {
        System.out.println("盖高楼房子");
        return this;
    }
}
