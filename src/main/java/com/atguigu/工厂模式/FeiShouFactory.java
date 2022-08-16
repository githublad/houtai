package com.atguigu.工厂模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 14:18
 */
public class FeiShouFactory extends AbstractFactory{
    @Override
    public RouJiaMo customerType() {
        return new FeiShou();
    }

    @Override
    public LiangCai customerChiType() {
        return new FeiShouLiangCai();
    }


}
