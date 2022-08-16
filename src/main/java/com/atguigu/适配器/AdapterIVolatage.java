package com.atguigu.适配器;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-02 16:24
 */
public class AdapterIVolatage extends IVolatage220V implements IVoltage5V{
    @Override
    public int output() {
        return shuchu()/44;
    }
}
