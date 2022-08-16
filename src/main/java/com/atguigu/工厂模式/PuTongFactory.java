package com.atguigu.工厂模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 14:18
 */
public class PuTongFactory extends AbstractFactory{
    @Override
    public RouJiaMo customerType() {
        return new Putong();
    }

    @Override
    public LiangCai customerChiType() {
        return new PutongLiangCai();
    }
}
