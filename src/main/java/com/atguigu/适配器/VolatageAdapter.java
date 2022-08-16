package com.atguigu.适配器;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-02 16:29
 */
public class VolatageAdapter implements IVoltage5V{
    private IVolatage220V iVolatage220V;

    public VolatageAdapter(IVolatage220V iVolatage220V) {
        this.iVolatage220V = iVolatage220V;
    }

    @Override
    public int output() {
        return iVolatage220V.shuchu()/44;
    }
}
