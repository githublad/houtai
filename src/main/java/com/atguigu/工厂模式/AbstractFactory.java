package com.atguigu.工厂模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 14:14
 */
public abstract class AbstractFactory {
    public abstract RouJiaMo customerType();
    public abstract LiangCai customerChiType();

    public void cooike(){
        customerType().order();
        customerChiType().order();
    }
}
