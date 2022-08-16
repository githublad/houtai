package com.atguigu.工厂模式;

/**
 * @version 1.0
 * @author: lad
 * @createTime: 2022-08-01 15:10
 */
public abstract class LiangCai {


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
        System.out.println("准备" + type + "凉菜");
    }

    /**
     * 烹饪
     */
    private void bake() {
        System.out.println("凉拌" + type + "凉菜");
    }

    /**
     * 打包
     */
    private void box() {
        System.out.println("打包" + type + "凉菜");
    }

}
