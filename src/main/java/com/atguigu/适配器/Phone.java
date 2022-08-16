package com.atguigu.适配器;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-02 16:20
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V){

        if(iVoltage5V.output()==5){
            System.out.println("开始充电");
        }else {
            System.out.println("输入的电源不匹配");
        }
    }
}
