package com.atguigu.工厂模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 11:29
 */
public abstract class RouJiaMo {

    private String type;

    /**
     * 订单型号
     */
    public abstract String orderType();

    /**
     * 定制
     */
    public void order() {
        type = orderType();
        prepare();
        bake();
        box();
    }

    /**
     * 准备
     */
    private void prepare() {
        System.out.println("切烧饼");
        System.out.println("准备" + type + "肉");
    }

    /**
     * 烹饪
     */
    private void bake() {
        System.out.println("夹入" + type + "肉");
    }

    /**
     * 打包
     */
    private void box() {
        System.out.println("打包" + type + "型肉夹馍");
    }
}
